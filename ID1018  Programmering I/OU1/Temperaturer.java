import java.util.*; // Scanner, Locale
class Temperaturer
{
	 private static final Object[][] md = null;

	 public static void main (String[] args)
	 {
		 System.out.println ("TEMPERATURER\n");

		 // inmatningsverktyg
		 Scanner in = new Scanner (System.in);
		 in.useLocale (Locale.US);


		 // mata in uppgifter om antalet veckor och antalet m?tningar
		 System.out.print ("antalet veckor: ");
		 int antalVeckor = in.nextInt ();
		 System.out.print ("antalet mätningar per vecka: ");
		 int antalMatningarPerVecka = in.nextInt ();  


		 // plats att lagra temperaturer
		 double[][] t = new double[antalVeckor + 1][antalMatningarPerVecka + 1];


		 // mata in temperaturerna
		 for (int vecka = 1; vecka <= antalVeckor; vecka++)
		 {
			 System.out.println ("temperaturer - vecka " + vecka + ":");
			 for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
			 t[vecka][matning] = in.nextDouble ();
		 }
		 System.out.println ();


		 // visa temperaturerna
		 System.out.println ("temperaturerna:");
		 for (int vecka = 1; vecka <= antalVeckor; vecka++)
		 {
			 for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
			 System.out.print (t[vecka][matning] + " ");
			 System.out.println ();
		 }
		 System.out.println ();


		 // den minsta, den största och medeltemperaturen  veckovis
		 double[] minT = new double[antalVeckor + 1];
		 double[] maxT = new double[antalVeckor + 1];
		 double[] sumT = new double[antalVeckor + 1];
		 double[] medelT = new double[antalVeckor + 1];

		  // koden ska skrivas här
			System.out.println ("veckan  |  " + "Den minsta |  " + " Den största | " + 
		  " summan av temperturerna | " + "Medeltempraturen för veckovis:" );
			
		 for (int vecka = 1; vecka < t.length; vecka++)
		 {
			 minT [vecka] = t[vecka][1];
			 for (int matning = 1; matning  < t[vecka].length; matning++)
			 {
			     if (t[vecka][matning] < minT[vecka])
					minT [vecka] = t[vecka][matning];
				 if (t[vecka][matning] > maxT[vecka])
					 maxT [vecka] = t[vecka][matning];
				  sumT  [vecka] += t[vecka][matning];
				  medelT[vecka] = sumT [vecka] / (t[vecka].length - 1);
			 }

			// visa den minsta, den största och medeltemperaturen för varje vecka
		  		System.out.print( vecka + " 		" + minT[vecka] + "		 " + maxT[vecka]
		  		+  " 		" + sumT[vecka] + " 				" + medelT[vecka] );
		  		System.out.println ();
		 }
		 System.out.println ();

		  // den minsta, den största och medeltemperaturen - hela mätperioden
		  double minTemp = minT[1];
		  double maxTemp = maxT[1];
		  double sumTemp = sumT[1];
		  double medelTemp = 0;

		  // koden ska skrivas här
		  //gjorde att skriva kommentar här innan loopen för att undevika att uppreppa det utskrivtning igen och igen.
		  System.out.println ("Minsta tempratoren | " + " största tempratoren  | " +
		  "summan av tempratorena  | " + 
				  "medel tempratoren för hela perioden:" );
		  
		  //for lopp för hela perioden 
		  for (int vecka = 2; vecka <= antalVeckor; vecka++)
		  { 
			//logik för att går igenom hela mätningar om det hittar något mindre
			//än de som vi hade tidigare  så tar  det istället 
				if (minT[vecka] < minTemp)
					minTemp = minT[vecka];
					 
					  //logik för att går igenom hela mätningar om det hittar något större 
					 //än de som vi hade tidigare  så tar  det istället 
				if (maxT[vecka]> maxTemp)
					maxTemp = maxT[vecka];
				sumTemp = sumTemp + sumT[vecka];
		  	}
		  //logik för att kunna ta reda på den medel Temperatiren för hela perioden 
		  	int antalmatning = antalVeckor * antalMatningarPerVecka;
		  	medelTemp = sumTemp / antalmatning;
			System.out.println (minTemp + "				" + maxTemp +
						" 			" + sumTemp + "			 " + medelTemp);
	 }
	 
}
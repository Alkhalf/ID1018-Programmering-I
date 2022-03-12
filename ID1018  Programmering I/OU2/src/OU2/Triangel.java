package OU2;
/******************************************
 * Ett klass som har flera beräkning för triangle 
 * @author ahmed
 *
 ******************************************/
public class Triangel {
	//test metod för att se om resultate är rätt

	
	//omkrets bärekning; användare ska mata in 3 längd sidor av tringal 
	//och sedan för trinaglomkrets retunerad 
	public static double omkrets (double length1, double length2, double length3)
	{
		double tringalomkrets = length1 + length2 + length3;
		return tringalomkrets;	
	}
	
	//bärkning area; använadre ska ange base och höjden av triangle 
	//ovh sedan får trianglaren retuenerad.
	public static double area (double bas, double hojden) 
	{
		double trianglearea = (bas * hojden)/2;
		return  trianglearea;
	}

	//bärekning median; användare ska mate in de tre sidor av tringle 
	//oche sedan får midanen för den tredje sidan som användare matar in. 
	public static double median (double sidanA, double sidanB,  double sidanC ) 
	{
		double medium = Math.sqrt(((2* sidanA * sidanA )+ (2 * sidanB * sidanB) - (sidanC * sidanC)));
		double medianC = medium  / 2;
		return  medianC;
	}
	
	//bärekning bisektris; användare ska mata in två sidor och  vinkel som är mellan de två
	//och sedan får bisktrisen för längden av motsvarandebisektris 
	public static double biskrets (double sidanA, double sidanB,  double vinkelAB) 
	{
		double bis =  2 * sidanA * sidanB * Math.cos ( vinkelAB / 2);
		double bisektrisAB = bis  / (sidanA + sidanB);
		return  bisektrisAB;
	}
	
	//bärekning arean med tre givna sidor
	//användare ska mata in  3 sidor av triangle och får retunerade arean av triangle
	public static double area3Sidor (double sidanA, double sidanB,  double sidanC) 
	{
		double S = ( (sidanA + sidanB  + sidanC)/2) ;
		double areanav3sidor = Math.sqrt( S * (S - sidanA) * (S - sidanB) * (S - sidanC) );
		return areanav3sidor ;
	}
	
	//omskrivnacirkel beräkning; 
	//användare ska mata in 3 sidor av tringaloch sedan för retunerade 
	//radian för  denna omskrivna cirkel dvs cirkel som utanför denna triangle 
	public static double omskrivnacirkel (double sidanA, double sidanB,  double sidanC) 
	{
		double S = ( (sidanA + sidanB  + sidanC)/2) ;
		double namnare = 4 * (Math.sqrt( S * (S - sidanA) * (S - sidanB) * (S - sidanC) ) );
		double omRadian = ((sidanA * sidanB  * sidanC) / namnare );
		return omRadian ;
	}
	
	// inskrivnacirkel beräkning; 
	// användare ska mata in 3 sidor av tringaloch sedan för retunerade 
	// radian för  denna inskrivna cirkel dvs cirkel som är inut i denna triangle 
	public static double inskrivnacirkel (double sidanA, double sidanB,  double sidanC) 
	{
		double S = ( (sidanA + sidanB  + sidanC)/2) ;
		double inRadian = Math.sqrt( ( (S - sidanA) * (S - sidanB) * (S - sidanC) ) / S );
		return inRadian ;
	}	
}

package OU5;


import java.util.Random;

public class valjPolylinje 
{
    public static final Random rand = new Random();
    public static final int ANTAL_POLYLINJER = 10;

    public static void main(String[] args) 
    {
        // skapa ett antal slumpmässiga polylinjer 
        Polylinje[] polylinjer = new Polylinje[ANTAL_POLYLINJER];

        for (int i = 0; i < ANTAL_POLYLINJER; i++)
            polylinjer[i] = slumpPolylinje();

        for(int i = 0; i < polylinjer.length; i++)
        System.out.println("Polylinje: " + polylinjer[i] + "\n langd: " + polylinjer[i].langd () );

        // bestäm den kortaste av de polylinjer som är gula
		Polylinje kortast = polylinjer[0];
		for(int i = 0; i < polylinjer.length; i++)
			if ( polylinjer[i].getFarg() == "gul" && ( polylinjer[i].langd() < kortast.langd() || kortast.getFarg() != "gul" ) )
				kortast = polylinjer[i];       
		
        // visa den valda polylinjen
		if (kortast.getFarg() != "gul")
			System.out.println("Kortaste gula polylinjen: \n Det saknas gula polylinjer!");
		else
			System.out.println("Kortaste gula polylinjen: \n " + kortast +"\n langd: "+ kortast.langd());
        
    }

    
    // slumpPunkt returnerar en punkt med ett slumpmässigt namn, som är en stor bokstav i
    // det engelska alfabetet, och slumpmässiga koordinater.
    public static Punkt slumpPunkt() 
    {
        String n = "" + (char) (65 + rand.nextInt(26));
        int x = rand.nextInt(11);
        int y = rand.nextInt(11);

        return new Punkt(n, x, y);
    }


    // slumpPolylinje returnerar en slumpmässig polylinje, vars färg är antingen blå, eller röd
    
    // eller gul. Namn på polylinjens hörn är stora bokstäver i det engelska alfabetet. Två hörn
    
    // kan inte ha samma namn.
	public static Polylinje slumpPolylinje () 
	{
		// skapa en tom polylinje, och lägg till hörn till den
		Polylinje polylinje = new Polylinje ();
		int antalHorn = 2 + rand.nextInt (7);
		
		// ett och samma namn kan inte förekomma flera gånger
		char valtNamn[] = new char[antalHorn];
		
		for (int i = 0; i < antalHorn; i++) 
		{
			boolean Available = !true;
			Punkt p = new Punkt(slumpPunkt());
			
			//While loop för kontolera om ett namn upprepas 
			while (!Available) 
			{
				Available = true;
					for(char n = 0; n < valtNamn.length; n++)
					if (p.getNamn().toCharArray()[0] == n) 
					{
						Available = false;
						break;
					} 
					else if (n == valtNamn[antalHorn - 1] || !Available)
						break ;
				
				if (!Available) 
					//generate new name and retry
					p = new Punkt(slumpPunkt());
			}
			
			valtNamn[i] = p.getNamn().toCharArray()[0];
			polylinje.laggTill(p);
		}
		// sätt färg
		String farger[] = {"gul","rod","bla"};
		polylinje.setFarg(farger[rand.nextInt(3)]);
		
		return polylinje;
    }

}

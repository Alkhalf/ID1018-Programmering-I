package OU5;

public class Polylinje {

    Punkt[] horn;
    private String farg = "svart";
    private int bredd = 1;

    public Polylinje() {

        this.horn = new Punkt[0];

    }
    

    public Polylinje(Punkt[] horn) {
        this.horn = new Punkt[horn.length];
        for (int i = 0; i < horn.length; i++)
            this.horn[i] = new Punkt(horn[i]);
    }

    // Omvandla
    public String toString() {
        StringBuilder sb = new StringBuilder("{ [");
        for (int i = 0; i < horn.length; i++)
            sb.append(horn[i]);
        sb.append("], " + farg + "," + bredd + "}");
        return sb.toString();

    }


    public Punkt[] getHorn() {

        Punkt[] h = new Punkt[horn.length];
        for (int i = 0; i < horn.length; i++)
            h[i] = new Punkt(horn[i]);
        return h;

    }

    public String getFarg() {
        return farg;
    }

    public int getBredd() {
        return bredd;
    }

    public void setFarg(String farg) {

        this.farg = farg;
    }

    public void setBredd(int bredd) {
        this.bredd = bredd;
    }

    public double langd() {
        double len = 0;
        for (int i = 0; i < horn.length - 1; i++)
            len = len + horn[i].avstand(horn[i + 1]);

        return len;

    }

   // lägg till ett givet hörn till linjen
    public void laggTill (Punkt horn)

    {
        Punkt[] h = new Punkt[this.horn.length + 1];
        int i = 0;
        for (i = 0; i < this.horn.length; i++)
            h[i] = this.horn[i];
        h[i] = new Punkt (horn);

        this.horn = h;
    }



     //lägg till en hörn till linje
    public void laggTillFramfor (Punkt horn, String hornNamn) {
        //bestäm position för hörn som har namn
        int pos = 0;
        while (pos < this.horn.length && (!this.horn[pos].getNamn().equals(hornNamn)))
            pos++;
        // om hörnet har inget namn
        if(!(pos<this.horn.length))
            return;
        // lägg till hörn på rätt plats
        Punkt [] h = new Punkt[this.horn.length + 1];
        int i = 0;
        while (i<pos)
        {
            h[i] = this.horn[i];
            i++;
        }
        h[i] = new Punkt(horn);
        while (i<this.horn.length){
            h[i+1] = this.horn[i];
            i++;
        }
        this.horn = h;

    }


    // Ta bort hörnet som har namn
     public  void taBort (String hornNamn)
     {
         //bestäm position för hörnet
         int pos = 0;
         while (pos<this.horn.length  && !this.horn[pos].getNamn ().equals(hornNamn) )
             pos++;
         //om hörnet har inget namn
         if (!(pos<this.horn.length))
             return;
         //ta bort hörnet
         Punkt[] h = new Punkt[this.horn.length-1];
         int i = 0;
         while (i<pos){
             h[i] = this.horn[i];
             i++;
         }
         i = pos + 1;
         while (i<this.horn.length)
         {
             h[i-1] = this.horn[i];
             i++;
         }
         this.horn = h;
     }








public class PolylinjeIterator 
{
	private int aktuell = -1;
	
	public PolylinjeIterator () 
	{
		if (Polylinje.this.horn.length > 0) 
			aktuell = 0;
		
	}
	
	public boolean finnsHorn () 
	{
		return aktuell != -1; 
	}
	
	public Punkt horn () throws java.util.NoSuchElementException 
	{
		if (!this.finnsHorn ())
		throw new java.util.NoSuchElementException ("slut av iterationen");
		Punkt horn = Polylinje.this.horn[aktuell];
		return horn; 
	}
	
	public void gaFram () 
	{
		if (aktuell >= 0 && aktuell < Polylinje.this.horn.length - 1) aktuell++;
		else
		aktuell = -1;
	}
}


}




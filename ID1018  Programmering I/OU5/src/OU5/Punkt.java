package OU5;

//class för att räkna PunktTest
public class Punkt {

  int x ;
  int y ;
  String n ;
// Värde på x,y och n
  Punkt (String n ,int x , int y)
  {
      this.x = x ;
      this.y = y ;
      this.n = n ;
  }
  //Returnerar punktens x-koordinat
  public int getX () {
      return x ;
  }
	//Returnerar y-koordinaten för punkten
    public int getY () {
        return y ;
    }
    //Returnerar till n
    public String getNamn () {
        return n ;
    }
    //Beräknar avståndet från origo
    double avstand ()
    {
        return Math.sqrt ((x * x ) + (y * y)) ;
    }
    //Beräknar avståndet mellan denna punkt och punkt p.
    double avstand (Punkt p)
    {
        double d = 0 ;
        d = Math.sqrt ((p.x-this.x)*(p.x-this.x) + (p.y-this.y)*(p.y-this.y)) ;
        return d ;
    }
    //Ändrar punkten för att ha den angivna platsen.
    public void setX (int x) {
      this.x = x ;
    }

    public void setY (int y) {
        this.y = y ;
    }

    Punkt (Punkt p)
    {
      this.x = p.x ;
      this.y = p.y ;
      this.n = p.n ;
    }

    public String toString() {
      String s = " ";
      s = "(" + x + ", " + y + " )" ;
      return s;
    }
}


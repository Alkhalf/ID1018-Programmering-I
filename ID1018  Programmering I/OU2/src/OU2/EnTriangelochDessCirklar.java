/***********************************
 * Ett klass som skrivar ut olika triangel beräkningar
 * enligt att importera beräkning fonktion från Triangel klass
 ***********************************/
package OU2;



public class EnTriangelochDessCirklar 
{
	public static void main(String []args) 
	{
		java.util.Scanner in = new java.util.Scanner (System.in);
		
		System.out.println("Mata in 3 sidor av triangel för att få triangel omkrets");
		double omkrets =  Triangel.omkrets (in.nextDouble() , in.nextDouble() , in.nextDouble());
		
		System.out.println("Mata in basen och höjden för Rättvinkligstriangel för att få triangel area");
		double arean =  Triangel.area (in.nextDouble() , in.nextDouble());
		
		System.out.println("Mata in 3 sidor av triangel för att få triangel omkrets");
		double medianen =  Triangel.median (in.nextDouble() , in.nextDouble() , in.nextDouble());

		System.out.println("Mata in två sidor av triangel och vinklen mellan de för att få biskretsen från denna vinkel");
		System.out.println("OBS: vinklen ska vara på radian enheten");
		double biskretsen = Triangel. omkrets (in.nextDouble() , in.nextDouble() , in.nextDouble());
		
		System.out.println("Mata in tre sidor av likaben eller liksidig triangel för att få dess area");
		double areanav3sidor = Triangel. area3Sidor (in.nextDouble() , in.nextDouble() , in.nextDouble());	
		
		System.out.println("Mata in tre sidor av triangel för att få radian för denna omskrivna cirkel runt om trianglen");
		double omRadian  = Triangel. omskrivnacirkel (in.nextDouble() , in.nextDouble() , in.nextDouble());
		
		System.out.println("Mata in tre sidor av triangel för att få radian för denna inskrivna cirkel inut i denna trianglen");
		double inRadian  =  Triangel.inskrivnacirkel (in.nextDouble() , in.nextDouble() , in.nextDouble());
		
		System.out.println("Omkretsen för triangel är " + omkrets );
		System.out.println("arean är  " + arean);
		System.out.println("median för C " + medianen);
		System.out.println("biskrets AB " + biskretsen);
		System.out.println("biskrets AB " + biskretsen);
		System.out.println("Arean med tre sidor " + areanav3sidor );
		System.out.println("Radianen för den omskrivna cirkel " + omRadian );
		System.out.println("Radianen för den inskrivna cirkel " + inRadian );
	}
}


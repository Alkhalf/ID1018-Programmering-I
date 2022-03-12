package OU3;
 class DenKortasteVagen 
 {
	// mellanstationer returnerar en vektor med de mellanstationersom finns på den kortaste
	// vägen. Ordningsnummerav den förstamellanstationen finns på index1, ochordningsnummer
	//avden andra mellanstationen på index2 i vektorn.
	public static  int[]  mellanstationerna (double[] a, double[][] b, double []c)
	{
		//deklerera mellanstitoner för den kortaste vägen som vektor 
		int mellanstationer[] = {1,1};
		//deklerera minsta avståndet 
		double min = a[1]+ b[1][1]+c[1];
		//loop för att gå igenom alla vägger som möiljga 
		//det går igenom alla längdar som mellan station x och stationerna i zon2
		for (int i = 1; i <= a.length - 1; i++ )
			{
				//det går igenom alla längdar från  mellanstationerna i zon 2 och stationerna i zon 3 
				for (int j = 1; j <= c.length -1; j++)
				{
					//Jämföra alla möiljga längder och upptedera minsta värdet.
					if (min > a[i]+ b[i][j] + c[j])
					{
						min = a[i]+ b[i][j] + c[j];
						//deklerera mellanstationerna för det kortaste vägan
		            	mellanstationer [0] = i;
		            	mellanstationer [1] = j;
					}
		    	 }
			}
			return mellanstationer ;
	}
	// langd returnerar längden av den kortaste vägen.
	public static double langd (double[] a, double[][] b, double[] c)
	{
		int[] mellanstationer =  mellanstationerna (a, b, c);
	    double lang = ( (a[mellanstationer[0]]) + 
	        	(b[mellanstationer[0]][mellanstationer[1]]) + (c[mellanstationer[1]]) );
	    return lang;
	}
 }

public class EU2 {

	public static void sort(int[] seq) 
	{	
		int 	minPos=0;
		int 	i=0;
		
		for (int pos=0; pos < seq.length-1; pos++)
		{	
			
		minPos=pos;	
		for(int p= pos+1; p < seq.length; p++)
			if (seq[p] < seq[minPos])
				minPos=p;	
				
		if(minPos != pos )
				{
					i=seq[pos];
					seq[pos]=seq[minPos];
					seq [minPos]=i;
				}
		}
		System.out.println(java.util.Arrays.toString(seq));
	}
}

package Programs;

import java.util.HashSet;

public class commonelements {

	public static void main(String[] args)
	{

		String[] Array1 = {"Article", "for", "Geeks","monish"};
		String[] Array2 = {"Article", "Geeks", "Geeks","mouni"};
		
		HashSet<String>set=new HashSet();
		
		for(int i=0;i<Array1.length;i++)
		{
			
			for(int j=0;j<Array2.length;j++)
			{
				if(Array1[i]==Array2[i])
				set.add(Array1[i]);
			}
			
		}
		
		for(String str:set)
		{
        System.out.println(str + " ");
		}
				
	}

}

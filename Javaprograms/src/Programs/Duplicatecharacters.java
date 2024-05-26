package Programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Duplicatecharacters {

	public static void main(String[] args)
	{
		String str="anaganamugrtyui";
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				int count=map.get(str.charAt(i));
				map.put(str.charAt(i), ++count);
				
			}
			else 
			{
				map.put(str.charAt(i),1);
			}
			
			
		}
		
		System.out.println(map);
		
		for(Character key:map.keySet())
		{
			if(map.get(key)>1)
			{
			System.out.println(key+".."+map.get(key));
			}
		}
			

	}

}

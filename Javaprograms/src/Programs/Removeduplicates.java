package Programs;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicates {
	
	public static void removedup(String word)

	{
		
		LinkedHashSet<Character>set=new LinkedHashSet<>();
		for(int i=0;i<word.length();i++)
		{
			set.add(word.charAt(i));
		}
		
		for(Character ch:set)
		{
			System.out.println(ch);
			
		
		}
	}
	public static void main(String[] args) 
	{
        String str = "javaTpoint is the best learning website";   
        removedup(str);

	}

}

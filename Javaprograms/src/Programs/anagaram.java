package Programs;

import java.util.Arrays;

public class anagaram {

	public static void main(String[] args) 
	{

 String str1="army";
 String str2="mary";
 
 char[] ch1=str1.toLowerCase().toCharArray();
 char[] ch2=str2.toLowerCase().toCharArray();
 
 Arrays.sort(ch1);
 Arrays.sort(ch2);
 
if( Arrays.equals(ch1, ch2))
{
	System.out.println("given strings are anagram");
}
else
{
	System.out.println("given strings are NOT anagram");
}
 
		
		
		
	}

}

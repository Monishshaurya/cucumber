package Programs;

import java.util.Stack;

public class reversesentence {
	
	
	static String sentence="";
	public static void main(String[] args) 
	{
		
		String str="my name is Mounika";
		reversesentence(str);
		

	}

	 static void reversesentence(String str)
	 {
		 
		String[]array=str.split(" ");
		
		for(int i=0;i<array.length;i++)
		{
			 String reverse="";
			String word=array[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				char ch=word.charAt(j);
				reverse=reverse+ch;
				
				
			}
			sentence=sentence+reverse+" ";
		}
	
		
		System.out.println(sentence);
	  	}
	 
 }


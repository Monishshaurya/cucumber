package Programs;

import java.util.HashMap;

public class occurenceOfCharacter {
	   public static void main(String[] args)
	   {
	      String str = "SSDRRRTTYYTYTR";
	      
	      HashMap<Character,Integer>hmp=new HashMap<Character,Integer>();
	      for (int i=0;i<str.length();i++)
	      {	  
	       if(hmp.containsKey(str.charAt(i)))
	    		   {
	    	       int count=hmp.get(str.charAt(i));
	    	       hmp.put(str.charAt(i), ++count);
	    	   
	    		   }
	          else 
	          
	          {
	    	   
	    	   hmp.put(str.charAt(i),1);
	            }
	      
	      }
	      System.out.println(hmp);

	   }
	      
}
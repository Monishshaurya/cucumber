package Programs;

import java.util.HashMap;

public class Occurenceofword {

	public static void main(String[] args) 
	{
		String str = "I am Java developer I am proud of it";
             String array[]=str.split(" ");
	      
	      HashMap<String,Integer>hmp=new HashMap<String,Integer>();
	      
	      for (int i=0;i<array.length;i++)
	      {	  
	       if(hmp.containsKey(array[i]))
	    		   {
	    	       int count=hmp.get(array[i]);
	    	       hmp.put(array[i], ++count);
	    	   
	    		   }
	          else 
	          
	          {
	    	   
	    	   hmp.put(array[i],1);
	            }
	      
	      }
	      System.out.println(hmp);

	   }

	}



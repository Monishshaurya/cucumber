package Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample2

{

	public static void main(String args[]){  
		   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(1,"Grapes"); //trying duplicate key  
		  // System.out.print(map);
		   ArrayList<Integer>a1=new ArrayList<Integer>();
		   ArrayList<String>a2=new ArrayList<String>();

		   
		  Set<Integer>set= map.keySet();
		 Iterator<Integer> iterator=set.iterator();
		 
		 while(iterator.hasNext())
		 {
			 Integer key=iterator.next(); 
			 a1.add(key);
			 
			String value= map.get(key);
					a2.add(value);
			System.out.println(key+"......"+value);
			
		 }
		       
		 System.out.println(a1);
		 System.out.println(a2);
		 
		 
		Iterator<Entry<Integer,String>>it =map.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer,String>str=it.next();
			System.out.println(str.getKey()+"....."+str.getValue());	
			
		}
		
}
}
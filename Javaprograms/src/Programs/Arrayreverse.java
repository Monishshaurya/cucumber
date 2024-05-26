package Programs;

public class Arrayreverse {

	
	 static void reverseArray(int[] a)
	 {
		for(int i=a.length-1;i>0;i--)
		{
			System.out.println(a[i]);
		}
		 
		 
	  }
	
	public static void main(String[] args)
	
	{
		int a[]= {4,7,1,3,8,9};
		reverseArray(a);
		
		

	}

	

}

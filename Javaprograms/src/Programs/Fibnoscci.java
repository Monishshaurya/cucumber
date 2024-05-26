package Programs;

public class Fibnoscci {

	public static void main(String[] args)
	{

		int first=0;
		int second=1;
		 int n=20;
		 
		 for(int i=0;i<=n;i++)
		 {
		        System.out.println(first);

			 int third=first+second;
			 first=second;
			 second=third;
 
		 }
		
		
		

	}

}

package Programs;

public class Encapsulation 
{

	int rollno;
	String name;
	Boolean isAttended;
	
	public void setRollnum (int rollno)
	{
		this.rollno=rollno;
	}
	
	public int rollnum()
	{
		return rollno;
	}
	
	public  Encapsulation(String name,Boolean isAttended)
	{
	
		if(isAttended)
		{
			System.out.println(name+ " attendedthe class");
		}
		
		else
		{
			System.out.println(name+ "not attended the class");
			
		}
		
	}
	
	public static void main(String[]args)
	{
		Encapsulation enp=new Encapsulation("mouni", true);
		
		
	}
	
	
}

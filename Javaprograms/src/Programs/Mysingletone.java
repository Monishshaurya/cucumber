package Programs;

 class Mysingletone
{

	public static Mysingletone instance;
	private  Mysingletone()
	{
		
	}
	
	public void m1()
	{
		System.out.println("dsfFD");
	}
	
	public static Mysingletone getinstance()
	
	{
		
			instance=new Mysingletone();
					
		
		return instance;
	}
	
}

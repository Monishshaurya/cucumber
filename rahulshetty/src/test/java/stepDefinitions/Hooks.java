package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks 
{

 @Before("@netbanking")
public void netbanking()	
{
	System.out.println("***************");
	System.out.println("setup the entries in Netbanking database");

}

@After 
public void teardown()
{
	System.out.println("clear the entries");
}

@Before("@mortage")
public void mortgageSetup()
{
	System.out.println("mortage***************");
	System.out.println("setup the entries in Mortgage database");
}

}

	
	
	


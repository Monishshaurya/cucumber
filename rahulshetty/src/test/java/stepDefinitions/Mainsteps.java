package stepDefinitions;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mainsteps
{
	

@Given("User is on NetBanking landing page")
public void user_is_on_net_banking_landing_page()
{
	System.out.println("User landed on netbanking page");

}

@When("^User login into application with (.+) and password (.+)$")
public void user_login_into_application_with_and_password(String username, String password)
{
System.out.println(username +"and password is "+password);


}

@Then("Home Page is displayed")
public void home_page_is_displayed() 
{
	System.out.println("Home page is displayed");

}

@Then("Cards are displayed")
public void cards_are_displayed()
{
	System.out.println("Cards are displayed");
  
}

@When("^User login into application with (.+) and password (.+) combination$")
public void user_login_into_application_with_and_password_combination(String string, String string2) 
{
	System.out.println(string+"ttr"+string2);
}

@Given("User is on Practice landing page")
public void user_is_on_practice_landing_page() 
{
	
	System.out.println("Practice landing page");
}
  
@When("User Signup into application")
public void user_signup_into_application(List<String>data) 
{
  System.out.println(data.get(0));
  System.out.println(data.get(1));
  System.out.println(data.get(2));

	
}

@Given("setup entries in database")
public void setup_entries_in_database() 
{
	 System.out.println("setup entries in database"); 
}

@When("launch the browser from confi variables")
public void launch_the_browser_from_confi_variables() 
{
	 System.out.println("launch the browser from confi variables\"");  
}

@When("hit the home page url of banking site")
public void hit_the_home_page_url_of_banking_site() 
{
	 System.out.println("hit the home page url of banking site");  
}


	
}

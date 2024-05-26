package cucumberoption;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src\\test\\java\\features",glue ="stepDefinitions"
,monochrome=true,tags="@mortage or @netbanking",plugin={"pretty","html:target/cucumber.html"})
  public class TestngRunner extends AbstractTestNGCucumberTests
{

	
	
	
}

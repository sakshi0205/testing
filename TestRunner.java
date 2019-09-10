package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
       features = "src/test/java/feature/SignIn.feature",
       glue= {"stepdefinition"},
      
       monochrome=true,
      
       plugin = {"html:target/Destination"}
       )
public class TestRunner {

}

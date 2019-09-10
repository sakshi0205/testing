package StepDefinition;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactories.AdminPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AdminSignInTest {

	private WebDriver driver;
	private AdminPage admin;
	
	@Before
	public void setUp() {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Hemant/Desktop/libs/chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	@Given("^admin is on 'AdminSignIn' Page$")
	public void admin_is_on_AdminSignIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
             driver.get("http://localhost:4200/");
		     admin = new AdminPage(driver);
	}

	@When("^admin enters invalid Email$")
	public void admin_enters_invalid_Email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		admin.setEmail("");
		admin.setSubmit();
	}

	@Then("^display 'Values cannot be empty'$")
	public void display_Values_cannot_be_empty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 String expeError="Values cannot be empty";
		  String actualError=driver.switchTo().alert().getText();
		  assertEquals(expeError, actualError);
		  driver.switchTo().alert().accept();
		  driver.close();
	}

	@When("^admin enters invalid Password$")
	public void admin_enters_invalid_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		admin.setEmail("capstore@gmail.com");
		admin.setPassword("");
		admin.setSubmit();
	}
	
	@Then("^display 'Value cannot be empty'$")
	public void display_Value_cannot_be_empty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 String expeError="Values cannot be empty";
		  String actualError=driver.switchTo().alert().getText();
		  assertEquals(expeError, actualError);
		  driver.switchTo().alert().accept();
		  driver.close();
	}

	@When("^admin enters invalid Checkbox$")
	public void admin_enters_invalid_Checkbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		admin.setEmail("capstore@gmail.com");
		admin.setPassword("1234");
		//admin.setCustomCheck3("customer");
		admin.setSubmit();

	}

	@Then("^display 'This is not admin page'$")
	public void display_This_is_not_admin_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expeError="This is not admin page";
		  String actualError=driver.switchTo().alert().getText();
		  assertEquals(expeError, actualError);
		  driver.switchTo().alert().accept();
		  driver.close();
	}

	@When("^admin enters valid details$")
	public void admin_enters_valid_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		admin.setEmail("capstore@gmail.com");
		admin.setPassword("1234");
		admin.setCustomCheck3();
		admin.setSubmit();
		driver.get("http://localhost:4200/adminmanage");
	}

	@Then("^display 'AdminHome' Page$")
	public void display_AdminHome_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://localhost:4200/adminmanage");
	}





	
}

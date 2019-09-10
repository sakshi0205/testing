package PageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

private WebDriver driver;
	
	
	@FindBy(xpath="//*[@ class='btn btn-lg btn-primary btn-block text-uppercase']")
	@CacheLookup
	private WebElement Submit;
	
	
	@FindBy(name="email")
	@CacheLookup
	private WebElement Email;
	
	@FindBy(name="password")
	@CacheLookup
	private WebElement Password;
	
	//@FindBy(how=How.ID, using="customCheck3")
	@FindBy(xpath="/html/body/app-root/html/app-login/body/div/div/div/div/div/form/div[5]/label")
	@CacheLookup
	private WebElement customCheck3;
	
	public AdminPage() {	
	}
	public AdminPage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getSubmit() {
		return Submit;
	}
	public void setSubmit( ) {
		 this.Submit.click();
	}
	public WebElement getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		this.Email.sendKeys(email);

	}
	
	public WebElement getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password.sendKeys(password);
	}
	public WebElement getCustomCheck3() {
		return customCheck3;
	}
	public void setCustomCheck3() {
		this.customCheck3.click();
	}

}
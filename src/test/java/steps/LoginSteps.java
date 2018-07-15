/*package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	public ChromeDriver driver;
	
	@Given("open the browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		}
	
	@And("launch the url")
	public void launchUrl() {
		driver.get("http://leaftaps.com/opentaps/");
	}
	
	@And("set the Timeouts")
	public void setTimeouts() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@And("Maximize the Browser")
	public void maxBrowser() {
		driver.manage().window().maximize();
	}
	@And("enter the UserName as (.*)")
	public void enterUserName(String Uname) {
		driver.findElementById("username").sendKeys(Uname);	
	}
	@And("enter the PassWord as (.*)")
	public void enterPAssword(String PWD) {
		driver.findElementById("password").sendKeys(PWD);
	}

	@And("click on the Login Button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		
	}
	
	@And("Login should be Negative")
	public void loginNegative() {
		
			System.out.println("Login Negative");
	}
	@And("clickcrmsfa")
	public void clickCrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("click on the Leads")
	public void clickLeads() {
		driver.findElementByXPath("//a[text()='Leads']").click();;	
	}
	@And("Click on the CreateLeads")
	public void clickCreateLeads() {
		driver.findElementByXPath("//a[text()='Create Lead']").click();	
	}
	@And("enter the Companyname as (.*)")
	public void enterCompanyname(String companyname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(companyname);
	}
	
	@And("enter the Firstname as (.*)")
	public void enterFirstname(String firstname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
	}
	
	
	@And("enter the Lastname as (.*)")
	public void enterLastname(String lastname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lastname);
	}
	
	@When("click the CreateLead")
	public void createaLead() {
		driver.findElementByClassName("smallSubmit").click();
	}
	
	@Then("Lead Created Successfully")
	public void leadCreatedSuccessfully() {
		System.out.println("Lead Successfully Created");
	}
	
	
	
	
	
	
	
	
	
	
	
}
*/
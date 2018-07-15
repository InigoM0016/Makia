package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class CreateLead extends WebDriverServiceImpl {
	
	public CreateLead(/*EventFiringWebDriver driver, ExtentTest test*/) {
		/*this.driver = driver;
		this.test = test;*/
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "createLeadForm_companyName")
	WebElement elecn;
	
	@FindBy(id ="createLeadForm_firstName")
	WebElement elefn;
	
	@FindBy(id ="createLeadForm_lastName")
	WebElement eleln;
	
	@FindBy(className ="smallSubmit")
	WebElement elecl;
	
	@And("enter the Companyname as (.*)")
	public CreateLead typeCompanyName(String companyname) {
		type(elecn, companyname);
		return this;
		
	}
	
	@And("enter the Firstname as (.*)")
	public CreateLead typeFirstName(String firstname) {
		type(elefn, firstname);
		return this;
	}
	
	@And("enter the Lastname as (.*)")
	public CreateLead typeLastName(String lastname) {
		type(eleln, lastname);
		return this;
	}
	
	@When("click the CreateLead")
	public Lead clickcreateLead() {
		click(elecl);
		return new Lead(/*driver,test*/);
	}
	
	@Then("Lead Created Successfully")
	public void leadCreatedSuccessfully() {
		System.out.println("Lead Successfully Created");
	}

}

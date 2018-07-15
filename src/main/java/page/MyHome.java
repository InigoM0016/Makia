package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;
import net.bytebuddy.implementation.bind.annotation.FieldProxy;

public class MyHome extends WebDriverServiceImpl {
	
	public MyHome(/*EventFiringWebDriver driver, ExtentTest test*/) {
		/*this.driver = driver;
		this.test = test;*/
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText = "Leads")
	WebElement eleleads;
	
	@Given("click on the Leads")
	public MyLeads clickLeads() {
		click(eleleads);
		return new MyLeads(/*driver,test*/);
		
	}
	
	

}

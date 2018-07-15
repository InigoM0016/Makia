package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class MyLeads extends WebDriverServiceImpl {
	
	public MyLeads(/*EventFiringWebDriver driver, ExtentTest test*/) {
		/*this.driver = driver;
		this.test = test;*/
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Create Lead")
	WebElement elecl;
	
	@And("Click on the CreateLeads")
	public CreateLead clickCreateLead() {
		click(elecl);
		return new CreateLead(/*driver,test*/);
		
	}
	
	
	
}

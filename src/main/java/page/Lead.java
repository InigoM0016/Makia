package page;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class Lead extends WebDriverServiceImpl {
	
	public Lead(/*EventFiringWebDriver driver, ExtentTest test*/) {
		/*this.driver = driver;
		this.test = test;*/
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='First name']")
	WebElement eleVFN;
	
	public Lead VerifyFirstName() {
		verifyExactAttribute(eleVFN, "XPath","//span[text()='First name']");
		return this;
		
	}
	

	
	

}

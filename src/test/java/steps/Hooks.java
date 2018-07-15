package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import lib.selenium.PreAndPost;

public class Hooks extends PreAndPost {
	

	
	@Before
	public void beforeScenario(Scenario sc) {
		/*System.out.println(sc.getName());
		System.out.println(sc.getId());*/
		startReport();
		startTestCase(sc.getName(), sc.getId());
		startTestModule("LeafTaps");
		test.assignAuthor("Inigo");
		test.assignCategory("CreateLead");
		

		System.out.println("beforeMethod");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName,"DemoSalesManager");

		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");

		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
		WebElement elecrmsfa = locateElement("link", "CRM/SFA");
		click(elecrmsfa);
	}
	
	@After
	public void afterScenario(Scenario sc) {
		/*System.out.println(sc.getStatus());
		System.out.println(sc.isFailed());*/
		driver.close();
		endResult();
	
	}

}

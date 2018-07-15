package lib.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.listeners.WebDriverListener;

public class WebDriverServiceImpl extends WebDriverListener implements WebDriverService{

	public WebElement locateElement(String locator, String locValue) {

		try {
			switch (locator) {
			case "id": return driver.findElement(By.id(locValue));

			case "class": return driver.findElement(By.className(locValue));

			case "name": return driver.findElement(By.name(locValue));

			case "link" : return driver.findElement(By.linkText(locValue));

			case "xpath": return driver.findElement(By.xpath(locValue));

			default:
				break;
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
			throw new RuntimeException("Element not found");
		}
		return null;
	}

	public void type(WebElement ele, String data) {
		ele.sendKeys(data);		
	}

	public void click(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();		
	}

	public void clear(WebElement ele) {
		
			ele.clear();

	}


	public String getText(WebElement ele) {
		String text = ele.getText();
		System.out.println("The text from the element"+ele+" is "+text);
		return text;
	}

	public String getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}


	public void selectDropDownUsingVisibleText(WebElement ele, String value) {

		Select dd=new Select(ele);
		dd.selectByVisibleText(value);
		System.out.println("DD done");

	}

	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select dd=new Select(ele);
		dd.selectByValue(value);
	

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub

	}

	public boolean verifyExactTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyPartialTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		String text = ele.getText();
		if(text.equals(expectedText))

		{
			System.out.println(" successfully");
		}

		else
		{
			System.out.println("not successful");
		}

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		String text = ele.getText();
		if(text.contains(expectedText))

		{
			System.out.println(" successfully");
		}

		else
		{
			System.out.println("not successful");
		}

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void verifyDisplayed(WebElement ele) {


	}

	public void switchToWindow(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winList=new ArrayList<String>();
		winList.addAll(windowHandles);
		driver.switchTo().window(winList.get(index));
		driver.getTitle();
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	public void actions_click(WebElement ele)
	{
		Actions builder=new Actions(driver);
		builder.click(ele).pause(1000).perform();
		

	}

	public void actions_mouseover(WebElement ele)
	{
		Actions builder=new Actions(driver);
		builder.moveToElement(ele).pause(1000).perform();
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void closeActiveBrowser() {
		// TODO Auto-generated method stub
		driver.close();
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}

	public void clickLink_Index(String ele,int index)
	{
		List<WebElement> findElements = driver.findElements(By.xpath(ele));
		findElements.get(index);
	}
}




package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {

	static WebDriver driver;
	public static void main(String[] args)  {
		
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");	
	  
	  
	  Actions act=new Actions(driver);
//	  
	  WebElement firstname = driver.findElement(By.id("input-firstname"));
//	  WebElement lastname = driver.findElement(By.id("input-lastname"));
//	  
	  /*
	   * Equivalent to calling: Actions.click(element).sendKeys(keysToSend).
	   * This method is different from WebElement.sendKeys(CharSequence) - 
	   * see sendKeys(CharSequence) for details h
	   */
	  
	  act.sendKeys(firstname, "Tom").build().perform();
//	  act.sendKeys(lastname, "peter").build().perform();
	 // act.moveToElement( )   //target element is webelement
	 // act.click(firstname).sendKeys("Tom").build().perform();
	  
	// By firstname = By.id("input-firstname");
	 By lastname = By.id("input-lastname");
	 By checkbox=By.name("agree");
	 
	// act.click(driver.findElement(checkbox)).build().perform();
	 act.moveToElement(driver.findElement(checkbox)).click().build().perform();
	 
//	 doActionSendKeys(firstname, "Ram");
//	 doActionSendKeys(lastname, "Rahim");
	 
//	 doActionSendKeysOnActiveElement(firstname, "Ram");
//	 doActionSendKeysOnActiveElement(lastname, "Roshan");4680
	 
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static  void doActionSendKeys(By locator,String value) {
		 Actions act=new Actions(driver);
		 act.sendKeys(getElement(locator), value).build().perform();
	}
	public static  void doActionSendKeysOnActiveElement(By locator,String value) {
		 Actions act=new Actions(driver);
		 act.click(getElement(locator)).sendKeys(value).build().perform();
	}
	/*Clicks in the middle of the given element. Equivalent to: Actions.moveToElement(onElement).click()*/
	public static void doactionsclick(By locator) {
		 Actions act=new Actions(driver);
		 act.click(getElement(locator)).build().perform();
	}
	public static void doActionMovetoElementClick(By locator) {
		 Actions act=new Actions(driver);
		 act.moveToElement(getElement(locator)).click().build().perform();
	}
}

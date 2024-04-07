package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorCocept {
static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	//	driver.get("https://opencart.antropy.co.uk/index.php?route=account/login");
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/account");
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		
		//create the WebElemet +actions  (click, sendkeys, gettext, isdisplayed ,isenabled)
		//1.id (1 st--approach) --static method which is coming from BY class  chromedevtools we can inspect the element(DOM-document object model)
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test123");
		
		//2nd approach
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//	
//		email.sendKeys("test@gmail.com");
//		password.sendKeys("test123");
		
		//3 rd approach-By Locator
//	    By username = By.id("input-email");
//		By password = By.id("input-password");
		
//		driver.findElement(username).sendKeys("test@gmail.com");
//		driver.findElement(password).sendKeys("test123");
		
		//4 th approach with generic methods
//	    By username = By.id("input-email");
//	    By password = By.id("input-password");
	   
	 // getElement(username).sendKeys("test@gmail.com");
	  //getElement(password).sendKeys("test123");
//	    getElement(username).sendKeys("rdilipkumar124@gmail.com");
//	    getElement(password).sendKeys("7026444183");
	    
	    //5 th approach By locator with generic method (getElement() with  actions method)
//		 By username = By.id("input-email");
//		 By password = By.id("input-password");
//		 doSendKeys(username, "rdilipkumar124@gmail.com");
//		 doSendKeys(password, "7026444183");
		 
		 //6 th ElementUtil  Class with generic methods
//		 By username = By.id("input-email");
//		 By password = By.id("input-password");
//		 
//		 ElemetUtil eleutil=new ElemetUtil(driver);
//		 eleutil.doSendKeys(username, "rdilipkumar124@gmail.com");
//		 eleutil.doSendKeys(password, "7026444183");
		
		//7 th approach  String locator value
		String usernameId="input-email";
		String passwordId="input-password";
		
		doSendKeys("id", usernameId, "rdilipkumar124@gmail.com");
		doSendKeys("id", passwordId,"7026444183");
	}
	
	public static By  getBy(String locatorType,String loctorValue) {
		By locator =null;  //Initially it is pointing to null
		
		switch (locatorType.toLowerCase()) {
		case "id":
			 locator = By.id(loctorValue);
			break;

		default:
			System.out.println("please pass the right locator type and value....");
			break;
		}
		return locator;
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static WebElement getElement(String locatorType, String locatorvalue) {
		return driver.findElement(getBy( locatorType, locatorvalue));
	}
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);  //for webelement we can directly apply send keys method
	}
	public static void doSendKeys(String locatortype,String locatorvalue,String value) {
		getElement(locatortype, locatorvalue).sendKeys(value);
	}
	
}

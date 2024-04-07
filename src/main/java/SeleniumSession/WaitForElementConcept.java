package SeleniumSession;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElementConcept {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.get("https://classic.freecrm.com/index.html");  //webdriverwait is class so we need to create the object
		
		//By username=By.name("username1"); //org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element
		By username=By.name("username");
		By password=By.name("password");
		By Login=By.xpath("//input[@type='submit']");
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));  //we are defining the wait here and initalizing the driver with 10 seconds  
//		WebElement username_elem = wait.until(ExpectedConditions.presenceOfElementLocated(username));  //expecting By locator ,we need to create locator
		//username_elem.sendKeys("diliptest");
		
	//	doPresenceofElementLocated(username, 10).sendKeys("diliptest");
		//doSendKeys(username, "diliptest", 10);
		//driver.findElement(password).sendKeys("diliptest123");  //without wait 
		//driver.findElement(Login).click();
		//default polling time is 500milisec
		//default polling time in implicitly wait is 500milisec
		//doPresenceofElementLocated(username, 10, 2000);
		
		driver.get("https://www.freshworks.com/");
		
		By footer=By.xpath("//footer//ul[@class='footer-nav']//a");
//		List<WebElement> footerlist = WaitForElementsToBeVisible(footer, 5);
//		for (WebElement e : footerlist) {
//			System.out.println(e.getText());
//		}
		if (getElementTextList(footer, 5).contains("Partners")) {
			System.out.println("Pass");
		}
	}
	public static void doSendKeys(By locator,String value,int timeout) {
		doPresenceofElementLocated(locator, timeout).sendKeys(value);
	}
	public static WebElement doPresenceofElementLocated(By locator ,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout)); 
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));  //10 approach creating webelment
	}
	public static WebElement doPresenceofElementLocated(By locator ,int timeout,long intervaltime) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout), Duration.ofMillis(intervaltime));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	/*An expectation for checking that an element is present on the DOM 
	 * of a page and visible.Visibility means that the element is not only displayed but 
	 * also has a height and width that is greater than 0.*/
	public static WebElement isElementVisible(By locator ,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout)); 
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public static WebElement WaitForElementToBeVisible(By locator ,int timeout,long intervaltime) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout),Duration.ofMillis(intervaltime)); 
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public static WebElement WaitForElementToBeVisibleWithWebElement(By locator ,int timeout,long intervaltime) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout),Duration.ofMillis(intervaltime)); 
		return wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
	}
	public static List<WebElement> WaitForElementsToBeVisible(By locator ,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout)); 
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	public static List<WebElement> WaitForElementsToBeVisible(By locator ,int timeout,long intervaltime) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout),Duration.ofMillis(intervaltime)); 
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	public static List<String> getElementTextList(By locator,int timeout) {
		List<WebElement> elementlist = WaitForElementsToBeVisible(locator, timeout);
		List<String> elementtextlist=new ArrayList<String>();
		for (WebElement e : elementlist) {
			String text = e.getText();
			elementtextlist.add(text);
		}
		return elementtextlist;
	}
	
	
}

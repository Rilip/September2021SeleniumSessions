package SeleniumSession;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		//WebDriverWait(C)---which is extending ---->FluentWait(C)---Which is implementing--->Wait(I) one abstract method that is UNTILL()
        //both are explicitly wait  
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By emailid = By.id("input-email");
	
		waitForElemetPresetUsingFluentwait(emailid, 10, 2).sendKeys("dilip123@gmail.com");
		
		//email_ele.sendKeys("dilip123");
	}
	public static WebElement waitForElemetPresetUsingFluentwait(By locator,int timeout,int polligtime) {
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(polligtime))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage("Element is not found");
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public static WebElement waitForElementusingWebDriverWait(By locator,int timeout,int polligtime) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		//wait.until(ExpectedConditions.presenceOfElementLocated(locator))
		wait.withTimeout(Duration.ofSeconds(timeout))
		.pollingEvery(Duration.ofSeconds(polligtime))
		.ignoring(NoSuchElementException.class)
		.ignoring(StaleElementReferenceException.class)
		.withMessage("Element is not found");
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}

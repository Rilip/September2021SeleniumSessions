package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisplayed {
static WebDriver driver;  
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		//By password = By.id("input-password");
		
//		boolean flag = driver.findElement(email).isDisplayed();  //it wil checks element is displayed ,,boolean org.openqa.selenium.WebElement.isDisplayed()
//		boolean flag1 = driver.findElement(password).isDisplayed();
		/*true
          true*/
//		System.out.println(flag);
//		System.out.println(flag1);
		
		doIsDisplayed(email);
		//doIsDisplayed(password);
		
		if (doIsDisplayed(email)) {
			System.out.println("Elemet is Present");
		}
		
	}
	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
}

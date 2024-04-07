package SeleniumSession;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {
static WebDriver driver;
	public static void main(String[] args) {
		//while loop
		//sleep  --static wait---->dynamic wait
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By emailid = By.id("input-email1");
		
		retryingElement(emailid, 10).sendKeys("dilip123@gmail.com");
		
	}
	public static WebElement getElement(By locator) {
	return driver.findElement(locator);	
	}
	public static WebElement retryingElement(By locator,int timeout) {
		
		WebElement element=null;
		int attempts=0;
		
		while (attempts<timeout) {
			try {
			element=getElement(locator);
			break;
			}catch (NoSuchElementException e) {
				System.out.println("element is not found in attempts :"+attempts+":"+locator);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			attempts++;
			
		}
		if (element==null) {
			try {
			throw new Exception("Element not Found Exception");
			}
			catch (Exception e) {
				System.out.println("Element is not found exception..tiedout.."+timeout+
						"with the interval of :"+attempts);
			}
		}
		return element;
	}
}

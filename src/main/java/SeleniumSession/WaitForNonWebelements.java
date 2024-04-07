package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForNonWebelements {

		//wait for uRL--non webelemets
		static WebDriver driver;
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.findElement(By.linkText("Contact us")).click();  //17-50.06
			
			//wait for url
//			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//			wait.until(ExpectedConditions.urlContains("controller=contact"));
		
			if (waitforURLToContain("controller=contact", 5)) {
			System.out.println("url is correct");	
			}
			String title = doGetTitle("Contact us", 5);
			System.out.println(title);
			

			
	}
		public static String doGetTitlewithfraction(String titlefraction,int timeout) {
		if (waitForTitleContains(titlefraction,timeout)) {
			return driver.getTitle();
		}	
		return null;
		}
		public static String doGetTitle(String title,int timeout) {
			if (waitForTitleToBe(title,timeout)) {
				return driver.getTitle();
			}	
			return null;
			}
		public static boolean waitForTitleContains(String titlefractio,int timeout) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
			return wait.until(ExpectedConditions.titleContains(titlefractio));
		}
		
		public static boolean waitForTitleToBe(String title,int timeout) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
			return wait.until(ExpectedConditions.titleIs(title));
		}
		
		public static boolean waitforURLToContain(String urlFraction,int timeout) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
			return wait.until(ExpectedConditions.urlContains(urlFraction));
		}
		public static boolean waitforURLToBe(String url,int timeout) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
			return wait.until(ExpectedConditions.urlToBe(url));
		}

}

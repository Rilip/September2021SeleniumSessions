package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
   
public class WaitForFrameConcept {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("main"));
		
		
		waitforFrameByNameOrId("main", 5);
		
		String header = driver.findElement(By.xpath("/html/body/h2")).getText(); 
		System.out.println(header);

	}
	
	public static void waitforFrameByNameOrId(String NameOID,int TimeOut) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(TimeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(NameOID));
	}
	public static void waitforFrameByIdex(int frameindex,int TimeOut) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(TimeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameindex));
	}
	public static void waitforFrameByLocator(By framelocator,int TimeOut) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(TimeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framelocator));
	}
	public static void waitforFrameElement(WebElement frameelement,int TimeOut) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(TimeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameelement));
	}

}

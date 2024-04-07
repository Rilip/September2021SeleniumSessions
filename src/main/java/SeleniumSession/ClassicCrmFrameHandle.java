package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassicCrmFrameHandle {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://classic.freecrm.com/index.html");
	driver.findElement(By.name("username")).sendKeys("diliptest");
	driver.findElement(By.name("password")).sendKeys("diliptest");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(1000);
	
	driver.switchTo().frame("mainpanel");
	driver.findElement(By.linkText("CONTACTS")).click();
	
	selectcontactslink("deepthi R");
	}
    public static void selectcontactslink(String contactname) {
	 String xpath = "//a[text()='"+contactname+"']/parent::td//preceding-sibling::td/input[@type='checkbox']";
     driver.findElement(By.xpath(xpath)).click();
    }
}

package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator. *;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocator {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://whenwise.com/sign-in");
		driver.findElement(By.id("email")).sendKeys("rdilipkumar124@gmail.com");
		driver.findElement(By.id("password")).sendKeys("rdilipkumar124@");
		driver.findElement(By.id("login-btn")).click();
		
		driver.navigate().to("https://whenwise.com/users/3028/edit");
		////span[@class="lever"]
		////span[text()='Email on booking confirmation?']/parent::div//span[@class='lever']=complex xpath
		WebElement ele = driver.findElement(By.xpath("//span[text()='Email on booking confirmation?']"));
		driver.findElement(with(By.className("lever")).toRightOf(ele)).click();
		By rightof = By.xpath("//span[text()='Email on booking confirmation?']");
		//toggle(rightof);
	   
	}
	public static void toggle(By locator) {
		WebElement ele = driver.findElement(locator);
		//driver.findElement(with(By.className("lever")));
		
	}

}

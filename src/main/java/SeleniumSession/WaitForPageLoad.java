package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForPageLoad {
static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://api.cogmento.com/register/");
		driver.findElement(By.partialLinkText("Log in here")).click();
		JavaScriptUtil jsutil=new JavaScriptUtil(driver);
		jsutil.waitForPageLoaded();
		driver.findElement(By.name("email")).sendKeys("testing");
		//document.readyState--Complete--page is fully loaded

	}

}

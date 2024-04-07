package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
	
		//101
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\firefoxdriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\ChromoDriver\\chromedriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/mozilla/geckodriver/releases");
	}

}

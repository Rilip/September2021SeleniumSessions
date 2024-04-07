package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	//headless
	//no browser launch browser not visible & hidden browser
	//Testing is happening behind scene
	//faster as compare to normal mode
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("---headless");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.amazon.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.quit();
		

	}

}

package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Icoginito {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    ChromeOptions co=new ChromeOptions();
	   // co.addArguments("---headless");
	    co.addArguments("---incognito");
	    WebDriver driver=new ChromeDriver(co);
	   // driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/product&product_id=43");
	    driver.get("https://www.amazon.com");
	   System.out.println(driver.getTitle());
	   System.out.println(driver.getCurrentUrl());
	   driver.quit();
	}

}

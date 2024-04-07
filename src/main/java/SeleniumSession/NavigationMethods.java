package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		/**
		 * Google
           Amazon.com. Spend less. Smile more.
           Google
           Amazon.com. Spend less. Smile more.
           Google
		 */
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		//driver.get("http://www.amazon.com");  //to method is internally calling get method
		driver.navigate().to("http://www.amazon.com");  //overloaded method  
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
	}

}

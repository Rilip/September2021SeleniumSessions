package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) {
	
		//43.38
		
		//open Chrome
		//Enter the URL
		//get the title  -->validation point (act vs exp)
		//get the URL  1.23
		//close the browser
		
		//System.setProperty("webdriver.chrome.driver", "C:\\ChromoDriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		System.out.println(driver.getTitle());
	}

}

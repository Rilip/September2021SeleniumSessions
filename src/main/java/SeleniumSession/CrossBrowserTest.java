package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {
static WebDriver driver;  //class level
	public static void main(String[] args) {
		
     String Browser="Chrome";
     
     if (Browser.equalsIgnoreCase("chrome")) {
    	 System.setProperty("webdriver.chrome.driver", "C:\\ChromoDriver\\chromedriver.exe");
 		 driver=new ChromeDriver();
	}else if (Browser.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\firefoxdriver.exe");
        driver=new FirefoxDriver();
	}else if (Browser.equalsIgnoreCase("safari")) {
		driver=new SafariDriver();
	}else {
		System.out.println("Please pass the right browser"+Browser);
	}
     driver.get("https://www.google.com/");
     String title = driver.getTitle();
     System.out.println("page title is :"+title);
     if (title.equals("Google")) {
		System.out.println("PASS--------->Correct title:");
	}else {
		System.out.println("FAIL---------->ICorrect title");
	}
     System.out.println(driver.getCurrentUrl());
    driver.close();
	}

}

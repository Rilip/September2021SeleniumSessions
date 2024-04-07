package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
public static WebDriver driver;
/**
 * This method is used to launch the browser  on the basis of given browser name
 * @param Browser
 * @return this will return the driver
 */

	public WebDriver lauchBrowser(String Browser) {
	     
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
	     return driver;
	}
	/**
	 * This method is used to enter the url
	 * @param url
	 */
	public void enterurl(String url) {
		if (url==null) {
			System.out.println("url is null....");
			return;
		}if (url.indexOf("https")==-1) {
			System.out.println("https is missing in the url");
			return;
		}
		driver.get(url);
	}
	/**
	 * 
	 * @param url 
	 * @return This method will return current page url
	 */
	public String getAppCurrenturl() {
	return driver.getCurrentUrl();	
	}
	//another wrapper method
	public String getTitle() {
		return driver.getTitle();
	}
	public void closethebrowser() {
		driver.close();  //no need to return anything
	}
	public void quitBrowser() {
		driver.quit();
	}
}

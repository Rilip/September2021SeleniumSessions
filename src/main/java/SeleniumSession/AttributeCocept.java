package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributeCocept {

	static WebDriver driver;
	public static void main(String[] args) {
		//8-1.40

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		String hrefval = driver.findElement(By.linkText("Amazon Devices")).getAttribute("href");
        System.out.println(hrefval);
//		By amazondevicelink = By.linkText("Amazon Devices");
//		String hrefval=getAttributeValue(amazondevicelink, "href");
//		if (hrefval.contains("footer_devices")) {
//			System.out.println("this is correct href");
//		}
//	}
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	public static String getAttributeValue(By locator,String attrname) {
//		String attrval = getElement(locator).getAttribute(attrname);
//		System.out.println(attrval);
//		return attrval;
	}

}

package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyElement {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
	//	By formfields = By.className("text1");
		By formfields = By.className("text");
		int fieldscount = driver.findElements(formfields).size();
		if (fieldscount==0) {
			System.out.println("fields fields are not available");
		}else {
			System.out.println("fields fields are  available");
		}
		//to verify single element
		// By bookdemo = By.linkText("BOOK A FREE DEMO");
		  //  driver.findElement(bookdemo).click();
		//contact sales is link not button because a tag associated with
	    By contactsaleslink = By.linkText("CONTACT SALES");  //8-25
		//By contactsaleslink = By.linkText("Contact Sales");
		//driver.findElement(contactsaleslink).click();  //org.openqa.selenium.NoSuchElementException   because visibility Capital but you passing small letters
        boolean flag = driver.findElement(contactsaleslink).isDisplayed();
        System.out.println(flag);
        
        if (driver.findElements(contactsaleslink).size()>=1) {
			System.out.println("contact sales link is present on the page");
		}
        System.out.println(isElementExist(contactsaleslink));
        
	  }
	
	public static boolean isElementExist(By locator) {
	int elementcout = driver.findElements(locator).size();	
	System.out.println("total element count is :"+elementcout);
	if (elementcout >=1) {
		System.out.println("element found is:"+locator);
		return true;
	}
	else {
		System.out.println("element is not found :"+locator);
		return false;
	}
	}
}
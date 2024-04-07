package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelectTag {
	
	//drop down---html tag ---->select
	//Select Class in Selenium
	
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
//		WebElement country = driver.findElement(By.id("Form_submitForm_Country"));  //create webelement
//		
//		Select select=new Select(country);  //select class will be expecting one webelement  ,,select class always webelement
		//1.select.selectByIndex(5);  //days or month
		
		//2.select.selectByVisibleText("India");  //text of the option
		
		//3.value of the attribute
	//	select.selectByValue("Cuba");
		By country = By.id("Form_submitForm_Country");
		doDropDownSelectByIndex(country, 10);
		doSelectDropDownSelectByValue(country,"Cuba");
		doSelectDropDownSelectByvisibletext(country, "India");
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doDropDownSelectByIndex(By locator,int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void doSelectDropDownSelectByValue(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static void doSelectDropDownSelectByvisibletext(By locator,String text) {
		Select select=new Select(getElement(locator));
		select.selectByValue(text);
	}
}

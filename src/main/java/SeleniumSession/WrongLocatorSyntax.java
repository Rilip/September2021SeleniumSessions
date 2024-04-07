package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WrongLocatorSyntax {
static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By firstname = By.xpath("//*[@id=\"Form_submitForm_Name\"]");
		//By lastname = By.cssSelector("#Form_submitForm_Name");
		By lastname = By.cssSelector("Form_submitForm_Name");  //wrong Syntax   ,,//org.openqa.selenium.NoSuchElementException: no
		driver.findElement(firstname).sendKeys("naveen"); 
		driver.findElement(lastname).sendKeys("1Navee1");
		////*[@id=\"Form_submitForm_Name\"]--Yes  
		////*[id=\"Form_submitForm_Name\"]--No
		//testing--->no
		//InvalidSelectorExceptio
		//Form_submitForm_Name"  //wrong Syntax

	}

}

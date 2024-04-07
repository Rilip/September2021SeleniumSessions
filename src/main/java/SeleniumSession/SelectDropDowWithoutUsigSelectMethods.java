package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDowWithoutUsigSelectMethods {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		//WebElement country = driver.findElement(By.id("Form_submitForm_Country"));  //create webelement
		By coutry = By.id("Form_submitForm_Country");
		doSelectDropdownValue(coutry, "India");
	}
	
	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectDropdownValue(By locator,String value) {
        Select select=new Select(getElement(locator));
		List<WebElement> optionList = select.getOptions();
		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
			//if (text.equals("India")) {
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
		
	}

}

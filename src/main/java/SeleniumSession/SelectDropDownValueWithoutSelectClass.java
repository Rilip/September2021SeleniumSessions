package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownValueWithoutSelectClass {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		By countryoptions = By.xpath("//select[@id='Form_getForm_Country']/option");
		selectdropdownvaluewithoutselect(countryoptions, "Cuba");
	}
	
	public static void selectdropdownvaluewithoutselect(By locator ,String value) {
		List<WebElement> countrylist = driver.findElements(locator);  //xpath will starts "//"
		System.out.println(countrylist.size());
		
		for (WebElement e : countrylist) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}

}

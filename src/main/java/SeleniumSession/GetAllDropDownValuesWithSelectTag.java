package SeleniumSession;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllDropDownValuesWithSelectTag {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		WebElement country = driver.findElement(By.id("Form_submitForm_Country")); 
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until
		
		Select select=new Select(country);
		List<WebElement> CoutryList = select.getOptions();  
		System.out.println(CoutryList.size());
		if (CoutryList.size()-1==231) {
			System.out.println("Coutry count is correct");
		}
		
		int Count=0;
		
		for(WebElement e:CoutryList) {
			String text = e.getText();
			System.out.println(Count+"::"+text);
			Count++;
		}
		
//		for(int i=0;i<CoutryList.size();i++) {
//			String text = CoutryList.get(i).getText();
//			System.out.println(i+":"+text);
//		}
		
		

	}

}

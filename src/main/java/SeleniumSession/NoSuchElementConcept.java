package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElementConcept {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//create Webelemet
		//WebElement firstame = driver.findElement(By.id("Form_submitForm_Name"));
		//Deliberately we are making 1 in id to make it fail
//		WebElement firstame = driver.findElement(By.id("Form_submitForm_Name11"));  //org.openqa.selenium.NoSuchElementException:
		//NoSuchElementException:
		
//		firstame.sendKeys("naveen");

		//List<WebElement> list = driver.findElements(By.className("text"));
		List<WebElement> list = driver.findElements(By.className("text11"));  //0  ,it will not give exception  ,,if your usig Fes for that locator got changed or it is wrong it will not give any exception
		System.out.println(list.size());  //if element is not found or locator is wrong it we will not throws any exception
		//no exception will be throw if the locator is not found or locator is wrong
		//it will return empty list  //0
	}

}

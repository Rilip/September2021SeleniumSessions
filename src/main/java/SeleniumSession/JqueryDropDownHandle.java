package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("justAnInputBox")).click();
		By choices = By.cssSelector("span.comboTreeItemTitle");
		
		//TC_01:-Single selection 
		//selectChoicelist(choices, "choice 2");
		selectChoicelist(choices, "choice 1");
//		selectChoicelist(choices, "choice 3");
//		selectChoicelist(choices, "choice 6 2 3");
		
		//Tc_02:- multi Selection
		//selectChoicelist(choices, "choice 2","choice 3");
		
		//TC_03:-All Selection
		//selectChoicelist(choices, "all");
	}
	//instad of value why you are not given array for multi selection  "String value " we need to use "String...value   means String array value
	public static void selectChoicelist(By locator,String... value) {
		List<WebElement> choiceslist = driver.findElements(locator);
		//for iterate array we use for loop
		boolean flag=false;
		if (!value[0].equalsIgnoreCase("all")) {
			
		
		for (WebElement e : choiceslist) {
			String text = e.getText();
			System.out.println(text);
			
			for(int i=0;i<value.length;i++) {
				if (text.equals(value[i])) {
					flag=true;
					e.click();
					break;
				}else {
					flag=false;
					  }
			}
		} 
	}else {
		//all selection logic
		try {
		for (WebElement e : choiceslist) {
			e.click(); //org.openqa.selenium.ElementNotInteractableException:
		}
	}catch(ElementNotInteractableException e) {
		System.out.println("all choices are over....");
	}
		
	}
//		if (flag==false) {
//		System.out.println("choice is not available");
//	}
  }
}	

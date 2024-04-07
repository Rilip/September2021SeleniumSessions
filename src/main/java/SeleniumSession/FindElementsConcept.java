package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	static WebDriver driver;
	
	//you have to get the count of all the links and images on the page
	//then print the text of each link on the console
	//avoid blank text  
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		//List<WebElement> LiksList = driver.findElements(By.tagName("a"));  //we never use .click and .sedkeys method in FES
		By images = By.tagName("a");
		List<WebElement> LiksList=getElements(images);
		
		System.out.println("total  links : "+LiksList.size());  //for list we use .size  
//		
//	    for (int i = 0; i < LiksList.size(); i++) {
//	    	String text = LiksList.get(i).getText();
//	    	
//	    	if (!text.isEmpty()) {
//	    		System.out.println(text);	
//			}
//	}
		
		//foreach loop
		for (WebElement e : LiksList) {
			String text = e.getText();
			
			if (!text.isEmpty()) {
				System.out.println(text);
			}
		}
	    		
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}

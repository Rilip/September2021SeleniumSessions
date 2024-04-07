package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagesUtil {

	static WebDriver driver;

	//you have to get the count of all the links and images on the page
	//then capture the src/alt attributes of each image on the console  i generic way
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		 driver.get("https://www.amazon.com/");	

		 By images=By.tagName("img");
	     By links = By.tagName("a");
		 System.out.println(getElemetsCout(images));
		 
		 List<String> attrlist = getAttributeList(images, "src");
		 printElementValues(attrlist);
		 
		 printElementValues(getAttributeList(images, "alt"));
		 printElementValues(getAttributeList(links, "href"));
	}
	public static int getElemetsCout(By locator) {
		return getElements(locator).size();
	}
	//to printing also creating generic method
	public static void printElementValues(List<String> ellist) {
		for (String e : ellist) {
		System.out.println(e);	
		}
	}
	public static List<String> getAttributeList(By locator,String AttributeName) {
		List<WebElement> elelist = getElements(locator);
		List<String>attrlist=new ArrayList<String>();  //blank list
		
		for (WebElement e : elelist) {
			String attributevalue = e.getAttribute(AttributeName);
			//test driven approach
			attrlist.add(attributevalue);
		}
		return attrlist;
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}


}

package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkTextUtil {

	static WebDriver driver;
	
	//you have to get the count of all the links and images on the page
	//return a List<String>-------------->this will hold the text of each link
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		By links = By.tagName("a");
		System.out.println(getElemetsCout(links));
	//	List<WebElement> LiksList=getElements(links);
		
		List<String> actlist = getElementsTextList(links);
		
//		for (String e : actlist) {
//			System.out.println(e);
//		}
		if (getElementsTextList(links).contains("Careers")) {
			System.out.println("Careers link is present");
		}

	}
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> elelist = getElements(locator);
		List<String>eletextlist=new ArrayList<String>();  //blank list we created
		
		for (WebElement e : elelist) {
			String eleText = e.getText();
			//if (!e.getText().isEmpty()) {
			if(!eleText.isEmpty()) {
				eletextlist.add(eleText);
			}
		}
		return eletextlist;
	}
	public static int getElemetsCout(By locator) {
		return getElements(locator).size();
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}

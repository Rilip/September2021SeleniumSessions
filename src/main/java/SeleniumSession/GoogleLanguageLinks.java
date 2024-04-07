package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	static WebDriver driver;
	
	//fun--->click on the specific link
	//func-->return list of link text
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		
	//	By.tagName("a");  //---->100  this approach having performance issue
		By langlinks = By.xpath("//div[@id='SIvCob']/a"); //---->9
		
		//clickonelement(langlinks, "हिन्दी");
		
		List<String> actuallinktextlist = getLinkTextList(langlinks);  //10-31
		if (actuallinktextlist.contains("मराठी")) {
			System.out.println("मराठी is present on the page");
		}
	}
	
	public static List<String> getLinkTextList(By locator) {
		List<WebElement> linklist =driver.findElements(locator);
		List<String> linktextlist=new ArrayList<String>();
		System.out.println(linklist.size());
		
		for (WebElement e : linklist) {
			String text = e.getText().trim();
			linktextlist.add(text);
			}
		return linktextlist;
	}
	public static void clickonelement(By locator,String linktext) {
		List<WebElement> langlist =driver.findElements(locator);
		System.out.println(langlist.size());
		
		for (WebElement e : langlist) {
			String text = e.getText().trim();
			System.out.println(text);
			if (text.equals(linktext)) {
				e.click();
				break;
			}
		}

	}
	
	
}

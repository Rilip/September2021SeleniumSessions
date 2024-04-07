package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageCount {

	static WebDriver driver;

	//you have to get the count of all the links and images on the page
	//then print the src/alt attributes of each image on the console 
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		List<WebElement> imageslist = driver.findElements(By.tagName("img"));
		
		System.out.println(imageslist.size());
		
		for (WebElement e : imageslist) {
			String altvalue = e.getAttribute("alt");
			String srcvalue = e.getAttribute("src");
//			System.out.println(altvalue);
//			System.out.println(srcvalue);
			System.out.println(altvalue + "------------->" + srcvalue);
		}
	}

}

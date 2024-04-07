package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		////a[text()='deepthi R']/parent::td//preceding-sibling::td/input
	   ////a[text()='dilip r']/parent::td//preceding-sibling::td/input  
		////a[text()='deepthi R']/.. -->immediately it will go to parent 
		//a[text()='deepthi R']/../preceding-sibling::td/child::input
		//a[text()='deepthi12@gmail.com']/../preceding-sibling::td/..
		//input[@id='username']//ancestor::form[@id="hs-login"]//a--ancestor tag
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("diliptest");
		driver.findElement(By.name("password")).sendKeys("diliptest");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		
		Thread.sleep(3000);
       
		//String xpath = "//a[text()='deepthi R']/parent::td//preceding-sibling::td/input";
		//driver.findElement(By.xpath(xpath)).click();
		selectcotactslink("dilip r");
		selectcotactslink("deepthi R");
		
		/*zomato
          949894882
          949894882*/
		System.out.println(getcompanyame("deepthi R"));  //zomato
//		System.out.println(getphoneum("deepthi R"));
//		System.out.println(gethomephone("deepthi R"));
		//System.out.println(getmobileumb("deepthi R"));
		System.out.println(getContactPhoneList("deepthi R"));
//		System.out.println(getemaillist("deepthi R"));
	}
    
	public static void selectcotactslink(String contactname) {
		String xpath = "//a[text()='"+contactname+"']/parent::td//preceding-sibling::td/input";
		driver.findElement(By.xpath(xpath)).click();
	}
	public static String getcompanyame(String contactname) {
		String xpath = "//a[text()='"+contactname+"']/parent::td/following-sibling::td/a[@context='company']";
		              ////a[text()='deepthi R']/parent::td/following-sibling::td/a[@context='company']::td/following-sibling::td 
		return driver.findElement(By.xpath(xpath)).getText();
	}
	public static String getphoneum(String contactname) {
		//String xpath = "//a[text()='"+contactname+"']/parent::td/following-sibling::td/a[@context='company']/../following-sibling::td/span[@context='phone']";
		String xpath = "//a[text()='deepthi R']/parent::td/following-sibling::td/a[@context='company']/../following-sibling::td/span[@context='phone']/../following-sibling::td/span[@context='phone']";
		return driver.findElement(By.xpath(xpath)).getText();
	}
	public static String gethomephone(String contactname) {
		String xpath = "//a[text()='"+contactname+"']/parent::td/following-sibling::td/a[@context='company']/../following-sibling::td/span[@context='phone']/../following-sibling::td/span[@context='phone']";
	return driver.findElement(By.xpath(xpath)).getText();
	}
	public static List<String> getContactPhoneList(String contactname) {
		String xpath = "//a[text()='"+contactname+"']//parent::td//following-sibling::td/span[@context='phone']";
	  List<WebElement> phonelist = driver.findElements(By.xpath(xpath));
	  List<String> phoneVallist=new ArrayList<String>();
	  for (WebElement e : phonelist) {
		String text = e.getText();
		phoneVallist.add(text);
	}
	  return phoneVallist;
	}
	public static WebElement getemaillist(String contactame) {
		//String xpath = "//a[text()='"+contactame+" ']/parent::td//following-sibling::td/a[text()='deepthi12@gmail.com']";
	      String xpath = "//a[text()='deepthi R']/../following-sibling::td/following-sibling::td[4]/a";
		return driver.findElement(By.xpath(xpath));
	}
	
}

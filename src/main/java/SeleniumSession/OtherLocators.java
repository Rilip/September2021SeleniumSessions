package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OtherLocators {
static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		//driver.get("https://classic.crmpro.com/index.html");
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 driver.get("https://www.freshworks.com");
		
		
		//1.id (it is unique attribute)----|
		//2.name------------>||
//		driver.findElement(By.name("username")).sendKeys("test@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("te123st@123");

//		By emailid=By.name("username");
//		By password=By.name("password");
		ElemetUtil eleutil=new ElemetUtil(driver);
//		eleutil.doSendKeys(emailid, "naveen@gmail.com");
//		eleutil.doSendKeys(password, "te123st@123");
		
		
		//3.className---------->111
		//it is also attribute, it is not unique at all
		// it is not unique
		//we can have same class name for different elements
		
		//driver.findElement(By.className("form-control")).sendKeys("Naveen");
		
		//4.Xpath:  it is not a attribute
		//address of the element inside the HTML DOM
		//we have to use attributes to create the xpath 
		
		////*[@id="input-email"] --relative xpath
		///html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input  --absolute xpath
		//we will never use absolute xpath
//		driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("test@123");
		
//		By emailid = By.xpath("//*[@id='input-email']");
//		eleutil.doSendKeys(emailid, "test@gmail.com");
		
		//5.CSS selector:-it is also not a attribute
		//to create css selector we have to use attribute
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("test");
		
		//6.linktext:-only for links  ,it is not an attribute
		//html tag of all links it is always " a "
		//driver.findElement(By.linkText("Register")).click();  //i dot want use driver.fidelement
		By registerlink = By.linkText("Register");
		doClick(registerlink);
		
//		String register="Register";
//		eleutil.doClick("LinkText", register);
		
		//7.partial linktext
		//partiallinktext-only for links  ,it is not an attribute
		// partial link text of the link  ,html  tag --a
		//driver.findElement(By.partialLinkText("Pollicy")).click(); ;// it will be rare case usually we dont prefer this partiallink
		//This is app Privacy policy ,,we are passing policy it will clicks privacy policy but we need user policy in that time it will ot works
		//Privacy Policy
		//User Policy
		//reset pwd  --if i partial link text as pwd it will click reset pwd but i need forgot pwd
		//forgot pwd
		
		//8. tagname  html tag
//		String header = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);
//		if (header.contains("Love your software")) {
//			System.out.println("h1 header is correct");
//		}
		
		By header = By.tagName("h1");
		if (doGetText(header).contains("Love your software")) {
		System.out.println("h1 header is correct");	
		}
	}
	
	public static WebElement getelement(By locator) {
		return driver.findElement(locator);
	}

	public static void doClick(By locator) {
		getelement(locator).click();
	}
	public static String doGetText(By locator) {
		return getelement(locator).getText();
	}
}

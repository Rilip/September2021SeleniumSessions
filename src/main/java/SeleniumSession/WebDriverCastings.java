package SeleniumSession;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverCastings {

	public static void main(String[] args) {
	    //1.WD ---CD
		WebDriver driver=new ChromeDriver();      //ChromeDriver iheriting all methods which are coming from WebDriver
		driver.close();  //individual methods which are in ChromeDriver will not access because reference type check applies
		//Intact there is no individual methods i chromedriver,all the methods are coming from Webdriver

		//2. CD dr=new CD();
//		ChromeDriver driver2=new ChromeDriver();
//		driver2.   //only applicable for Specific BrowserS
		
		//3.RWD----CD
//		RemoteWebDriver driver3=new ChromeDriver(); //can i acess all the methods overridde CD
//		driver3.g  // this is also correct syntax
		
		//4.WD--->RWD
		//WebDriver driver4=new RemoteWebDriver(new URL("192.45.1.10:4444"), "Desired Capabilities");  //to execute some other server ,this will be using docker,
	
	   //5/SC---->CD Sc is grand parent of CD
//		SearchContext driver5=new ChromeDriver();
//		driver5.findElement(null);  //i can access only 2 methods FE and FES
		
		//6 SC------->RWD
//		SearchContext driver6=new RemoteWebDriver(new URL("192.45.1.10:4444"), "Desired Capabilities");
//		driver6. //never do the top casting with SearchContext
	}
	

}

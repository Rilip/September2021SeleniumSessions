package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
	
		//session id
//
//		System.setProperty("webdriver.chrome.driver", "C:\\ChromoDriver\\chromedriver.exe");
//		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");  //session id=123
//		String title = driver.getTitle();
//		System.out.println("Page title is:"+title);
//		
//		driver.close();  //session got expired
//		//we need to reinitialize driver ,once session  got expired
//		driver=new ChromeDriver();
//		driver.get("https://www.google.com/");  //new session will be created ,session id=456
//		System.out.println(driver.getTitle());  //No such Session Exception  ,invalid session id
		
		
		//Quit
        System.setProperty("webdriver.chrome.driver", "C:\\ChromoDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");  //session id=123
		String title = driver.getTitle();  //same session id
		System.out.println("Page title is:"+title);
		
		driver.quit(); //same session id
		//once again we need to reinitialize the driver
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");  // session id will be null   //No such session Exception your session id is null ,are you using webdriver after calling quit
		System.out.println(driver.getTitle());

		
	}

}

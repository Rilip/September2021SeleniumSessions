package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {
static WebDriver driver;
	public static void main(String[] args) {
		//ImplicitlyWait--is dynamic wait
		//disadvantage---implicitly wait is only applicable for webelements
		//it can be applied for non-web elements  like alerts,url,title of the page
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//implicitly wait be applied with driver
		//imp wait
		//dynamic wait
		//Global wait--->it will be applicable for all the WebElements
		//implicitly wait we need to ignore
		//problem is it is global wait,it is applicable for all the webelements by default
		
		driver.get("https://classic.freecrm.com/index.html");

		//login page--10 sec
		//driver.findElement(By.name("username123")).sendKeys("diliptest");  //rg.openqa.selenium.NoSuchElementException
		driver.findElement(By.name("username")).sendKeys("diliptest");
		driver.findElement(By.name("password")).sendKeys("diip12");
		
		//clicklogin-0 sec
		//if i home page is taking time 15 sec then again we need to apply the implicitly wait
		//homepage--10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//e4--15 sec
		//e5
		//e6
		//implicitly wait 15 sec will be applied 
		
		//contacts page --5 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//e7  --5 sec
		//e8
		//latest implicitly wait is 5 sec
		//home page  it taking 15 sec but implicitly wait is 5 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//click on logout
		//login page:--5 sec ,it is ugly script again we need to override the implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//i dont want wait for each and every element ,i need a custom wait explicitly will come into the picture
		
		//registration page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		//0sec--nulify of implicitly wait
		//e10
		//e11
		//e12
		
		//login page--0 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}

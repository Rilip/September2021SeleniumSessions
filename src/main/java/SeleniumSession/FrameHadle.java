package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHadle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		
		//overloaded methods which are available i frames
		//driver.switchTo().frame(2);  //Title bar (top.html)  
		//driver.switchTo().frame("main"); //Title bar (top.html)  -->we will prefer 2 or 3 option
		driver.switchTo().frame(driver.findElement(By.name("main"))); //this is kind of webelement  Title bar (top.html)
		//driver.switchTo().f  index,by name webelement
		String header = driver.findElement(By.xpath("/html/body/h2")).getText();  //org.openqa.selenium.NoSuchElementException
		System.out.println(header);
		
		
	}

}

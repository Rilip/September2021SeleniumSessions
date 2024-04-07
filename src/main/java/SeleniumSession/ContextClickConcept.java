package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		//right click me means context click
		WebDriverManager.firefoxdriver().setup();
		driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightclickme = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);
		act.contextClick(rightclickme).build().perform();
      //  act.contextClick(rightclickme).perform();  working fine
		//act.contextClick(rightclickme).build();  //not working and it will not give any error also
		//List<WebElement> optlist = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));
		List<WebElement> optlist = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]/span"));
	for (WebElement e : optlist) {
		String text = e.getText();
		System.out.println(text);
		if (text.equals("Copy")) {
			e.click();
			break;
		}
	}
	}

}

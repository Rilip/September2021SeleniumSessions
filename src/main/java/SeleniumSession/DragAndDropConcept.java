package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) {
		
		//element to element on the page
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	WebElement sourcele = driver.findElement(By.id("draggable"));
	WebElement targetele = driver.findElement(By.id("droppable"));
	
	Actions act=new Actions(driver);
	//act.clickAndHold(sourcele).moveToElement(targetele).release().build().perform();
    act.dragAndDrop(sourcele, targetele).build().perform();
	}

}

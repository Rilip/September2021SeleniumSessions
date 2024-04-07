	package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	//move to element
	//parent to child menu handling
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://mrbool.com/search/");
		//driver.findElement(By.linkText("COURSES")).click();  // org.openqa.selenium.NoSuchElementException
//		WebElement parentmenu = driver.findElement(By.cssSelector("a.menulink"));
//		
//		Actions act=new Actions(driver);
//		act.moveToElement(parentmenu).perform();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("COURSES")).click();
		
		By contentmenu = By.cssSelector("a.menulink");
		By courseslink = By.linkText("COURSES");
		By articleslik = By.linkText("ARTICLES");
		doClickOnChildMenuLocator(contentmenu, courseslink);
		doClickOnChildMenuLocator(contentmenu, articleslik);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doMoveToElement(By locator) {
		Actions act=new Actions(driver);
		act.moveToElement(getElement(locator)).perform();
	}
	public static void doClickOnChildMenuLocator(By parentMenuLoctor,By childMenuLocator) throws InterruptedException {
		doMoveToElement(parentMenuLoctor);
		Thread.sleep(3000);
		getElement(childMenuLocator).click();
	}

}

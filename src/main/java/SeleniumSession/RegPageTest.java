package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brutil=new BrowserUtil();
		WebDriver driver = brutil.lauchBrowser("chrome");
		brutil.enterurl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = brutil.getTitle();
		System.out.println("page title is:"+title);
		
		if (title.contains(" Account")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		By firstname = By.id("input-firstname");
		By lastname=By.id("input-lastname");
		By email = By.id("input-email");
		
		ElemetUtil eleutil=new ElemetUtil(driver);
		eleutil.doSendKeys(firstname, "Sharmi");
		eleutil.doSendKeys(lastname, "Hauque");
		eleutil.doSendKeys(email, "Sharmin@gmail.com");
		
		Thread.sleep(5000);
		brutil.closethebrowser();
	}

}

package AppTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest{
	
	@Test
	public void registerlinktest() {
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		boolean flag = driver.findElement(By.linkText("Register")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void urlTest() {
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("account/login"));
	}
	
	
	
}

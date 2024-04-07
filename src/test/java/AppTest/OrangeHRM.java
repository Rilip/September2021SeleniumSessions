package AppTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRM extends BaseTest {
//	static WebDriver driver;
//	//@BeforeMethod
//	@BeforeClass
//	public void DBConnection() {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
//	}
//	
	@Test(priority = 1)
	public void ContactSalesTest() {
		//driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		boolean flag = driver.findElement(By.name("Contact Sales")).isDisplayed();
		Assert.assertTrue(flag);
	}
	@Test(priority = 2)
	public void urlTest() {
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("orangehrm.com"));
	}
	
	
//	@AfterClass
//	public void teardown() {
//		driver.quit();
//	}
}

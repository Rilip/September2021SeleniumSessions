package AppTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GooglTest extends BaseTest {
	//static WebDriver driver;
	//@BeforeMethod
//	@BeforeClass
//	public void DBConnection() {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com");
//	}
	@Test
	public void searchtest() {
	//	driver.get("https://www.google.com");
		boolean flag = driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(flag);
	}
	@Test
	public void googleSearchButtonTest() {
		boolean flag = driver.findElement(By.name("btnK")).isDisplayed();
		Assert.assertTrue(flag);
	}
	@Test
	public void urlTest() {
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("google"));
	}
	
	
//	@AfterClass
//	public void teardown() {
//		driver.quit();
//	}
}

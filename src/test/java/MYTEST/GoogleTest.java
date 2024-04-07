package MYTEST;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
static WebDriver driver;

  @BeforeSuite
  public void DBConnection() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().deleteAllCookies();
	  driver.manage().window().fullscreen();
  }
  @Test
  public void googlesearchtest() {
	  boolean flag = driver.findElement(By.name("q")).isDisplayed();
	  Assert.assertTrue(flag);
  }
  @Test
  public void titletest() {
	  String flag = driver.getTitle();
	  Assert.assertTrue(flag.contains("Google"));
  }
  @Test
  public void geturl() {
	  String flag = driver.getCurrentUrl();
	  Assert.assertTrue(flag.contains("oogle.com"));
  }
  @AfterSuite
  public void closethebrowser() {
	  driver.close();
  }

}

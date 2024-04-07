package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {
static WebDriver driver;
		public static void main(String[] args)  {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //driver.get("https://www.google.com/");
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
     //   driver.get("https://classic.crmpro.com/index.html");
       // driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        js.executeScript("alert('hi')");
        
        JavaScriptUtil jsutil=new JavaScriptUtil(driver);
        String title = jsutil.getTitleByJS();   //document.title  ,,document is the object of DOM
        System.out.println(title);
        
       // jsutil.generateAlert("this is my js popup");
        
//       String innertext = jsutil.getPageInnerText();  //document.documentElement.innerText
//       System.out.println(innertext);
//       System.out.println(innertext.contains("Business"));
		
       // jsutil.refreshBrowserByJS();  //history.go(0)
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        WebElement loginform = driver.findElement(By.id("loginForm"));
       // jsutil.drawBorder(login);
      //  jsutil.drawBorder(loginform);
        
//        jsutil.flash(login);
//        jsutil.flash(loginform);
        
        jsutil.clickElementByJS(loginform);
        
        jsutil.scrollPageDown();  //window.scrollTo(0,document.body.scrollHeight)
        
		}
}

package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSAlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		
		//alert
		//cofirmartion pop up
		//warning pop up
		//submission pop up
		//alert('this is my alert')  (Custom alert ,JavaScript alert), alert we cannot inspect it
		//model dialog
		//JS pop up
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();

		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		if (text.equals("Please enter a valid user name")) {
			System.out.println("correct validation message");
			
		}
		//alert.accept();//click on OK button
		alert.dismiss();//press esc or cancel or dismiss the alert
	}

}

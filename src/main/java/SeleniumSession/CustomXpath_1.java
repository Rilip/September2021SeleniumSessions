package SeleniumSession;

import org.openqa.selenium.By;

public class CustomXpath_1 {

	public static void main(String[] args) {
		
		By x1 = By.xpath("//input[@class='form-control private-form__control login-email']");  //right
		By x2 = By.className("form-control private-form__control login-email");//wrong  ,because class name should be unique
		By x3 = By.className("login-email");//right
        By x4 = By.className("form-control");  //right  11-56.17
        
        //indexing
        //(//div[@class='container'])[3]
        //(//div[@class='container'])[3]//a
        //((//div[@class='container'])[3]//ul)[1]
        //((//div[@class='container'])[3]//ul)[5]--social media links
        ////ul[@class='social-links']//a
        //(//input[@type='text'])[3]
        //(//input[@type='text'])[position()=2]
        //(//input[@type='text'])[last()]
	}

}

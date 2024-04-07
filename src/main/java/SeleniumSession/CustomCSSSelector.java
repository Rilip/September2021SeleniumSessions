package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSSelector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//CSS selector is not a attribute
		
		By.cssSelector("");
		//id--->#id
		//tag#id
		//class---> .classname
		//tag.classame
		
		// #input-email
		//input#input-email  --with html tag

		//.form-control
		//input.form-control
		
		//#id.classname
		//#input-email.form-control
		//.form-control#input-email
		//tag#id.classname
		//input#input-email.form-control
		//input.form-control#input-email
		
		//.c1.c2.c3
		//.form-control.private-form__control.login-email
		//htmltag.form-control.private-form__control.login-email
		//input.form-control.private-form__control.login-email
		//input.form-control.private-form__control.login-email#username
		//input#username.form-control.private-form__control.login-email
		
		//orangehrm
		//#Form_getForm_Name
		//#Form_getForm_Name.text
		
		//if id and class is not available
		//tag[attr='value']
		//input[name='Name']  -->CSS syntax
		////input[@name='Name']  -->Xpath
		//in CSS we never use using @ and xpath starts with "//" ,in css there is no "//"
		//By.cssSelector("input[name='Name']");
		//input[name='Name'][type='text']  with two attributes
		
		//tag[attri='value']
		//input[id*='_Name']  --Contains  ends with   input[id*='-email']
		//input[id^='Form']  --contains starts with
		//   input[id^='input-']---contains starts with
		//   input[id*='email'] --contains ends with
		//   input[id$='email']  --contains ends with
		
		//parent to child concept
		//div.private-form__input-wrapper input -->2(space means direct and indirect child elements)
		//div.private-form__input-wrapper >input -->2( > means only direct)
		
		//form#hs-login div  -->20 divs  (direct and indirect divs)
		//form#hs-login>div  -->8 divs (direct association)
		
		//child to parent not allowed
		//backward traversing is not allowed in CSS
		//preceding sibling also  not allowed
		
		////following sibling also  not allowed
		//div.private-form__input-wrapper+div
		
		//footer>div.container
		//footer>.container> .row
		//footer>.container> .row>div  all divs
		//footer>.container> .row>div>.list-unstyled
		//footer>.container> .row>div>.list-unstyled a
		//footer>.container> .row>div>.list-unstyled >li+li
		//footer>.container .row ul>li >a
		//footer>.container .row ul.list-unstyled---4 list
		//footer>.container .row ul.list-unstyled>li  --15
		//footer>.container .row ul.list-unstyled>li +li  -->1 st one will be ignored
		
		//comma in CSS
		//input#username,input#password--2 un and pwd both
		List<WebElement> formfields = driver.findElements(By.cssSelector("input#username,input#password"));
		System.out.println(formfields.size());
		if (formfields.size()==4) {
			System.out.println("all formfields present on the page");
		}
		 //footer CSS -freshworks
		//footer-nav
		//nth of type
		//collect the all elements and pass the index
		//div.footer-main ul li:nth-of-type(1)
		
	}

}

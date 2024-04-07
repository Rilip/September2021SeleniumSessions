package SeleniumSession;

public class ExplicitlyWaitConcept {

	public static void main(String[] args) {
	
		//ExplicitlyWait is high level wait means it is just concept
		//dynamic in nature
		//it is not global wait
		//it can be applied for specific element not for the all Web elements
		//it can be customized for a specific element as per the use case
		//it can be applied for all non webelements like alert.url,title of the page
		
		//WebDriverWait and  FluentWait both wait are called explicitly wait   
		//WebDriverWait(C) ---actually extending from-(Extends)----->FluentWait(C)----Implementing--->Wait(I)--->UNTIL(M)
		//FuentWait(C)-----implements----Wait(I) --->UntilMethod is abstract method
		//1.untill method which is overridden
		//2.individual method of FluentWait  ex;ignoring(),withMessage(),pollingEvery()
	    //Child of Fluent Wait is WebDriverWait
		
		//WebDriverWait(C)---which is extending the--->FluentWait(C)
		//timeoutException----protected
		//1.untill method which is inherited
		//2.inherited method of FluentWait  ex;ignoring(),withMessage(),pollingEvery()
		
		

	}

}

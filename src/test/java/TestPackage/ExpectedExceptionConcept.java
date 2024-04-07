package TestPackage;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	@Test(expectedExceptions = ArithmeticException.class)
	public void logintest() {
		System.out.println("login test..");
		int a=9/0;
	}
//	String a="Tom";
	@Test(expectedExceptions = ArithmeticException.class)
	public void logintest1() {
		System.out.println("Login test1..");
		int a=9/0;
		ExpectedExceptionConcept obj=new ExpectedExceptionConcept();
		obj=null;
		System.out.println(obj);
	}
	
}

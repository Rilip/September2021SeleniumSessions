package MYTEST;

import org.testng.annotations.Test;

public class ExceptedExceptionConcept {

//	@Test(expectedExceptions = ArithmeticException.class)
//	public void logintest() {
//		System.out.println("login ....");
//		int a=9/0;  //java.lang.ArithmeticException: / by zero
//	}
//	String a="Tom";
//	
//	@Test(expectedExceptions = NullPointerException.class)
//	public void logintest() {
//		System.out.println("login ....");
//		ExceptedExceptionConcept obj=new ExceptedExceptionConcept();
//		obj=null;
//		System.out.println(obj.a);  //java.lang.NullPointerException:
//		
//	}
	String a="Tom";
	
//	@Test(expectedExceptions = NullPointerException.class)
//	public void logintest() {
//		System.out.println("login ....");
//		int a=9/0;  //java.lang.ArithmeticException:
//		ExceptedExceptionConcept obj=new ExceptedExceptionConcept();
//		obj=null;
//		System.out.println(obj.a);  //java.lang.NullPointerException:
//		
//	}
	
//	@Test(expectedExceptions = {NullPointerException.class,ArithmeticException.class})
//	public void logintest() {
//		System.out.println("login ....");
//		int a=9/0;  //java.lang.ArithmeticException:
//		ExceptedExceptionConcept obj=new ExceptedExceptionConcept();
//		obj=null;
//		System.out.println(obj.a);  //java.lang.NullPointerException:
//		
//	}
	
//	@Test(expectedExceptions = {NullPointerException.class,ArithmeticException.class})
//	public void logintest() {
//		System.out.println("login ....");
//		//int a=9/0;  //java.lang.ArithmeticException:
//		ExceptedExceptionConcept obj=new ExceptedExceptionConcept();
//		obj=null;
//		System.out.println(obj.a);  //java.lang.NullPointerException:
//	}	
	
//	@Test(expectedExceptions = {NullPointerException.class,ArithmeticException.class})
//	public void logintest() {
//		System.out.println("login ....");
//		//int a=9/0;  //java.lang.ArithmeticException:
//		ExceptedExceptionConcept obj=new ExceptedExceptionConcept();
//		//obj=null;
//		System.out.println(obj.a);  //java.lang.NullPointerException:
//	//org.testng.TestException: 
//   }
	//parent of all exception class
//	@Test(expectedExceptions = Exception.class)
//	public void logintest() {
//		System.out.println("login ....");
//		int a=9/0;  //java.lang.ArithmeticException:
//		ExceptedExceptionConcept obj=new ExceptedExceptionConcept();
//		//obj=null;
//		System.out.println(obj.a);  //java.lang.NullPointerException:
// 
//   }
	//Pass
//	@Test(expectedExceptions = Throwable.class)
//	public void logintest() {
//		System.out.println("login ....");
//		int a=9/0;  //java.lang.ArithmeticException:
//		ExceptedExceptionConcept obj=new ExceptedExceptionConcept();
//		//obj=null;
//		System.out.println(obj.a);  //java.lang.NullPointerException:
//   }
	
	@Test(expectedExceptions = {NullPointerException.class,ArithmeticException.class})
	public void logintest() {
		System.out.println("login ....");
		try {
			int a=9/0;  //org.testng.TestException: if used exception class then u not used with  try  catch block  
		} catch (ArithmeticException e) {
			System.out.println("AE is Coming...");
		}
		  
		ExceptedExceptionConcept obj=new ExceptedExceptionConcept();
		//obj=null;
		System.out.println(obj.a);  
	}	
}

package MYTEST;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependsOnMethodConcept {
/* On the basis of alphabets
 * login To app
   Search Page Test
   home Page Test
 */
//	@Test
//	public void loginTest() {
//		System.out.println("login To app");
//	}
//	@Test(dependsOnMethods ="loginTest" )
//	public void homePageTest() {
//		System.out.println("home Page Test");
//	}
//	@Test(dependsOnMethods ="loginTest" )
//	public void SearchTest() {
//		System.out.println("Search Page Test");
//	}
	
	/***************/
	/*login To app
      home Page Test
      Search Page Test*/
//	@Test
//	public void loginTest() {  //super method
//		System.out.println("login To app");
//	}
//	@Test(dependsOnMethods ="loginTest",priority = 1 )
//	public void homePageTest() {
//		System.out.println("home Page Test");
//	}
//	@Test(dependsOnMethods ="loginTest",priority = 2 )
//	public void SearchTest() {
//		System.out.println("Search Page Test");
//	}
//	@Test
//	public void loginTest() {  //super method
//		System.out.println("login To app");
//		int i=9/0;  //java.lang.ArithmeticException: / by zero   //failed
//	}
//	@Test(dependsOnMethods ="loginTest",priority = 1 )//skipped
//	public void homePageTest() {
//		System.out.println("home Page Test");
//	}
//	@Test(dependsOnMethods ="loginTest",priority = 2 )//skipped
//	public void SearchTest() {
//		System.out.println("Search Page Test");
//	}
	/*
	 * Create User Test
       login To app
       home Page Test
       Search Page Test
	 */
	
//	@Test
//	public void createUser() {
//		System.out.println("Create User Test");
//	}
//	
//	@Test(priority = 2)
//	public void loginTest() {  //super method
//		System.out.println("login To app");
//		//int i=9/0;  //java.lang.ArithmeticException: / by zero   //failed
//	}
//	@Test(dependsOnMethods ="loginTest",priority = 1 )
//	public void homePageTest() {
//		System.out.println("home Page Test");
//	}
//	@Test(dependsOnMethods ={"loginTest","createUser"},priority = 2 )
//	public void SearchTest() {
//		System.out.println("Search Page Test");
//	}
	//unit test:
	//test cases should be independent
	//never create any dependency among two methods or multiple methods
	//every test should have its own pre condition and it is own test steps, assertion, status
	
	/***************/
	/* browser launched
	 * Create User Test
       login To app
       Search Page Test
       PASSED: loginTest
       PASSED: SearchTest
       FAILED: createUser
       SKIPPED: homePageTest
	 */
//	@BeforeTest
//	public void launchbrowser() {
//		System.out.println("browser launched");
//	}
//	@Test
//	public void createUser() {
//		System.out.println("Create User Test");
//		int i=9/0;
//	}
//	
//	@Test
//	public void loginTest() {  //super method
//		System.out.println("login To app");
//		//int i=9/0;  //java.lang.ArithmeticException: / by zero   //failed
//	}
//	@Test(dependsOnMethods ={"loginTest","createUser"},priority = 1 )
//	public void homePageTest() {
//		System.out.println("home Page Test");
//	}
//	@Test(dependsOnMethods ="loginTest",priority = 2 )
//	public void SearchTest() {
//		System.out.println("Search Page Test");
//	}
	/**************/
	//Total tests run: 4, Failures: 1, Skips: 1
	/*browser launched
      Create User Test
      browser launched
      login To app
      browser launched
      Search Page Test
      PASSED: loginTest
      PASSED: SearchTest
      FAILED: createUser
      SKIPPED: homePageTest
	 * 
	 */
//	@BeforeMethod
//	public void launchbrowser() {
//		System.out.println("browser launched");
//	}
//	@Test
//	public void createUser() {
//		System.out.println("Create User Test");
//		int i=9/0;
//	}
//	
//	@Test
//	public void loginTest() {  //super method
//		System.out.println("login To app");
//		//int i=9/0;  //java.lang.ArithmeticException: / by zero   //failed
//	}
//	@Test(dependsOnMethods ={"loginTest","createUser"},priority = 1 )
//	public void homePageTest() {
//		System.out.println("home Page Test");
//	}
//	@Test(dependsOnMethods ="loginTest",priority = 2 )
//	public void SearchTest() {
//		System.out.println("Search Page Test");
//	}
	/**********/
	/*
	 * browser launched
       FAILED CONFIGURATION: @BeforeMethod launchbrowser
       Total tests run: 4, Failures: 0, Skips: 4
       Configuration Failures: 1, Skips: 1
	 */
	@BeforeMethod
	public void launchbrowser() {
		System.out.println("browser launched");
		int i=9/0;
	}
	@Test
	public void createUser() {
		System.out.println("Create User Test");
		//int i=9/0;
	}
	
	@Test
	public void loginTest() {  //super method
		System.out.println("login To app");
		//int i=9/0;  //java.lang.ArithmeticException: / by zero   //failed
	}
	@Test(dependsOnMethods ={"loginTest","createUser"},priority = 1 )
	public void homePageTest() {
		System.out.println("home Page Test");
	}
	@Test(dependsOnMethods ="loginTest",priority = 2 )
	public void SearchTest() {
		System.out.println("Search Page Test");
	}
}

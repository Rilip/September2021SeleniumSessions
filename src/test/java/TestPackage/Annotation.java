package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {

	@BeforeSuite
	public void DB_Connection() {
		System.out.println("BS--------------->DB Conection");
	}
	@BeforeTest
	public void createuser() {
		System.out.println("BT--------------->Create User");
	}
	@BeforeClass
	public void launchbrowser() {
		System.out.println("BC------------>Launch Browser");
	}
	@BeforeMethod
	public void logintoapp() {
		System.out.println("BM------------>Login To APP");
	}
	@Test
	public void userinfotest() {
		System.out.println("Test1--->Use Info Test");
	}
	@Test
	public void accountinfotest() {
		System.out.println("Test2--->Account Info Test");
	}
	@Test
	public void profiletest() {
		System.out.println("Test3--->Profile Test");
	}
	@AfterMethod
	public void logoutApp() {
		System.out.println("AM---->Logout App");
	}
	@AfterClass
	public void closetheBrowser() {
		System.out.println("AC---->Close the Browser");
	}
	@AfterTest
	public void deletetheuser() {
		System.out.println("AT--->Delete the User");
	}
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS--->Disconnect the DB");
	}
	/*
	 * Before Suite
	 * Before Test
	 * Before Class
	 * Before Method
	 * @Test
	 * @Test
	 * @After Method 
	 * @After Class
	 * @After Test
	 * @After Suite
	 */
}

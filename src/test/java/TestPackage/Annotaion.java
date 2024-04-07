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

public class Annotaion {

	@BeforeSuite
	public void DBCONNECTION() {
		System.out.println("BS-------------->DBCONNECTION");
	}
	@BeforeTest
	public void createuser() {
		System.out.println("BT--------------->Create User");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC---------------->launchBrowser");
	}
	@BeforeMethod
	public void logintoApp() {
		System.out.println("BM-------------->loginoApp");
	}
	@Test
	public void userinfotest() {
		System.out.println("UserInfoTest...");
	}
	@Test
	public void accInfoTest() {
		System.out.println("Account Info Test");
	}
	@Test
	public void profileTest() {
		System.out.println("Profile Test");
	}
	@AfterMethod
	public void logoutapp() {
		System.out.println("AM-----------logoutapp");
	}
	@AfterClass
	public void closethebrowser() {
		System.out.println("AC------------->Close the browser");
	}
	@AfterTest
	public void deleteuser() {
		System.out.println("AM------------------>delete the user");
	}
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS-------------->disconnectDB");
	}
	
}


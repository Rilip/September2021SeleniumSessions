package MYTEST;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsConcept {

	@BeforeSuite
	public void DBConnection() {
		System.out.println("BS------>DBConnection");
	}
	@BeforeTest
	public void createuser() {
		System.out.println("BT--------->createuser");
	}
	@BeforeClass
	public void launchbrowser() {
		System.out.println("BC--------->launchbrowser");
	}
	@BeforeMethod
	public void loginToapp() {
		System.out.println("BM--------->loginToapp");
	}
	@Test
	public void userInfoTest() {
		System.out.println("userInfoTest");
	}
	@Test
	public void accInfoTest() {
		System.out.println("accInfoTest");
	}
	@Test
	public void profileTest() {
		System.out.println("profileTest");
	}
//	@AfterMethod
//	public void logoutToapp() {
//		System.out.println("AM--------->logoutToapp");
//	}
	@AfterClass
	public void closeThebrower() {
		System.out.println("AC--------->closeThebrower");
	}
	@AfterTest
	public void deletetheUser() {
		System.out.println("AT--------->deletetheUser");
	}
	@AfterSuite
	public void disconnecDB() {
		System.out.println("AS------>disconnecDB");
	}
}
/*
BS------>DBConnection
BT--------->createuser
BC--------->launchbrowser

BM--------->loginToapp
accInfoTest
AM--------->logoutToapp

BM--------->loginToapp
userInfoTest
AM--------->logoutToapp

AC--------->closeThebrower
AT--------->deletetheUser
AS------>disconnecDB
*/
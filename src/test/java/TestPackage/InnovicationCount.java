package TestPackage;

import org.testng.annotations.Test;

public class InnovicationCount {

	@Test(invocationCount=10)
	public void createUser() {
		System.out.println("Repeated Test Cases");
	}
}

package MYTEST;

import org.testng.annotations.Test;

public class InnovactionCountTest {
	
	//if you print multiple time same method we use InnovcationCount
@Test(invocationCount = 10)
public void getuser() {
	System.out.println("get user test...");
}
}

package MYTEST;

import org.testng.annotations.Test;

//on the base of alphabetical order execution happening
//priority=0 , priority can hold negative values
//first it will execute priority=0 and non priority cases alphabetical order, then priority 1,2
//Preference given non priority cases and then priority cases
//non priority cases executed first ,having same priority  then it will execute on the basis of alphabetical order

public class PriorityTest {
	
	@Test(priority = 1)
	public void a_Test() {
		System.out.println("a-test");
	}
	@Test(priority = 1)
	public void b_Test() {
		System.out.println("b-test");
	}
	@Test(priority = 1)
	public void c_Test() {
		System.out.println("c-test");
	}
	@Test()
	public void d_Test() {
		System.out.println("d-test");
	}
	@Test()
	public void e_Test() {
		System.out.println("e-test");
	}
	

}

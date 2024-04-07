package TestPackage;

import org.testng.annotations.Test;

public class PriorityCases {
  
	@Test(priority = 1)
	public void test1() {
		System.out.println("1---priority with 1 test");
	}
	@Test(priority = 'a')
		public void testa() {
			System.out.println("a---priority with a Test");
		}
	@Test(priority = 'A')
	public void testA() {
		System.out.println("A---priority with A Test");
	}
	@Test
	public void testb() {
		System.out.println("B--->No priority test");
	}
	
	/*B test --->non priority cases
     1---test--->priority with 1
     A---Test--->priority with A
     a---Test--->priority with a
	 * 
	 */
	
}

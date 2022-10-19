package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	public void DemoTest1() {
		Assert.assertTrue(true);
		System.out.println("Good Evening ---> Java");
		
		Assert.assertEquals("India", "India");//passed
		// if both AC and EC are equals than it wiil execute next statement within a test
	//	Assert.assertEquals("India", "Inia"); //failed 
		//failed --> java.lang.AssertionError: expected [Inia] but found [India]
		System.out.println("Where are you selenium?");
		
		Assert.assertEquals("Java", "Java");//passed
		System.out.println("Hello ! World");
		
	}
	@Test
	public void DemoTest2() {
		Assert.assertTrue(true);
		System.out.println("Automation Testing + APIs Testing");
		System.out.println("Pune");
	}

}

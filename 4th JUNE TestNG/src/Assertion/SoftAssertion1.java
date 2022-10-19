package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion1 {

	SoftAssert SA = new SoftAssert();
	@Test
	public void DemoTest1() {

		SA.assertEquals("welcome", "welcome"); // passed
		System.out.println("Execution Start");
		
		SA.assertEquals("java", "java"); // FAILED: DemoTest1
//		java.lang.AssertionError: The following asserts failed:
//			expected [jva] but found [java]
		System.out.println("SuccessFully Executed Demo test 1");
		SA.assertAll(); //PASSED: DemoTest1
	   	// it will collect the result of all the assertion and in case of any assertion failed that time
    	// it will marked the test as failed
		
	}
	@Test
	public void DemoTest2() {
		SA.assertTrue(false);
		System.out.println("Execution Start Demo Test 2");
		System.out.println("This my first TestNG program");
		SA.assertEquals("Python", "Java");
		System.out.println("Hello");
		SA.assertFalse(true);
		System.out.println("Automation");
		SA.assertEquals(false, true);
		System.out.println("SuccessFully Executed Demo test 2");
		SA.assertAll();
		
	}
}

package TestNG_Annotations_keywors;

import org.testng.annotations.Test;

public class TestNG_invocationCount {
	
	@Test(invocationCount = 15)
	public void addition() {
		int a=10;
		int b=45;
		int c=a+b;
		System.out.println("Sum of : " +c);
	}

}

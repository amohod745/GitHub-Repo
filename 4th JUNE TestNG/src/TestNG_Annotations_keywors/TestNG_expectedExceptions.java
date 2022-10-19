package TestNG_Annotations_keywors;

import org.testng.annotations.Test;

public class TestNG_expectedExceptions {

	//Q - if u want to handle exception without try catch block so how  will u handle it.
	//ans - ExpectedExceptions = Exceptiontype.class

	
	@Test(expectedExceptions = NullPointerException.class)
	public void test1() {
    	System.out.println("Handel NullPointer Exception");
		String s1 =null;
		s1.length();
		System.out.println(s1);
	}
	@Test(expectedExceptions = ArithmeticException.class)
	public void test2() {
    	System.out.println("Handel Arithmetic Exception");
    	int i=10/0;
    	System.out.println(i);
	}
	

	
}

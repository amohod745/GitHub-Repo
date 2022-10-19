package TestNG_Annotations_keywors;

import org.testng.annotations.Test;

public class TestNG_dependsOnMethod {
// use for core fuctionality ---> One test case depends on others test case 
// if exception is occur in one test case where others test case are depends
// than other test cases are skips automatically	
	@Test
	public void logintest() {
	//	int i=10/0;
		int i=10;
		System.out.println(i);
	}
	@Test(dependsOnMethods = "logintest")
	public void Homepage() {
		System.out.println("Home Page");
	}
	@Test(dependsOnMethods = "logintest")
	public void Searchpage() {
		System.out.println("Search Page");
	}
	@Test(dependsOnMethods = "logintest")
	public void Titelpage() {
		System.out.println("Titel Page");
	}

}

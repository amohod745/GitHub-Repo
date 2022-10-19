package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class_Annotations {
	
/*	@BeforeSuite  ---> 1 st preference
 *  @BeforeTest   ---> 2 nd preference 
 *  @BeforeClass  ---> 3 rd preference
 *  
 *  @BeforeMethod 
 *  @Test 
 *  @AfterMethod
 *  
 *  @BeforeMethod
 *  @Test
 *  @AfterMethod
 *  
 *  @BeforeMethod
 *  @Test
 *  @AfterMethod
 *  
 *  @AfterClass
 *  @AfterTest 
 */

// In Real Time Project we dotn need all this annotationas
// we only use @BeforeClass @BeforeMethod @AfterMethod @AfterClass @Test
	
	@BeforeSuite  //1
	public void SetUp() { // always run first when excute new testsuite
		System.out.println("@BeforeSuite ---> Setup system property for chrome");
	}
	@BeforeTest   //2
	public void LanuchBrowser(){
		System.out.println("@BeforeTest ---> LaunchBrowse");
	}
	@BeforeClass //3
	public void URL() {
		System.out.println("@BeforeClass ---> Enter URL");
	}
	@BeforeMethod //4 --> //7 -->//10
	public void login() {
		System.out.println("@BeforeMethod ---> Login into Application");
	}
	@Test //5
	public void GoogleTitel() {
		System.out.println("@Test ---> Google Titel");
	}
	@Test//8
	public void GoogleLogo() {
		System.out.println("@Test ---> Google Log");
	}
	@Test //11
	public void SearchBox() {
		System.out.println("@Test ---> Google Search Box");
	}
	@AfterMethod //6 -->//9 -->//12
	public void LogOut() {
		System.out.println("@AfterMethod ---> LogOut from Application");
	}
	@AfterClass//13
	public void CloseBrowser() {
		System.out.println("@AfterClass ---> Close the Browser");
	}
	@AfterTest//14
	public void deletecookies() {
		System.out.println("@After ---> Delete Cookies");
	}
	@AfterSuite //15
	public void Demo() {
		System.out.println("@AfterSuite ---> Demo fore Annotations sequence of TestNG");
	}
}

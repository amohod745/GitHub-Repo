package Com.OrangeHRM.qa.TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Com.OrangeHRM.qa.Base.OrangeHRM_TestBase;
import Com.OrangeHRM.qa.Pages.OrangeHRM_LoginPage;

public class OrangeHRM_LoginPage_TestCase extends OrangeHRM_TestBase{

	OrangeHRM_LoginPage loginpage;
	
	public OrangeHRM_LoginPage_TestCase() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void SetUp() throws IOException {
		
		initialization(); //method from OrangeHRM_LoginPage_ Testbase class

		loginpage = new OrangeHRM_LoginPage();
	}
	
	@Test
	public void OrangeHRMUsername() throws InterruptedException {
		boolean UserID = loginpage.validateUsername(props.getProperty("username"), props.getProperty("password"));
		Assert.assertTrue(false);
		System.out.println(UserID);
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	

}

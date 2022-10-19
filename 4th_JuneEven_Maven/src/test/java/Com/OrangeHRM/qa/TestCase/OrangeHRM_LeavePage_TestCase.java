package Com.OrangeHRM.qa.TestCase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.OrangeHRM.qa.Base.OrangeHRM_TestBase;
import Com.OrangeHRM.qa.Pages.OrangeHRM_LeavePage;
import Com.OrangeHRM.qa.Pages.OrangeHRM_LoginPage;

public class OrangeHRM_LeavePage_TestCase extends OrangeHRM_TestBase{
	
	OrangeHRM_LoginPage loginpage;
	OrangeHRM_LeavePage leavepage;
	
	public OrangeHRM_LeavePage_TestCase() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void SetUp() throws InterruptedException, IOException {
		OrangeHRM_LoginPage.initialization();
		loginpage = new OrangeHRM_LoginPage();
		leavepage = new OrangeHRM_LeavePage();
	}
	@Test
	public void empleave() throws InterruptedException {
		loginpage.validateUsername(props.getProperty("username"), props.getProperty("password"));
		Thread.sleep(3000);
		
		
	}
	@AfterMethod(enabled = false)
	public void Teardown() {
		driver.quit();
	}
	
}

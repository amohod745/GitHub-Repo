package Com.OrangeHRM.qa.TestCase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.OrangeHRM.qa.Base.OrangeHRM_TestBase;
import Com.OrangeHRM.qa.Pages.OrangeHRM_AdminPage;
import Com.OrangeHRM.qa.Pages.OrangeHRM_LoginPage;

public class OrangeHRM_AdminPage_TestCase extends OrangeHRM_TestBase {

	OrangeHRM_LoginPage loginpage;
	OrangeHRM_AdminPage admin;
	
	
	public OrangeHRM_AdminPage_TestCase() throws IOException {
		super();
	}

	@BeforeMethod
	public void SetUp() throws IOException {
		OrangeHRM_TestBase.initialization();
		
		loginpage = new OrangeHRM_LoginPage();
		admin = new OrangeHRM_AdminPage();
	}
	@Test
	public void AdminPage() throws InterruptedException {
		loginpage.validateUsername(props.getProperty("username"), props.getProperty("password"));
		Thread.sleep(3000);
		admin.adminpage(props.getProperty("username1"));
		Thread.sleep(5000);
		
	}
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
}

package Com.OrangeHRM.qa.TestCase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.OrangeHRM.qa.Base.OrangeHRM_TestBase;
import Com.OrangeHRM.qa.Pages.OrangeHRM_LoginPage;
import Com.OrangeHRM.qa.Pages.OrangeHRM_TimePage;

public class OrangeHRM_TimePage_TestCase extends OrangeHRM_TestBase {
    
	OrangeHRM_TimePage timepage;
	OrangeHRM_LoginPage loginpage;
	
	public OrangeHRM_TimePage_TestCase() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void SetUp() throws IOException {
		OrangeHRM_TestBase.initialization();
		timepage = new OrangeHRM_TimePage();
		loginpage = new OrangeHRM_LoginPage();
	}
	@Test
	public void TimeOrangeHRM() throws InterruptedException {
		loginpage.validateUsername(props.getProperty("username"), props.getProperty("password"));
		timepage.TimeModule(props.getProperty("timeempname"));
	}
	@AfterMethod 
	public void Teardown() {
		driver.quit();
	}

}

package Com.OrangeHRM.qa.TestCase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.OrangeHRM.qa.Base.OrangeHRM_TestBase;
import Com.OrangeHRM.qa.Pages.OrangeHRM_LoginPage;
import Com.OrangeHRM.qa.Pages.OrangeHRM_RecruitmentPage;

public class OrangeHRM_RecruitmentPage_TestCase extends OrangeHRM_TestBase{
	OrangeHRM_RecruitmentPage Recruitmentpage;
	OrangeHRM_LoginPage loginpage;
	
	public OrangeHRM_RecruitmentPage_TestCase() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void SetUp() throws IOException {
		OrangeHRM_TestBase.initialization();
		loginpage = new OrangeHRM_LoginPage();
		Recruitmentpage = new OrangeHRM_RecruitmentPage();
	}
	
	@Test
	public void RecrutPage() throws InterruptedException {
		loginpage.validateUsername(props.getProperty("username"), props.getProperty("password"));
		Recruitmentpage.RecruitmentPage(props.getProperty("fname"), props.getProperty("mname"),
		props.getProperty("lname"), props.getProperty("email"), props.getProperty("mobilenumber"),
		props.getProperty("file"), props.getProperty("keyword"), props.getProperty("msg"));
	}
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
}

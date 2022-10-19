package Com.OrangeHRM.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.OrangeHRM.qa.Base.OrangeHRM_TestBase;

public class OrangeHRM_LeavePage extends OrangeHRM_TestBase{

	@FindBy(xpath = "(//ul[@class=\"oxd-main-menu\"]/li)[3]")
	WebElement leavepage;
	
	
	public OrangeHRM_LeavePage() throws IOException {
	
		PageFactory.initElements(driver, this);
		
	}
	public void leavepage(String empname) throws InterruptedException {
		leavepage.click();
		Thread.sleep(3000);
		
		
	}

	
		
	}


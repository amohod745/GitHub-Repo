package Com.OrangeHRM.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.OrangeHRM.qa.Base.OrangeHRM_TestBase;

public class OrangeHRM_TimePage extends OrangeHRM_TestBase{

	@FindBy(xpath = "(//ul[@class=\"oxd-main-menu\"]/li)[4]")
	WebElement TIME;
	
	@FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
	WebElement selectemployee;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement submitbutton;
	
	
	public OrangeHRM_TimePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public boolean TimeModule(String EmployeeName) throws InterruptedException {
		TIME.click();
		Thread.sleep(3000);
		selectemployee.sendKeys(EmployeeName);
		Thread.sleep(3000);
		submitbutton.click();
		
		return submitbutton.isDisplayed();
	}

}

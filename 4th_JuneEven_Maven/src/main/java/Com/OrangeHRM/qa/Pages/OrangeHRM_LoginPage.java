package Com.OrangeHRM.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Com.OrangeHRM.qa.Base.OrangeHRM_TestBase;

public class OrangeHRM_LoginPage extends OrangeHRM_TestBase {

	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement Username;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement Password;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement LoginButton;
	
	@FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")
	WebElement HomepageUser;
	
	public OrangeHRM_LoginPage ()throws IOException{
		
		PageFactory.initElements(driver, this);
	
    } 
	
	public boolean validateUsername (String UN, String PWD) throws InterruptedException {
		
		Username.sendKeys(UN);
		Thread.sleep(2000);
		
		Password.sendKeys(PWD);
		Thread.sleep(2000);
		
		LoginButton.click();
		
		return HomepageUser.isDisplayed();
	}
	
	
}
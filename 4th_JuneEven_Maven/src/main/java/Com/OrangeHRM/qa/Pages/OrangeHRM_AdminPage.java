package Com.OrangeHRM.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.OrangeHRM.qa.Base.OrangeHRM_TestBase;

public class OrangeHRM_AdminPage extends OrangeHRM_TestBase{

	
	@FindBy(xpath = "//ul[@class=\"oxd-main-menu\"]/li")
	WebElement Admin;
	
	@FindBy(xpath = "//a[@class=\"oxd-main-menu-item active\"]")
	WebElement textadmin;
	
	@FindBy(xpath = "(//input[@class=\"oxd-input oxd-input--active\"])[2]")
	WebElement systemusername;
	
	@FindBy(xpath = "//div[@class=\"oxd-select-text oxd-select-text--active\"]")
	WebElement Userrole;
	
	@FindBy(xpath = "(//div[@class=\"oxd-select-text-input\"])[1]")
	WebElement selectadmin;
	
	public OrangeHRM_AdminPage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	public boolean adminpage(String username1) throws InterruptedException {
		Admin.click();
		Thread.sleep(2000);
		
		textadmin.click();
		Thread.sleep(2000);
		
		systemusername.sendKeys(username1);
		Thread.sleep(3000);
		Userrole.click();
		Thread.sleep(2000);
		selectadmin.click();
		Thread.sleep(3000);
		
		return Admin.isDisplayed();
	}

}

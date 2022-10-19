package Com.OrangeHRM.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.OrangeHRM.qa.Base.OrangeHRM_TestBase;

public class OrangeHRM_RecruitmentPage extends OrangeHRM_TestBase {

	@FindBy(xpath = "(//ul[@class=\"oxd-main-menu\"]/li)[5]")
	WebElement Recruitment;
	
	@FindBy(xpath = "(//button[@type=\"button\"])[4]")
	WebElement addbutton;
	
	@FindBy(xpath = "//input[@name=\"firstName\"]")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@name=\"middleName\"]")
	WebElement middlename;
	
	@FindBy(xpath = "//input[@name=\"lastName\"]")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@placeholder=\"Type here\"]")
	WebElement email;
	
	@FindBy(xpath = "(//input[@placeholder=\"Type here\"])[2]")
	WebElement contactnumber;
	
	@FindBy(xpath = "//input[@type=\"file\"]")
	WebElement uploadfile;
	
	@FindBy(xpath = "//input[@placeholder=\"Enter comma seperated words...\"]")
	WebElement keywords;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Type here\"]")
	WebElement typehere;
	
	@FindBy(xpath = "//input[@type=\"checkbox\"]")
	WebElement checkbox;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement save;
	
	
	public OrangeHRM_RecruitmentPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	public boolean RecruitmentPage
	(String FN, String MN, String LN, String mail, 
	 String Mno, String file, String GK, String msg) throws InterruptedException {
		Recruitment.click();
		Thread.sleep(3000);
		addbutton.click();
		Thread.sleep(3000);
		firstname.sendKeys(FN);
		Thread.sleep(3000);
		middlename.sendKeys(MN);
		Thread.sleep(3000);
		lastName.sendKeys(LN);
		Thread.sleep(3000);
		email.sendKeys(mail);
		Thread.sleep(3000);
		contactnumber.sendKeys(Mno);
		Thread.sleep(3000);
		uploadfile.sendKeys(file);
		Thread.sleep(3000);
		keywords.sendKeys(GK);
		Thread.sleep(3000);
		typehere.sendKeys(msg);
		Thread.sleep(3000);
		checkbox.click();
		Thread.sleep(3000);
		save.click();
		return checkbox.isSelected();
	}

}

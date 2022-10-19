package Com.OrangeHRM.qa.Pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.OrangeHRM.qa.Base.OrangeHRM_TestBase;



public class OrangeHRM_HomePage extends OrangeHRM_TestBase{

	@FindBy(xpath = "//a[contains(text(),\"Reports\")]")
	WebElement reports;
	
	@FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
	WebElement reportname;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement searchbutton;
	
	@FindBy(xpath = "//span[contains(text(),\"Configuration \")]")
	WebElement configubutton;
	
	@FindBy(xpath = "//ul[@class=\"oxd-dropdown-menu\"]/li")
	WebElement configuList;
	
	@FindBy(xpath = "//a[contains(text(),\"Reporting Methods\")]")
	WebElement reportingmethod;
	
	@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
	WebElement addbutton;
	
	@FindBy(xpath = "(//input[@class=\"oxd-input oxd-input--active\"])[2]")
	WebElement inuptfiled;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement savebutton;
	
	@FindBy(xpath = "//a[contains(text(),\"OrangeHRM, Inc\")]")
	WebElement link;
	
	public OrangeHRM_HomePage() throws IOException{
		PageFactory.initElements(driver, this);
		
	}
	public String clickonreport(String reportername) throws InterruptedException {
		reports.click();
		Thread.sleep(2000);
		
		reportname.sendKeys(reportername);
		Thread.sleep(2000);
		
		searchbutton.click();
		
		return reportname.getText();
		
		
	}
	
	public String configu_method() throws InterruptedException {
		configubutton.click();
		Thread.sleep(2000);
		
		configuList.getText();
		
		return configuList.getText();
		
	}
	public String repomethods() throws InterruptedException {
		reportingmethod.click();
		Thread.sleep(2000);
		
		return reportingmethod.getText();
	}
	public String clickonADD(String inputname) throws InterruptedException {
		
		addbutton.click();
		Thread.sleep(2000);
		
		inuptfiled.sendKeys(inputname);
		Thread.sleep(5000);
		
		savebutton.click();
		
		return inuptfiled.getText();
		
	}
	public String OrangeHRMwindow() {
		link.click();
		
		return link.getText();
		
	}
	
}

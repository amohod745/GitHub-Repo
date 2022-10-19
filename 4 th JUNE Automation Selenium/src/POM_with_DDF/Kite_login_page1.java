package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_login_page1 {
	
	//data members/variables should be declared globally with access level private by using @FindBy
	@FindBy(xpath="//input[@id=\"userid\"]")
	private WebElement UserID;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement Password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement LoginButton;
	
	// Initialize within constructor with access level public and pass WebDriver driver as parameter
	// use PageFactory.initElements method with two input as(driver, this);
	public Kite_login_page1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Creat a public void method for each variables which declared with
	//@FinBy annotation present on webpage 
	public void UID(String Username) {
		UserID.sendKeys(Username);
	}
	
	public void pass(String Pass) {
		Password.sendKeys(Pass);
	}
	
	public void LoginTAB() {
		LoginButton.click();
	}
}

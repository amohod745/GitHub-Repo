package POM_page_object_module_withoutDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page1 {

	//data members/variables should be declared globally with access level private by using @FindBy
	
	@FindBy(xpath="//input[@id=\"userid\"]")
	private WebElement Username;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement Password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement LoginButton;
	
	// Initialize within constructor with access level public 
	
	public Kite_Login_Page1 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	//	PageFactory.initElements(null, driver);
	}
	
	// creating method with access level public 
	
	public void UserID() {

		Username.sendKeys("GP8097");

	}
	
	public void Password() {
		
		Password.sendKeys("gms@0110");
		
	}
	
	public void LoginButton() {
		
		LoginButton.click();
		
	}
	

}

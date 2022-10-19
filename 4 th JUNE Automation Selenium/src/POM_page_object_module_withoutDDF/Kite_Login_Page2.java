package POM_page_object_module_withoutDDF;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Kite_Login_Page2 {

	//data members/variables should be declared globally with access level private by using @FindBy

	@FindBy(xpath="//input[@type=\"password\"]") 
	private WebElement PIN;
	
	@FindBy(xpath="//button[@class=\"button-orange wide\"]") 
	private WebElement ContinueButton;
	
	// Initialize within constructor with access level public 
	public Kite_Login_Page2 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// creating method with access level public 
	
	public void UserPIN() {
		PIN.sendKeys("111000");
	}
	
	public void ContinueButton() {
		ContinueButton.click();
	}
	
}

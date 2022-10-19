package POM_page_object_module_withoutDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_HomePage {
	
	//data members/variables should be declared globally with access level private by using @FindBy
	@FindBy(xpath="//span[contains(text(),\"GP8097\")]") 
	private WebElement UserID;
	
	// Initialize within constructor with access level public 
	
	public Kite_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// creating method with access level public 
    public void Homepage() {
    	
    	String ActualID = "GP8097";
    	String ECUserID = UserID.getText();
    	if(ECUserID.equals(ActualID)) {
    		System.out.println("Valid User");
    	}
    	else {
    		System.out.println("Invalid User");
    	}
    	
    	
    }
	
	
	

}

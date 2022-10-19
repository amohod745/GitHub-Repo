package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_page2 {
	
	//data members/variables should be declared globally with access level private by using @FindBy
    @FindBy(xpath="//input[@type=\"password\"]")
    private WebElement PINnumber;
    
    @FindBy(xpath="//button[@type=\"submit\"]")
    private WebElement ContinueBUtton;
    
   //Initialize within constructor with access level public and pass WebDriver driver as parameter
   //Use PageFactory.initElements method with two input as(driver, this); 
    
    public Kite_Login_page2(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
   // creating method with access level public 
    public void pinForID(String pin) {
    	PINnumber.sendKeys(pin);
    }
    
    public void PINbutton() {
    	ContinueBUtton.click();
    }
    

}

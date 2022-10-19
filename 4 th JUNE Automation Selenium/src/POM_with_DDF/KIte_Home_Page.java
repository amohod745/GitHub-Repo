package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KIte_Home_Page {

	//data members/variables should be declared globally with access level private by using @FindBy
    @FindBy(xpath="//span[contains(text(),\"GP8097\")]")
    private WebElement CorrectUserID;
    
    //Initialize within constructor with access level public and pass WebDriver driver as parameter
    //Use PageFactory.initElements method with two input as(driver, this); 
    
    public KIte_Home_Page(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
  //Creat a public void method for each variables which declared with
  //@FinBy annotation present on webpage 
    
    public void verifyUserID(String expecteduserid) {
    	String ActualUSerID = CorrectUserID.getText();
    	if(expecteduserid.equals(ActualUSerID)) {
    		System.out.println("VALID USER");
    	}
    	else {
    		System.out.println("INVALID USER");
    	}
    	
    	
    }
	
}

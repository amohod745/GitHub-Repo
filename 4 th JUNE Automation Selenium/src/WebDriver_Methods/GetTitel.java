package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitel {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
	    String Title = driver.getTitle();
	    System.out.println(Title);
	    
	    String ExpectedResult = "Facebook – log in or sign up";
	    
	    if (Title.equals(ExpectedResult)) 
	    {
	    	System.out.println("Correct Titel");
	    }
	    else
	    {
	    	System.out.println("Incorrect Titel");
	    }
	    
	}
	
}



	
	
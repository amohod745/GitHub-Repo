package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
		
	    	System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
	    	
		  //  System.setProperty("webdriver.chrome.driver", "chromedriver");
			
		    WebDriver driver = new ChromeDriver();  // up casting
			
			driver.manage().window().maximize();
			
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			
			Thread.sleep(15000);
			
			
			
	}

}
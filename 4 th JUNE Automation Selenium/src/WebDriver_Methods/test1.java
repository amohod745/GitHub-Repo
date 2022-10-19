package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
      
		
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver_win32\\chromedriver.exe");
	
	     WebDriver driver = new ChromeDriver();
	     
	  //   driver.get("https://www.whatsapp.com");
	     
	 //    driver.get("https://www.facebook.com/login");
	     
	    driver.get("https://www.youtube.com");
	}

}

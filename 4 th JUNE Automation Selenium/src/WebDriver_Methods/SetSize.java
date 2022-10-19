package WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/java/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(8000);
		
		 Dimension size1 = new Dimension(1000,600);
		 
		 driver.manage().window().setSize(size1);
		 
		 Thread.sleep(5000);
		 
		 driver.close();
		 
	  	}

}

package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
	    WebElement 	Email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
	    
	    Email.sendKeys("AKShay@7859");
	    Thread.sleep(2000);
	    Email.clear();
	    
	    Email.sendKeys("1233@ajsjkh");
	    Thread.sleep(2000);
	    Email.clear();
	    
	    driver.quit();
		
		
	}

}

package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
	    
	    Thread.sleep(10000);
	    
      //  driver.close();
	    
	    driver.quit();

	}

}

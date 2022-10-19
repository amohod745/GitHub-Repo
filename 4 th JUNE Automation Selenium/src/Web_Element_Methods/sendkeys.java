package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.get("https://kite.zerodha.com/");
	   
	    Thread.sleep(3000);
	   
	    driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys("Ak45");
	   
	   }

}

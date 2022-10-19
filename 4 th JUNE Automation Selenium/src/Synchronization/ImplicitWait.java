package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		//Implicit wait always applied globally	
		// it's avaliable for all webelement on the webpage
		//Dynamic in nature
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Pune");
		
	//	Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Mumbai");
		

	}

}

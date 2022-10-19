package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyIndex {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("8866330484");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("B/166akky");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		
		Thread.sleep(5000);
		
	//	driver.findElement(By.xpath("//div[@class=\"xtXmba\"][1]")).click();
		
	//	driver.findElement(By.xpath("//div[@class=\"eFQ30H\"][4]")).click();
		
	//	driver.findElement(By.xpath("//img[@class=\"kJjFO0 _3DIhEh\"][1]")).click();
		
   //	driver.findElement(By.xpath("//a[@class=\"_2KpZ6l _3dESVI\"]")).click();
		
		driver.findElement(By.xpath("//img[@class=\"_396cs4 _3exPp9\"][1]")).click();
		
		
		
		
		
		
	}

}

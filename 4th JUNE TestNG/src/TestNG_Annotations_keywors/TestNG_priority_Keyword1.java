package TestNG_Annotations_keywors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_priority_Keyword1 {

	WebDriver driver; 
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		
	}
	@Test(priority = 1)
	public void Loginclick() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		System.out.println("priority 1");
	}
	@Test(priority = 2)
	public void forgotpassword() {
		driver.findElement(By.xpath("//a[contains(text(),\"Forgot user ID or password?\")]")).click();
		System.out.println("priority 2");
	}
	@Test(priority = 3)
	public void download() {
		driver.findElement(By.xpath("//img[@alt=\"Kite Android\"]")).click();
		System.out.println("priority 3");
	}
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
}

package Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssert1 {

	WebDriver driver;	
	@SuppressWarnings("deprecation")
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
}
	@Test
	public void username() throws InterruptedException {
		WebElement ID = driver.findElement(By.xpath("//input[@id=\"userid\"]"));
		WebElement pass = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		
		//AssertTrue
		Assert.assertTrue(ID.isDisplayed());
		ID.sendKeys("GP8097");
		
		Thread.sleep(2000);
		Assert.assertTrue(pass.isDisplayed());
		pass.sendKeys("gms@0110");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),\"Login \")]")).click();
		}
	@Test(enabled = false)
	public void assertFalse() throws InterruptedException {	
		
		WebElement ID = driver.findElement(By.xpath("//input[@id=\"userid\"]"));
		WebElement pass = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		
		//Assertfalse  ---> FAILED: assertFalse
//java.lang.AssertionError: expected [false] but found [true]
		Assert.assertFalse(ID.isDisplayed());
		ID.sendKeys("GP8097");
		
		Thread.sleep(2000);
		Assert.assertFalse(pass.isDisplayed());
		pass.sendKeys("gms@0110");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),\"Login \")]")).click();
	}
	@Test
	public void Kite_Login() {
		boolean b =driver.findElement(By.xpath("//img[@alt=\"Kite\"]")).isDisplayed();
		Assert.assertTrue(b);
		Assert.assertEquals(b, true);
	}
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	
	
}
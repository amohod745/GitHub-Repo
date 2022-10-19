package TestNG_Annotations_keywors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_priority_Keyword {
	WebDriver driver;
	//Question - How will u execute TCs in sequence manner  -- Using priority keyword

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
	}
	@Test(priority = 3)
	public void loginButton() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		System.out.println("priority 1");
	}
	@Test(priority = -1)
	public void text() {
		String logintext = driver.findElement(By.xpath("//h2[contains(text(),\"Login to Kite\")]")).getText();
		System.out.println(logintext);
	}
	@Test(priority = 3)
	public void userIDtext() {
		String userid= driver.findElement(By.xpath("//label[contains(text(),\"User ID\")]")).getText();
		System.out.println(userid);
	}
	@Test(priority = -2)
	public void ios() {
		driver.findElement(By.xpath("//img[@alt=\"Kite iOS\"]")).click();
		System.out.println("priority 4");
	}
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
	
}

package TestNG_Annotations_keywors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Groups {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
	}
	@Test(priority = 1,groups = "Homepage")
	public void loginButton() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		System.out.println("priority 1");
	}
	@Test(priority = 2,groups = "Searchpage")
	public void text() {
		String logintext = driver.findElement(By.xpath("//h2[contains(text(),\"Login to Kite\")]")).getText();
		System.out.println(logintext);
	}
	@Test(priority = 3,groups = "Titelpage")
	public void userIDtext() {
		String userid= driver.findElement(By.xpath("//label[contains(text(),\"User ID\")]")).getText();
		System.out.println(userid);
	}
	@Test(priority = 4, groups = "Homepage")
	public void Homepage() {
		System.out.println("Home Page");
	}
	@Test(priority = 5, groups = "Searchpage")
	public void Searchpage() {
		System.out.println("Search Page");
	}
	@Test(priority = 6, groups = "Titelpage")
	public void Titelpage() {
		System.out.println("Titel Page");
	}
	@AfterMethod
	public void TearDowun() {
		driver.quit();
	}

}

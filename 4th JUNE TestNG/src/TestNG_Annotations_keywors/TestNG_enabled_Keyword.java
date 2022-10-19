package TestNG_Annotations_keywors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_enabled_Keyword {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
	}
	@Test(enabled = true)
	public void KiteTitel() {
		String titel = driver.getTitle();
		System.out.println(titel);
	}
	@Test(enabled = false)
	public void loginText() {
		String text = driver.findElement(By.xpath("//h2[contains(text(),\"Login to Kite\")]")).getText();
		System.out.println(text);
	}
	@Test(enabled = true)
	public void ioslogo() {
		boolean ios = driver.findElement(By.xpath("//img[@alt=\"Kite iOS\"]")).isDisplayed();
		System.out.println(ios);
	}
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}

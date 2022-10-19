package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import graphql.Assert;

public class DataProvider_2 {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(dataProvider = "TestData For Admin")
	public void logigTest(String user, String pwd, String EXP) throws InterruptedException {
		driver.get("https://admin-demo.nopcommerce.com/login"); 
		
		WebElement Username = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		Thread.sleep(2000);
		Username.clear();
		Thread.sleep(2000);
		Username.sendKeys(user);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		Thread.sleep(2000);
		pass.clear();
		Thread.sleep(2000);
		pass.sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		String Exp_Titel = "Dashboard / nopCommerce administration";
		String Acp_Titel = driver.getTitle();
		
		if(EXP.equals("Valid")) {
			if(Exp_Titel.equals(Acp_Titel)) {
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		else if(EXP.equals("Invalid")) {
			if(Exp_Titel.equals(Acp_Titel)) {
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		}
	}
	@DataProvider(name ="TestData For Admin")
	public String[][] testdata() {
		String[][] data =
			    {{"admin@yourstore.com", "admin", "Valid"},
				{"admin@yourstore.com", "adnim", "Invalid"},
				{"admin@yostore.com", "admin", "Invalid"},
				{"admin@rstore.com", "admisfsfd", "Invalid"}};
		
		return data;

    }
	@AfterClass
	public void TearDown() {
		driver.quit();
	}
}
package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_1 {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test(dataProvider = "TestData For LoginHRM")
	public void LoginHRM(String Username, String Password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),\"Paul Collings\")]")).isDisplayed());
		Thread.sleep(3000);
		driver.close();
		
	}
	@DataProvider(name ="TestData For LoginHRM")
	public Object[][] Testdata() {
		Object[] [] data = new Object[4] [2]; //combination of test data
		//Correct Username & Correct password
		
		data [0][0] = "Admin";
		data [0][1] = "admin123";
		
		//Correct Username & InCorrect password
		
		data [1][0] = "Admin";
		data [1][1] = "adm123";
		
		//InCorrect Username & Correct password
		
		data [2][0] = "Admin77895";
		data [2][1] = "admin123";
		
		//Correct Username & Correct password
		
		data [3][0] = "Adsgmin";
		data [3][1] = "admin12fhd3";
		
	    return data;	
	}

}

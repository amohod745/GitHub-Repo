package Parameterazation_By_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Test1 {
WebDriver driver;
@SuppressWarnings("deprecation")
@BeforeMethod
@Parameters({"URL"})
public void SetUp(String URL) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}
@Test
@Parameters({"Username","Password"})
public void LoginTest(String Username, String Password) throws InterruptedException {
	
	WebElement User1 = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
	Thread.sleep(2000);
	User1.clear();
	Thread.sleep(2000);
	User1.sendKeys(Username);
	
	WebElement pass1 = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
	Thread.sleep(2000);
	pass1.clear();
	Thread.sleep(2000);
	pass1.sendKeys(Password);
	
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	Thread.sleep(2000);
	
	String Exp_Titel = "Dashboard / nopCommerce administration";
	String Acp_Titel = driver.getTitle();
	
	if(Exp_Titel.equals(Acp_Titel)) 
		System.out.println("Test Case Pass");
	
	else 
		System.out.println("Test Case Fali");
	
    }
    @AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
}


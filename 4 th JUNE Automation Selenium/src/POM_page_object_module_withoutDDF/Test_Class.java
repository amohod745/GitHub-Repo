package POM_page_object_module_withoutDDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_Class {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Kite_Login_Page1 KP1 = new Kite_Login_Page1(driver);
		KP1.UserID();
		Thread.sleep(2000);
		
		KP1.Password();
		Thread.sleep(2000);
		
		KP1.LoginButton();
		Thread.sleep(2000);
		
		Kite_Login_Page2 KP2 = new Kite_Login_Page2(driver);
		KP2.UserPIN();
		Thread.sleep(2000);
		
		KP2.ContinueButton();
		Thread.sleep(2000);
		
		Kite_HomePage KH = new Kite_HomePage(driver);
		KH.Homepage();
		

	}

}

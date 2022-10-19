package ParallelTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest2 {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	public void SetUp1() {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://kite.zerodha.com/");
	    driver.quit();
	}
	@SuppressWarnings("deprecation")
	@Test
	public void SetUp2() {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.spotify.com/");
		driver.quit();
	}

}

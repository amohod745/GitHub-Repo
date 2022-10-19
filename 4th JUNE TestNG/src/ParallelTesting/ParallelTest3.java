package ParallelTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest3 {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	public void SetUp1() {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.orangehrm.com/");
	    driver.quit();
	}
}

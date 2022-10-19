package CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_testing {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Parameters({"Browsername"})
	@Test
	public void CBT(String Browsername) throws InterruptedException {
		
		if(Browsername.equals("Chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(Browsername.equals("MicrosoftEdge")) {
			System.setProperty("webdriver.edge.driver", "C:\\installer\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(Browsername.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\installer\\gecko\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		String exp ="balaji V";
		String act = driver.findElement(By.xpath("//p[contains(text(),\"balaji V\")]")).getText();
		
		if(exp.equals(act)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		driver.quit();

	}

}

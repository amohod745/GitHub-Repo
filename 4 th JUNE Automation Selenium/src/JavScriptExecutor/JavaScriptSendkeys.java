package JavScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSendkeys {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
//		WebElement username = driver.findElement(By.xpath("//input[@id=\"email\"]"));
//		WebElement password = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
//		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		//first way
//		JS.executeScript("arguments[0].value='amohod@745gmail.com'", username);
//		JS.executeScript("arguments[0].value='akshys@5516'", password);
		
		// second way
        
		JS.executeScript("document.getElementById('email').value='akshay'");
		JS.executeScript("document.getElementById('pass').value='AKShay@36474'");
	}

}

package JavScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	//	WebElement Web =driver.findElement(By.xpath("//input[@id=\"email\"]"));
	//	WebElement pass =driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		WebElement login = driver.findElement(By.xpath("//button[@name=\"login\"]"));
	    JS.executeScript("arguments[0].click()", login);
		
		

	}

}

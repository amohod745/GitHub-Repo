package JavScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightBackground {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement page = driver.findElement(By.xpath("//div[@class=\"_8esk\"]"));
		background(page,driver);
		Thread.sleep(3000);
		WebElement from = driver.findElement(By.xpath("//form[@class=\"_9vtf\"]"));
		background (from, driver);
		
	}
	public static void background(WebElement element, WebDriver driver) {
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.background='yellow'", element);
	}

}

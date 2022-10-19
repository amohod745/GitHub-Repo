package JavScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightBorder {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement facebook = driver.findElement(By.xpath("//h2[@class=\"_8eso\"]"));
		highlight(facebook,driver);
		// to highborder we need to perform downcasting because of javascripte exctruter is interface and 
		// where we want perfrom action that driver is also interface
//		
//		JavascriptExecutor Js = (JavascriptExecutor) driver;
//		Js.executeScript("arguments[0].style.border='5px solid red'", facebook);
//		Thread.sleep(3000);
//		
//		WebElement page = driver.findElement(By.xpath("//div[@class=\"_8esk\"]"));
//		Js.executeScript("arguments[0].style.border='5px solid red'", page);
//		
//		WebElement login = driver.findElement(By.xpath("//button[@name=\"login\"]"));
//		Js.executeScript("arguments[0].style.border='5px solid red'", login);
//		
		WebElement highlight = driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]"));
		highlight(highlight,driver);
		
		WebElement page =  driver.findElement(By.xpath("//div[@class=\"_8iep _8icy _9ahz _9ah-\"]"));
		highlight(page,driver);
	}
	public static void highlight(WebElement element, WebDriver driver) {
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].style.border='5px solid red'", element);
		
	}

}

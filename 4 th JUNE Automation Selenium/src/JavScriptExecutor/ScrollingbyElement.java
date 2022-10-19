package JavScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingbyElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(3000);
		
	    JavascriptExecutor JS = (JavascriptExecutor)driver;
	    
	    WebElement color = driver.findElement(By.xpath("//h1[contains(text(),\"Color Picker\")]"));
	    Thread.sleep(3000);
	    
	    JS.executeScript("arguments[0].scrollIntoView();", color);
	    Thread.sleep(3000);
	    WebElement java = driver.findElement(By.xpath("//h2[text()=\"Java\"]"));
	    JS.executeScript("arguments[0].scrollIntoView();", java);
		
	}

}

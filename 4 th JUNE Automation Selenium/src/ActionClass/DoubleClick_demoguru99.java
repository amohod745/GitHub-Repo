package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_demoguru99 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		// create obj of Actions class
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),\"Double-Click Me To See Alert\")]"));
		act.doubleClick(doubleclick).build().perform();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

}

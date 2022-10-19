package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver2_mrbool {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://mrbool.com/");
		Thread.sleep(2000);
		// create an object of Actions class
		
		Actions act = new Actions(driver);
		
		WebElement context= driver.findElement(By.xpath("//a[@class=\"menulink\"]"));
		act.moveToElement(context).build().perform();
		Thread.sleep(2000);
		WebElement articels = driver.findElement(By.xpath("//a[contains(text(),\"Articles\")]"));
		String art = articels.getText();
		System.out.println(art);
	}

}

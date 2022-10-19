package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver1_flipkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		// to perform mouseover action first create object of Actions class
		// in constrcutor of Actios class pass one para which is veriable name of webdriver
		// beacuse we want to perform action on driver
		Actions act = new Actions(driver);
	//	WebElement login = driver.findElement(By.xpath("//a[contains(text(),\"Login\")]"));
	//	act.moveToElement(login).build().perform();
		
		WebElement travel = driver.findElement(By.xpath("//div[contains(text(),\"Travel\")]"));
		act.moveToElement(travel).build().perform();
		
	}

}

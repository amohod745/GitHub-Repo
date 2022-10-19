package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
 
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("amohod745@gamil.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).clear();
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("ak@3643");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).clear();
		
		driver.close();
		
	}

}

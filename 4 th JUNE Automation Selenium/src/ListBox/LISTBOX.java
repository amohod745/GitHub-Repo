package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LISTBOX {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://gsrtc.in/site/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class=\"button b-close\"]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//select[@id=\"selectNoOfPassengersOA\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//option[@value=\"2\"]")).click();
		
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@id=\"singleLadyA\"]")).click();
	}

}

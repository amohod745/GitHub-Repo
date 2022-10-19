package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsrtc {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://gsrtc.in/site/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class=\"button b-close\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()=\"Gujarati\"]")).click();
		
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//input[@id=\"matchStartPlaceA\"]")).sendKeys("Surat");
	   
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//input[@id=\"matchEndPlaceA\"]")).sendKeys("Ahmedabad");
	   
	   driver.findElement(By.xpath("//input[@id=\"datepickerOA\"]")).click();
	   
		
		driver.findElement(By.xpath("//select[@id=\"selectNoOfPassengersOA\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//option[text()='1']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"singleLadyA\"]")).click();
		
	}

}

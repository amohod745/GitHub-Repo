package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus_Seat {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.redbus.in/");
			Thread.sleep(2000);
			driver.findElement(By.id("src")).sendKeys("Nagpur");
			Thread.sleep(2000);
			driver.findElement(By.id("dest")).sendKeys("Amravati");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
			Thread.sleep(2000);
		    driver.findElement(By.xpath("//td[text()=\"Sept 2022\"]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//td[text()=\"30\"]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();
		    Thread.sleep(5000);
		    
		    driver.findElement(By.xpath("//div[@class=\"close-primo\"]")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@class=\"button view-seats fr\"]")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//canvas[@data-type=\"lower\"]")).click();
		    

	}

}

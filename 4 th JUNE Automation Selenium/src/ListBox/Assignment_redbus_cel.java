package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_redbus_cel {
public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.redbus.in/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("pune");	
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Latur");
			Thread.sleep(2000);
			String month = "Dec 2023";
			String day ="22";
			driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
			Thread.sleep(2000);
			List<WebElement> next =driver.findElements(By.xpath("//button[text()=\">\"]"));
			while(true)
			{
				String text =driver.findElement(By.xpath("//td[@class=\"monthTitle\"]")).getText();
				if(text.equals(month)) // Dec 2023
				{
					break;
				}
				else
				{
					driver.findElement(By.xpath("//td[@class=\"next\"]")).click();
				}
			}
			Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),"+day+")]")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();
	}
}

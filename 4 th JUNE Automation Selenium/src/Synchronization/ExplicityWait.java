package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		WebElement src = driver.findElement(By.xpath("//input[@id=\"src\"]"));
		
		WebElement dest = driver.findElement(By.xpath("//input[@id=\"dest\"]"));
		
		redbuswaits(driver,src,"Pune");
		redbuswaits(driver,dest,"Ahmedabad");

		
		
	}
	public static void redbuswaits(WebDriver driver, WebElement element, String values ) {
		
		new WebDriverWait(driver, Duration.ofMinutes(20)).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(values);
	}

}

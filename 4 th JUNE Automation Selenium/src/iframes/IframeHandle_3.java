package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle_3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),\"Iframe with in an Iframe\")]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("singleframe");
		Thread.sleep(2000);
		driver.switchTo().frame(0)
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("welcom");
			
	}

}


package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			//driver.switchTo().alert().accept();
		//	driver.findElement(By.xpath("//button[contains(text(),\"No thanks\")]")).click();
			driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("velocity pune");
			
			Thread.sleep(3000);
		List <WebElement> options=	driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]//li"));
			
			// print the length
		System.out.println(options.size());
		
		for(int i=0; i<=options.size(); i++) {
		options.get(i).getText();
			if(options.get(i).getText().equals("velocity pune")) {
				
				System.out.println(options.get(i).getText());
			    options.get(i).click();
			    break;
			}
		}
		
	}

}

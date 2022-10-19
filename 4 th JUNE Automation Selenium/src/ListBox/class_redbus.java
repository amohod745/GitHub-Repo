package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_redbus {

	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.redbus.in/");
			
			driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Latur");
			
			Thread.sleep(3000);
			
			List<WebElement> List = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
			
			System.out.println(List.size());
			
			for (int i=0; i<List.size(); i++) {
				List.get(i).getText();
				System.out.println(List.get(i).getText());
				
				if (List.get(i).getText().equals("Latur")) {
					
					System.out.println(List.get(i).getText());
					List.get(i).click();
					break;
				}
			}
			driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Pune");
			Thread.sleep(2000);
			
			List<WebElement> dest = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
			 Thread.sleep(3000);
			System.out.println(dest.size());
			for(int i=0; i<dest.size();i++) {
				dest.get(i).getText();
				System.out.println(dest.get(i).getText());
				if(dest.get(i).getText().equals("Hadapsar, Pune")) {
					System.out.println(dest.get(i).getText());
				dest.get(i).click();
				break;
				}
			}
			driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
			Thread.sleep(3000);
			
			while(true) {
				String s= driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
				System.out.println("Current Title is" +s);
				if(!s.equalsIgnoreCase("May 2023")) {
				driver.findElement(By.xpath("//td[@class='next']")).click();
				}
				else {
					break;
				}
			}
			driver.findElement(By.xpath("//div[@class='rb-calendar']//tbody//tr//td[text()='9']")).click();
		
	}

}

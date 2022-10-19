package ListBox;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class yatra_com {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.yatra.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()=\"Buses\"]")).click();
		
		driver.findElement(By.id("BE_bus_from_station")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"bus_leaving\"]")).sendKeys("Mumbai");
      	Thread.sleep(2000);
		
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class=\"viewport\"]//li"));
		System.out.println(list1.size());
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i).getText());
			
			if(list1.get(i).getText().equals("Mumbai Darshan")) {
				System.out.println(list1.get(i).getText());
				list1.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
        driver.findElement(By.id("BE_bus_to_station")).sendKeys("Pune");
		Thread.sleep(1000);
		List<WebElement> list2 = driver.findElements(By.xpath("//div[@class=\"ac_results dest_ac\"]//li"));
		System.out.println(list2.size());
		
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i).getText());
			
			if(list2.get(i).getText().equals("Pune Darshan")) {
				System.out.println(list2.get(i).getText());
				list2.get(i).click();
			}
		}
		
		driver.findElement(By.id("BE_bus_depart_date")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("08/11/2022")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("BE_bus_search_btn")).click();
		Thread.sleep(2000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		File destination = new File("C:\\Users\\amoho\\OneDrive\\Desktop\\ScreenShots\\yatra1.com.jpg");
		FileHandler.copy(src, destination);
		
    }

}

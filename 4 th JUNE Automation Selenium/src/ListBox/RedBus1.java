package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus1 {

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
		driver.findElement(By.xpath("//table[@class=\"rb-monthTable first last\"]")).click();
		Thread.sleep(2000);
		String monthval = driver.findElement(By.xpath("//tr[@class=\"rb-monthHeader\"]")).getText();
		System.out.println(monthval); //Spet 2022
     //   String month = monthval.split(" ")[0];
	//	String year = monthval.split(" ")[1];
		
//		while(!monthval.contains("Nov 2023")){
//			driver.findElement(By.xpath("//td[@class=\"next\"]")).click();
//			monthval = driver.findElement(By.xpath("//tr[@class=\"rb-monthHeader\"]")).getText();
//			System.out.println(monthval); //Nov 2023
////	        month = monthval.split(" ")[0];
////			year = monthval.split(" ")[1];
//	    }
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()=\"18\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();	
		
	}
}

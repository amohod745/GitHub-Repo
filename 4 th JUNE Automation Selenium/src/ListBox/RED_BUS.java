package ListBox;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RED_BUS {

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
		    
		    Thread.sleep(2000);
		    
		    
//		    Set<String> redbus = driver.getWindowHandles();
//		    Iterator <String> it = redbus.iterator();
//		    String main = it.next();
//		    String child= it.next();
//		    System.out.println("main page :"+main);
//		    System.out.println("child page :"+child);
		    
//		    driver.findElement(By.xpath("//i[@class=\"icon icon-close\"]")).click();
		//  driver.findElement(By.xpath("//div[@class=\"tripleFive-block\"]")).click();
		//    driver.findElement(By.xpath("//i[@class=\"icon icon-close\"]")).click();
		    Thread.sleep(1000);
		//    driver.switchTo().alert().accept();
		    
		//    driver.findElement(By.xpath("//div[@class=\"close-primo\"]")).click();
		    driver.findElement(By.xpath("//div[contains(text(),\"View Seats\")]")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//div[@class=\"close-primo\"]")).click();
		    Thread.sleep(2000);
//          driver.findElement(By.xpath("//canvas[@data-type=\"lower\"]")).click();
//		    driver.findElement(By.xpath("//div[@class=\"available-sleep fl\"]")).click();
		    driver.findElement(By.xpath("//div[@id=\"seat-select-lbl\"]")).click();
		    Thread.sleep(2000);
		    WebElement seat = driver.findElement(By.xpath("//div[contains(text(),\"Lower Deck\")]"));
		    
//		    driver.findElement(By.xpath("//canvas[@class=\"pointer\"]")).click();
//		    Thread.sleep(2000);
//		    driver.findElement(By.xpath("//canvas[@data-type=\"lower\"]")).click();
//		    Thread.sleep(2000);
//		    driver.findElement(By.xpath("//canvas[@height=\"211\"]")).click();
//		    
//		    Actions act = new Actions (driver);
//		    
//      	    WebElement seat = driver.findElement(By.xpath("//canvas[@data-type=\"lower\"]"));
//    	    act.moveToElement(seat).build().perform();
		    
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    
		    js.executeScript("arguments[0].click", seat);
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
			
	}

}

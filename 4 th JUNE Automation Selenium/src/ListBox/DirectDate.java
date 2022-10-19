package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectDate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		//Xpath for source location
		driver.findElement(By.id("src")).sendKeys("Pune");
		Thread.sleep(2000);
		List<WebElement> city =driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		System.out.println("Total count :" +city.size());
		for(int i=0;i<city.size();i++) {
			String source=city.get(i).getText();
			
			if(source.equals("Warje, Pune")) {
				
				System.out.println(source);
				city.get(i).click();
				break;
		    }
		}
		//Xpath for Destination location
		driver.findElement(By.id("dest")).sendKeys("Mumbai");
		Thread.sleep(2000);
		List<WebElement> dest =driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		System.out.println("Total Count :" +dest.size());
		for(int i=0;i<dest.size();i++) {
			String destination=dest.get(i).getText();
			if(destination.equals("Andheri East, Mumbai")) {
				
				System.out.println(destination);
				dest.get(i).click();
				break;
		    }
        }
		driver.findElement(By.cssSelector("[for='onward_cal']")).click();
	    //select month
	    while(!driver.findElement(By.cssSelector("#rb-calendar_onward_cal .monthTitle")).getText().equals("Dec 2022")) {
	        driver.findElement(By.cssSelector(".rb-calendar#rb-calendar_onward_cal .next button")).click();
	        System.out.println(driver.findElement(By.cssSelector("#rb-calendar_onward_cal .monthTitle")).getText());
	        Thread.sleep(1000);
	    }
	    //select date
	    driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[.='2']")).click();
	}
}



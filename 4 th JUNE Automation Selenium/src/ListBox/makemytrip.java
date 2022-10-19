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

public class makemytrip {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame("notification-frame-b8a6545b");
		driver.findElement(By.xpath("//a[@class=\"close\"]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class=\"chNavText darkGreyText\"])[6]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[@for=\"fromCity\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-controls=\"react-autowhatever-1\"]")).sendKeys("Mumbai");
		Thread.sleep(1000);
		List<WebElement> from= driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
		System.out.println(from.size());
		for(int i=0; i<from.size(); i++) {
			from.get(i).getText();
			
			if(from.get(i).getText().equals("Mumbai Airport, Maharashtra")) {
				System.out.println(from.get(i).getText());
				from.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-controls=\"react-autowhatever-1\"]")).sendKeys("Bangalore");
		Thread.sleep(3000);
		List<WebElement> To = driver.findElements(By.xpath("//div[@role=\"listbox\"]//li"));
		System.out.println(To.size());
		for(int i=0; i<To.size(); i++) {
			To.get(i).getText();
			
			if(To.get(i).getText().equals("Bangalore Intl Airport, Karnataka")) {
				System.out.println(To.get(i).getText());
				To.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"DayPicker-Months\"]")).click();
		Thread.sleep(2000);
		String monthyear = "December 2022";
		while(true)
		{
			String date = driver.findElement(By.xpath("//div[@class=\"DayPicker-Caption\"]")).getText();
			if(date.equals(monthyear)) 
			{
				break;
			}
			else {
                driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
                
			}
			
		}
		Thread.sleep(2000);
		WebElement s = driver.findElement(By.xpath("//div[contains(text(),\"10\")]"));
		s.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("id=\"travelDate\"")).click();
//		Thread.sleep(2000);
//		List<WebElement> date = driver.findElements(By.xpath("//span[@role=\"button\"]"));
//		System.out.println(date.size());
		
		
		
		
		
		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
//        Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@aria-label=\"Thu Dec 01 2022\"]")).click();
//		Thread.sleep(3000);
		driver.findElement(By.id("search_button")).click();
//		Thread.sleep(1000);
//		
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		System.out.println(src);
//	    File destination = new File("C:\\Users\\amoho\\OneDrive\\Desktop\\ScreenShots\\makemytrip224.png");
//		FileHandler.copy(src, destination);
	}
}

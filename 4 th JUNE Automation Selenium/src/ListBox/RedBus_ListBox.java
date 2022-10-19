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

public class RedBus_ListBox {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("src")).sendKeys("Mumbai");
		
		Thread.sleep(2000);
		
		List<WebElement> city = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		
		System.out.println("Total count :" +city.size());
		
		for(int i=0; i<city.size(); i++) {
			city.get(i).getText();
			
			if(city.get(i).getText().equals("Andheri East, Mumbai")) {
				System.out.println(city.get(i).getText());
				city.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.id("dest")).sendKeys("Pune");
		
		Thread.sleep(2000);
		
		List<WebElement> city1 = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		System.out.println(city1.size());
		Thread.sleep(2000);
		
		for(int i=0; i<city1.size(); i++) {
			city1.get(i).getText();
			
			if(city1.get(i).getText().equals("Pimpri Chinchwad, Pune")) {
				System.out.println(city1.get(i).getText());
				city1.get(i).click();
				break;
			}
		}
		
	//	driver.findElement(By.id("rb-calendar_onward_cal")).sendKeys("15-Sep-2022")
		
	//	driver.findElement(By.id("rb-calendar_onward_cal")).click();
	//	driver.findElement(By.xpath("class=\"next\"")).click();
		
		List<WebElement> src1 = driver.findElements(By.xpath("//td[text()=\"Nov 2022\"]"));
		System.out.println(src1.size());
		for(int i=0; i<src1.size(); i++) {
			String month = src1.get(i).getText();
			System.out.println(month);
			if(month.equals("8")) {
            System.out.println(src1.get(i).getText());
            src1.get(i).click();
      //      driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[.='21']")).click();

			}
		}
	//    driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[.='21']")).click();

		
		
		
		
//		driver.findElement(By.cssSelector("[for='onward_cal']"));
//		//select month
//		while(!driver.findElement(By.cssSelector("#rb-calendar_onward_cal .monthTitle")).getText().equals("Dec 2022")) {
//			 driver.findElement(By.cssSelector(".rb-calendar#rb-calendar_onward_cal .next button")).click();
//			 System.out.println(driver.findElement(By.cssSelector("#rb-calendar_onward_cal .monthTitle")).getText());
//			 Thread.sleep(1000);
//		}
		
		
		
		
		
		
//		
//		driver.findElement(By.cssSelector("[for='onward_cal']")).click();
//	    //select month
//	    while(!driver.findElement(By.cssSelector("#rb-calendar_onward_cal .monthTitle")).getText().equals("Jan 2023")) {
//	        driver.findElement(By.cssSelector(".rb-calendar#rb-calendar_onward_cal .next button")).click();
//	        System.out.println(driver.findElement(By.cssSelector("#rb-calendar_onward_cal .monthTitle")).getText());
//	        Thread.sleep(1000);
//	    }
	    //select date
//	    driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[.='21']")).click();

		
		
//		driver.findElement(By.xpath("//td[@class=\"next\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//td[@class=\"next\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//td[text()=\"26\"]")).click();
//		
//		driver.findElement(By.xpath("//td[text()=\"15\"]")).click();
//		Thread.sleep(2000);
    	driver.findElement(By.id("search_btn")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//td[@class=\"next\"]")).click();
	//	driver.findElement(By.xpath("//div[text()=\"Got It\"]"));
	//	Thread.sleep(1000);
	//	driver.findElement(By.xpath("(//div[@class=\"button\"])[1]")).click();
		
//		Thread.sleep(1000);
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		System.out.println(src);
//		File destination = new File ("C:\\Users\\amoho\\OneDrive\\Desktop\\ScreenShots\\redbus next month btn.png");
//		FileHandler.copy(src, destination);

	}

}

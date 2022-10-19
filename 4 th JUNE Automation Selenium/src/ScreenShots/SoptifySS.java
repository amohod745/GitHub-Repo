package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SoptifySS {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://gaana.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	//	File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		

//	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	//	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	//	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	//	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		WebElement gana = driver.findElement(By.xpath("//img[@alt=\"I Wish I Could Hate You\"]"));
		
		
		
	File soruce =((TakesScreenshot)gana).getScreenshotAs(OutputType.FILE);
	//	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	System.out.println(soruce);
	
	File destination = new File("C:\\Users\\amoho\\OneDrive\\Desktop\\ScreenShots\\gana.png");
	
	FileHandler.copy(soruce, destination);
	}

}

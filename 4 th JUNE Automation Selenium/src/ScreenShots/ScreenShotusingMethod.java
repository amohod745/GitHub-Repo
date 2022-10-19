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

import net.bytebuddy.utility.RandomString;

public class ScreenShotusingMethod {

	public static void main(String[] args) throws InterruptedException, IOException {

		// 1) Full page screenshot
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);
			
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			WebElement logo = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
			Thread.sleep(2000);
			
			File src = ((TakesScreenshot)logo).getScreenshotAs(OutputType.FILE);
			System.out.println(src);
			String path = "C:\\Desktop\\ScreenShots";
			String ranmdom = RandomString.make(3);
			String filename = "face";
			
			
			File destination = new File(path +filename+ " "+ranmdom+".png");
			FileHandler.copy(src, destination);
			
			
			
	}

}

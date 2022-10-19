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

public class SoptifySS1 {

	public static void main(String[] args) throws InterruptedException, IOException {

	System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement src =driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		Thread.sleep(2000);

		File soruce =((TakesScreenshot)src).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);

     //   System.out.println(soruce);
		
		String random = RandomString.make(5);
	    String filename = "facebook";
	    
	    System.out.println(soruce);

	    
	    File destination = new File("C:\\Users\\amoho\\OneDrive\\Desktop\\ScreenShots\\facebook1"+filename+""+random+".jpg");
	    FileHandler.copy(soruce, destination);
	}

}

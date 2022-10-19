package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class makemytrip {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
        driver.switchTo().frame("notification-frame-b8a6545b");
        driver.findElement(By.xpath("//a[@class=\"close\"]")).click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
    //  driver.findElement(By.xpath("//img[@id=\"second-img\"]")).click();
       
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        System.out.println(src);
        
        File destination = new File("C:\\Users\\amoho\\OneDrive\\Desktop\\ScreenShots\\SSmakemytrip1.png");
        
        FileHandler.copy(src, destination);
        
        
	}

}

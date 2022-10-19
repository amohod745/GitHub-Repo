package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class saveinprojectfolader {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.whatsapp.com/");
        Thread.sleep(1000);
        
       File src =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       System.out.println(src);
       
       String random = RandomString.make(4);
       String filename = "Whatsapp";
       String path = "C:\\Users\\amoho\\eclipse-workspace\\4 th JUNE Automation Selenium\\src\\4JuneScreenShot";
       File destionatio = new File(path + filename +" "+random+"facebook.png");
       FileHandler.copy(src, destionatio);
       
       
	}

}

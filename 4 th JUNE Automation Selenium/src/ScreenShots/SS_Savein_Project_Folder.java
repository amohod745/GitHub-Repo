package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SS_Savein_Project_Folder {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.whatsapp.com/");
		Thread.sleep(2000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		String random = RandomString.make(4);
		String filename = "Whatsapp";
		File dsetinatio = new File("C:\\Users\\amoho\\eclipse-workspace\\4 th JUNE Automation Selenium\\src\\4JuneScreenShot\\"+filename+ " "+random+".png");
		
		FileHandler.copy(src, dsetinatio);
		
	}

}

package iframes;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(3000);
		driver.switchTo().frame("frame1");
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]")).click();
		String text = driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]")).getText();
		System.out.println(text);
		driver.switchTo().parentFrame();
	//	driver.switchTo().defaultContent();
		
		WebElement data= driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
		File src= ((TakesScreenshot)data).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File destination = new File("C:\\Users\\amoho\\OneDrive\\Desktop\\ScreenShots\\toola12.png");
		FileHandler.copy(src, destination);
		
		
		
	}

}

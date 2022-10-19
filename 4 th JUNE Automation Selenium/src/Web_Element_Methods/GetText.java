package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class GetText {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		String ExpectedReslut = "Facebook helps you connect and share with the people in your life.";
		
		String text = driver.findElement(By.xpath("//h2[contains(text(),\"Facebook helps you connect and share with the people in your life.\")]")).getText();
		
		System.out.println(text);
		
		if(text.equals(ExpectedReslut)) {
			
			System.out.println("Correct");
		}
		else {
			System.out.println("incorrect");
		}
		Thread.sleep(5000);
		
		driver.quit();
	}

}

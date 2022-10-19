package WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://uidai.gov.in/");
		
		Thread.sleep(5000);
         
		driver.manage().window().maximize();
		
		Dimension d1 = new Dimension(800,600);
		
		driver.manage().window().setSize(d1);
		
		Thread.sleep(5000);
		
		System.out.println(driver.manage().window().getSize());
		
		
		
		
		
	}

}

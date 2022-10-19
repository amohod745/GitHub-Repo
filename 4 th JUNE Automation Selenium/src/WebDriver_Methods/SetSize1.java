package WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.oppo.com/in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Dimension D1 = new Dimension(1000,800);
		
		driver.manage().window().setSize(D1);
		
		Thread.sleep(3000);
		
		driver.close();

	}

}

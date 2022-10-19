package WebDriver_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.oracle.com/in/index.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Point p = new Point(450, 450);
		
		Thread.sleep(3000);
		
		driver.manage().window().setPosition(p);
		
		System.out.println(driver.manage().window().getPosition());
		
		Thread.sleep(7000);
		

	}

}

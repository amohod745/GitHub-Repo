package WebDriver_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPosition {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.samsung.com/");
	    
	    Thread.sleep(5000);
	    
	    driver.manage().window().maximize();
	    
	    Point P = new Point(450,850);
	    
	    Thread.sleep(3000);
	    
	    driver.manage().window().setPosition(P);
	    
	    Thread.sleep(7000);
	    
	    System.out.println(driver.manage().window().getPosition());
	    
	    driver.quit();
	    
	}

}

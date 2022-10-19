package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {

	public static void main(String[] args) throws InterruptedException {
		
	   System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver_win32\\chromedriver.exe");
	   
       WebDriver driver = new ChromeDriver();
       
       driver.get("https://www.5paisa.com/");
       
       Thread.sleep(10000);
	   
       driver.manage().window().maximize();
       
       Thread.sleep(3000);
       
       driver.close();
	}

}

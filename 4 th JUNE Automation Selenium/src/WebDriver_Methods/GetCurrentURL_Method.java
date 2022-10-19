package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL_Method {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.whatsapp.com/");
		
		Thread.sleep(5000);
		
		String URL = driver.getCurrentUrl();
		
		System.out.println(URL); 
		
		if (URL.equals("https://www.whatsapp.com/")){
			System.out.println("Correct URL");
		}
		
		else
			
			System.out.println("INcorrect URL");
		
		driver.close();
	}

	}


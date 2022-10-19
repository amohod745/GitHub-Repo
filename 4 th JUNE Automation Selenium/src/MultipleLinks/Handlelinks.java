package MultipleLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlelinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	 
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("number od present links on page : " + links.size());
		
		for(WebElement link : links) {
		//	System.out.println(link.getText());
			
			System.out.println(link.getAttribute("href"));
		}
        
        
		

	}

}

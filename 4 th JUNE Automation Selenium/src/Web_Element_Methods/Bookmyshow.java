package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bookmyshow {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Thread.sleep(1000);
				
	    WebElement city = driver.findElement(By.xpath("//span[@class=\"sc-LKuAh kxVdmj ellipsis\"]"));
	    String c1 = "Mumabi/Ahmedabad/Pune";
	    String []a = c1.split(c1);
	    bookmyshow(city, c1);    		
		
	
	}
	
	public static void bookmyshow(WebElement element, String value) {
		
		Select S1 = new Select(element);
		S1.deselectByValue(value);
		
	}

}

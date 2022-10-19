package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Assignment {

	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//input[@type=\"text\"]")).click();
		Thread.sleep(2000);
		// passing values into search box
		driver.findElement(By.xpath("//input[@maxlength=\"2048\"]")).sendKeys("Selenium");
		Thread.sleep(2000);
		// to get list box
		List<WebElement> selenium = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
		// to print size of list
		System.out.println(selenium.size());
		// to print list values
		for(int i=0; i<selenium.size(); i++) {
			System.out.println(selenium.get(i).getText());
			// to click on perticular values
			if(selenium.get(i).getText().equals("selenium ide chrome extension")) {
                System.out.println(selenium.get(i).getText());
				selenium.get(i).click();
				break; // with out using break; --> it will throw exception 
			}
		}
	//	driver.findElement(By.xpath("(//div[@class=\"sbic sb43\"])[5]")).click();
	}
}

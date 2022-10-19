package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListboxwithoutSelect_Class {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@ajaxify=\"/reg/spotlight/\"]")).click();
		
		Thread.sleep(3000);
		
		List<WebElement>daylist = driver.findElements(By.xpath("//select[@id=\"day\"]//option"));
		System.out.println(daylist.size());
		
		for(int i=0;i<daylist.size(); i++) {
			System.out.println(daylist.get(i).getText());
			
			if(daylist.get(i).getText().equals("11")) {
				daylist.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);

		List<WebElement> monthlist = driver.findElements(By.xpath("//select[@id=\"month\"]//option"));
		System.out.println(monthlist.size());
		
		for(int i=0; i<monthlist.size(); i++) {
			System.out.println(monthlist.get(i).getText());
			
			if(monthlist.get(i).getText().equals("May")) {
				monthlist.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);

		List<WebElement> yearlist = driver.findElements(By.xpath("//select[@id=\"year\"]//option"));
		System.out.println(yearlist.size());
		
		for(int i=0; i<yearlist.size(); i++) {
			System.out.println(yearlist.get(i).getText());
			
			if(yearlist.get(i).getText().equals("1995")) {
				yearlist.get(i).click();
				break;
			}
		}
	}

}

package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		
		Thread.sleep(3000);
		
//		WebElement Day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
//		WebElement Month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
//		WebElement Year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
//		
		WebElement Day = driver.findElement(By.id("id=\"day\""));
		
		WebElement Month = driver.findElement(By.id("id=\"month\""));
		
		WebElement Year = driver.findElement(By.id("id=\"year\""));

		
		Select selectday = new Select(Day);
		
		// Q 1) how will u get total number of element
		
		List<WebElement> listday = selectday.getOptions();
		System.out.println(listday.size());
		
		// Q 2) how will u print all the values from the list
		
		for(int i=0; i<listday.size(); i++) {
			String dayvalues = listday.get(i).getText();
			System.out.println(dayvalues);
			
			if(dayvalues.equals("10")) {
				listday.get(i).click();
				break;
			}
		}
		System.out.println("==================================================");
		
		Select selectmonth = new Select(Month);
		
		List<WebElement> listmonth = selectmonth.getOptions();
		System.out.println(listmonth);
		
		for(int i=0; i<listmonth.size(); i++) {
			String monthvalues = listmonth.get(i).getText();
			System.out.println(monthvalues);
			
			if(monthvalues.equals("Sep"));
		      listmonth.get(i).click();
		      break;
		}
		System.out.println("==================================================");

		Select selectyear = new Select(Year);
		
		List<WebElement> listyear = selectyear.getOptions();
		System.out.println(listyear.size());
		
		for(int i=0; i<listyear.size(); i++) {
			String yearvalues = listyear.get(i).getText();
			System.out.println(yearvalues);
			
			if (yearvalues.equals("1923")) {
				listyear.get(i).click();
				break;
			}
		}
		
	}

}

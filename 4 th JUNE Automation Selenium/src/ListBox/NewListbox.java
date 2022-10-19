package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewListbox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select selectday = new Select(day);
		
		List<WebElement> Listday = selectday.getOptions();
		System.out.println(Listday.size());
		
		for(int i=0; i<Listday.size(); i++) {
			String dayvalues = Listday.get(i).getText();
			System.out.println(dayvalues);
			
			if (dayvalues.equals("8")) {
				Listday.get(i).click();
			}
			
		}
		
		Select selectmonth = new Select(month);
		List<WebElement>Listmonth = selectmonth.getOptions();
		System.out.println(Listmonth.size());
		
		for(int i=0; i<Listmonth.size(); i++) {
			
			String monthvalues = Listmonth.get(i).getText();
			System.out.println(monthvalues);
			
			if(monthvalues.equals("May")) {
				Listmonth.get(i).click();
				break;
			}
		}
		
		Select selectyear = new Select(year);
		List<WebElement>Listyear = selectyear.getOptions();
		System.out.println(Listyear.size());
		
		for(int i=0; i<Listyear.size(); i++) {
			String yearvalues = Listyear.get(i).getText();
			System.out.println(yearvalues);
			
			if(yearvalues.equals("1923")) {
			Listyear.get(i).click();
			break;
			
		}
		
		
	}

}
	
}

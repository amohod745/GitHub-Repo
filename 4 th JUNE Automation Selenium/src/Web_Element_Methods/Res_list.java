package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Res_list {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement skills = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		
		WebElement year = driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
		
		WebElement month = driver.findElement(By.xpath("//option[text()=\"Month\"]"));
		
		WebElement day = driver.findElement(By.xpath("//select[@id=\"daybox\"]"));
		
		String AB = "C++/1995/5/11";
		
		String [] CD = AB.split("/");
		
		Thread.sleep(1000);
		
		listbox(skills, CD[0]);
		listbox(year, CD[1]);
		listbox(month, CD[2]);
		listbox(day, CD[3]);

		
		
	}
		public static void listbox(WebElement element, String Value) {
			
			Select S1 = new Select (element);
			S1.selectByValue(Value);
		}
		
		
		
	
}

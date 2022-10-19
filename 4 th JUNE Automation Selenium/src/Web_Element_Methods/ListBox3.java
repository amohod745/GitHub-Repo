package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("kksga@uuew");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("12345");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@ajaxify=\"/reg/spotlight/\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("akshay");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("mohod");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("8866330484");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@data-type=\"password\"]")).sendKeys("aks@166");
		
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
     	WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
		String DOB = "10-2-1997";
		
		String [] date = DOB.split("-");
		
		
		listbox(day,date[0]);
		
		listbox(month,date[1]);
		
		listbox(year,date[2]);
	}
	public static void listbox(WebElement element, String value) {
		
		Select S1 = new Select(element);
		S1.selectByValue(value);	
	}

}

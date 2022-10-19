package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Akshay@7890");
		
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("saksaj@1222");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("akshay");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("mohod");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("886633048");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]")).sendKeys("B@15522");
		
		Thread.sleep(5000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
/*		// 1) selectByVisibleText
 * 
 *      Select S1 = new Select(day);
		S1.selectByVisibleText("10");
		
		Thread.sleep(1000);
		
		Select S2 = new Select(month);
		S2.selectByVisibleText("Feb");
		
		Thread.sleep(1000);
		
		Select S3 = new Select(year);
		S3.selectByVisibleText("1997");
*/		
		
/*		// 2) selectByValue
		
		Select S4 = new Select(day);
		S4.selectByValue("31");
		
		Select S5 = new Select(month);
		S5.selectByValue("12");
		
		Select S6 = new Select(year);
		S6.selectByValue("2022");

*/		// 3) selectByIndex
		
		Select S7 = new Select(day);
		S7.selectByIndex(11);
		
		Select S8 = new Select(month);
		S8.selectByIndex(10);
		
		Select S9 = new Select(year);
		S9.selectByIndex(25);
		
	}

}

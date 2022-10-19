import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mock {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("8866330484");
	
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("B/166akky");
	
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[@data-tkid=\"M_21a12b11-eb58-4fe0-a58a-3ad56d066a10_1_372UD5BXDFYS_MC.JKA0LKU8OMVP\"]")).clear();
	
	driver.findElement(By.xpath("class=\"_3voSl0\"")).click();
	
	Thread.sleep(2000);
	
//	driver.findElement(By.xpath("(//div[@class=\"_3LU4EM\"])[2]")).click();
	
	//driver.findElement(By.xpath("//div[@class=\"xtXmba\"]")).click();
	
	driver.findElement(By.xpath("(//div[@class=\"xtXmba\"])[3]")).click();
	
	}

}

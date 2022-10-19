package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("akshay@8904");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("789@akshta");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("ak@7784");
		
		driver.findElement(By.xpath("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[2]")).sendKeys("12463k");
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("8866330484");
		
		driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]")).sendKeys("tom@344");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@id=\"day\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//option[@value=\"13\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//select[@id=\"month\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//option[@value=\"5\"])[2]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//select[@id=\"year\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//option[@value=\"2016\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[2]")).click();
	}	
		

}

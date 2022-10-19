package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAss {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	//	Thread.sleep(3000);
		
		// Xpath by Attribute // Syntax = //tagname[@attributename=attributevalues]
		
	//	driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
		
	//	Thread.sleep(3000);
		
	//	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
		
	//	Thread.sleep(3000);
		
	//	driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		
	//	Thread.sleep(5000);
		
		//Xpath by classname syntax = tagname.classvalue[ spaces replace by '.']
		
	//    driver.findElement(By.className("input.inputtext._55r1._6luy")).sendKeys("tom123@gmail.com");
		
	//	driver.findElement(By.className("input.inputtext._55r1.inputtext._9npi.inputtext._9npi")).sendKeys("tsh123");
		
	//	driver.findElement(By.className("button._42ft._4jy0._52e0._4jy6._4jy1.selected._51sy")).click();
		
	//	Thread.sleep(3000);
		
	//	driver.findElement(By.className("inputtext _55r1 inputtext _1kbt inputtext _1kbt")).sendKeys("sgtah@gmail.ocm");
		
	
	//	driver.findElement(By.className("class=\"inputtext _55r1 inputtext _1kbt inputtext _1kbt\"")).sendKeys("tom@2345");
		
	}

}

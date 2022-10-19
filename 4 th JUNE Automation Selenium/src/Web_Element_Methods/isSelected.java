package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		boolean b = driver.findElement(By.xpath("//input[@value=\"Male\"]")).isSelected();
		System.out.println(b);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		
	    System.out.println(b);

		
		
		Thread.sleep(1000);
		
	    boolean b1 = driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).isSelected();
	    
	    System.out.println(b1);
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).click();
	    
	    Thread.sleep(1000);
	    
	    boolean b2 = driver.findElement(By.xpath("//input[@id=\"checkbox1\"]")).isSelected();
	    
	    System.out.println(b2);
	    
	    driver.findElement(By.xpath("//input[@id=\"checkbox1\"]")).click();
		
	}

}

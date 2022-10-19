package iframes;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeHandel_1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(3000);
		// to switch focus of selenium from main page to iframe using iframe name
        //driver.switchTo().frame();
		//only select values which is present in "iframe tagname" i.e. <iframe>
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id=\"tryhome\"]")).click();
	    Thread.sleep(2000);
	    
	    // how to use windowhandles
	    
	    Set<String> windowhandle = driver.getWindowHandles(); // create set of string and than import it
	    Iterator<String> it = windowhandle.iterator(); // for iterate windows we use iterator of string 
	    String jspromt = it.next(); // parent window 
	    String mainpage = it.next(); // child window
	    Thread.sleep(2000);
	    driver.switchTo().window(mainpage); // swtich selenium focus from child window to parent window
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id=\"search2\"]")).sendKeys("Selenium"); // to perform action
	    Thread.sleep(2000);
	    driver.switchTo().window(jspromt); // again switch selenium focus from parent window to child window
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@onclick=\"retheme()\"]")).click();// to perform action
	    
		
	}

}

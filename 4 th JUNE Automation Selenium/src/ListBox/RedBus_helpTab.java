package ListBox;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus_helpTab {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),\"Help\")]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//i[@class=\"icon-close\"]")).click();
//		driver.switchTo().frame("modalIframe");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//i[@class=\"icon-close\"]")).click();
	//	driver.switchTo().defaultContent();
		
		Set<String> help = driver.getWindowHandles();
		Iterator<String> it = help.iterator();
		String mainpage = it.next();
		System.out.println(mainpage);
		
		String childpage = it.next();
		System.out.println(childpage);
		
		driver.switchTo().window(childpage);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class=\"icon-close\"]")).click();
		driver.switchTo().window(mainpage);
	}

}

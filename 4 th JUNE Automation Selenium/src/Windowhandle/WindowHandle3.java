package Windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()=\"OrangeHRM, Inc\"]")).click();
		Thread.sleep(3000);
		// to print multipel browser id we want to use getWindowHandles(); method
//		   ---> Retrun type is Set<String> // set of string
		Set<String> windowid = driver.getWindowHandles();
     // to know which id belongs to which browser---> 1) First Method = Iterator // 2) Arraylist by passing set<string> referance variable
		
			// 1) first Method ---> Iterator
		Iterator<String> it = windowid.iterator();
		String perentwindow = it.next();
		String childwindow = it.next();
		System.out.println("Perent window :"+ perentwindow);
		System.out.println("Child window :"+ childwindow);
		Thread.sleep(5000);
		
// to switch selenium's focus from perent window to child window ---> use function--> driver.switchTo.window("name of window");		
		
		driver.switchTo().window(perentwindow);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"myText\"]")).sendKeys("amohod335@gamil.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id=\"linkadd\"]")).click();
		Thread.sleep(2000);
	//	driver.close(); // only close current tab/window
		
		// 2) Second method ---> by using for each loop
		
		for(String ID : windowid) {
			String list = driver.switchTo().window(ID).getTitle();
			if(list.equals("OrangeHRM")|| list.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM\r\n"));
			{
			   driver.close(); 
				
			}
			System.out.println(list);
		}
	//	driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

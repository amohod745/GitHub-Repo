package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus_assignment {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.id("src")).sendKeys("Nagpur");
		Thread.sleep(2000);
		driver.findElement(By.id("dest")).sendKeys("Amravati");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for=\"onward_cal\"]")).click();
//		
//		List <WebElement> list = driver.findElements(By.id("rb-calendar_onward_cal"));
//		System.out.println(list.size());
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).getText());
//			if(list.get(i).getText().equals("Sept 2022"))
//			{
//			 System.out.println(list.get(i).getText());	
//			 list.get(i).click();
//			}
//		}
		List<WebElement> list = driver.findElements(By.xpath("//table[@class=\"rb-monthTable first last\"]//td"));
		System.out.println(list.size());
		  list.contains(list);
		  System.out.println(list.get(1).getText());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("Nov 2023")) {
				System.out.println(list.get(i).getText());
				list.get(i).click();
				
			}
		}
		
	}

}

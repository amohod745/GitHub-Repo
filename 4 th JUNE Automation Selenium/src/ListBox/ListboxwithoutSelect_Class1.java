package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListboxwithoutSelect_Class1 {

	    static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@ajaxify=\"/reg/spotlight/\"]")).click();
		
		Thread.sleep(3000);
		
		String dayxpath = "//select[@id=\"day\"]//option";
		String monthxpath = "//select[@id=\"month\"]//option";
		String yearxpath = "//select[@id=\"year\"]//option";
		
		String dob = "10/Feb/1997";
		String AK [] = dob.split("/");
		
		selectdropdown(dayxpath, AK[0]);
		selectdropdown(monthxpath,AK[1]);
		selectdropdown(yearxpath,AK[2]);
		
	}
	public static void selectdropdown(String xpath, String values) {
		
		List<WebElement> list = driver.findElements(By.xpath(xpath));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals(values)) {
				list.get(i).click();
				
			}
		}
		
	}

}

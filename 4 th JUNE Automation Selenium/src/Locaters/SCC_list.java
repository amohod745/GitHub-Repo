package Locaters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SCC_list {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ssc.nic.in/registration/home");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement typeofid = driver.findElement(By.xpath("//select[@id=\"TypeofID\"]"));
		
		//driver.findElement(By.xpath("//select[@id=\"TypeofID\"]")).click();
		
		WebElement education = driver.findElement(By.xpath("//select[@id=\"EducationBoard\"]"));
		
		WebElement defalutr = driver.findElement(By.xpath("//select[@id=\"ddlEducationBoard\"]"));
		
		String candidate = "Voter ID Card/Assam Sanskrit Board /Assam Sanskrit Board ";
		String name [] = candidate.split("/");
		
		SSC(typeofid,name[0]);
		Thread.sleep(2000);
		SSC(education,name[1]);
		Thread.sleep(2000);
		SSC(defalutr,name[2]);
	}
	public static void SSC(WebElement element, String value) {
		
		Select s1 = new Select(element);
	s1.selectByIndex(6);

	}

}

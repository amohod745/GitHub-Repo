import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mock1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		
    	driver.findElement(By.xpath("//span[@class=\"chNavText darkGreyText\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@aria-controls=\"react-autowhatever-1\"]")).sendKeys("Mumbai");
		
	//	driver.findElement(By.xpath("//span[@class=\"lbl_input latoBold  appendBottom5\"]")).sendKeys("Mumbai");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=\"To\"]")).sendKeys("Goa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Search\"]")).click();
		
		
	}

}

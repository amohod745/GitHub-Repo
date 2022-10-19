package Pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertPopup3_alertwithsendkeys {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		Thread.sleep(2000);
		// perform driver.switchTo().aletr --> (retrun type is aletr) and strore into Aletr
        Alert text = driver.switchTo().alert();
        System.out.println("Alert message :"+ text.getText());
        text.sendKeys("Hello ! World");
		Thread.sleep(2000);
        text.accept();
        
	}

}

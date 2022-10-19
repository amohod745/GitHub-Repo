package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		Thread.sleep(3000);
		
	    // creat a obj of actions class to perform mouseaction
		Actions act = new Actions(driver);
		act.keyDown(Keys.BACK_SPACE).build().perform();
		Thread.sleep(3000);
	//	String test = driver.findElement(By.xpath("//p[contains(text(),\"You entered: BACK_SPACE\")]")).getText();
	//	System.out.println(test);
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),\"You entered: BACK_SPACE\")]")).getText());
        Thread.sleep(3000);
        act.keyDown(Keys.ALT).build().perform();
        Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p[text()=\"You entered: ALT\"]")).getText());

	}

}

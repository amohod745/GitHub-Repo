package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		Thread.sleep(2000);
		// find xpath of element and store into webelement
		WebElement input1 = driver.findElement(By.xpath("//textarea[@name=\"text1\"]"));
		WebElement input2 = driver.findElement(By.xpath("//textarea[@name=\"text2\"]"));
		
		// keyborads action --> sendkeys
		input1.sendKeys("hello world !");
		
		Actions act = new Actions(driver);
		//for ctrl + A
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("A");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		// for ctrl + C
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("C");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		// fro TAB
		
		act.sendKeys(Keys.TAB);
		act.build().perform();
		
		// for ctrl + V
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("V");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		if(input1.getText().equals(input2.getText())) {
			System.out.println("correct coied");
		}
		else {
			System.out.println("incorrect");
		}
//		if(input1.getAttribute("values").equals(input2.getAttribute("values"))){
//			System.out.println("correct");
//		}
//		else {
//			System.out.println("incorrect");
//		}
		
		
		
	}

}

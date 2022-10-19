package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(4000);
		//create a ojb of actions class to perform drag and drop funtion
		
		Actions act = new Actions(driver);
//		WebElement src = driver.findElement(By.id("box7"));
//		
//		WebElement des = driver.findElement(By.id("box107"));
//		Thread.sleep(3000);
//		act.dragAndDrop(src, des).build().perform();
        WebElement src = driver.findElement(By.xpath("//div[@id=\"box3\"]"));
        WebElement dse = driver.findElement(By.id("box103"));
        
        Thread.sleep(3000);
        act.dragAndDrop(src, dse).build().perform();
        Thread.sleep(1000);
        
        WebElement src1 = driver.findElement(By.xpath("//div[@id=\"box6\"]"));
        WebElement dse1= driver.findElement(By.id("box106"));
        Thread.sleep(2000);
        act.dragAndDrop(src1, dse1).build().perform();
        Thread.sleep(1000);
        
        WebElement src2 = driver.findElement(By.xpath("//div[@id=\"box7\"]"));
        WebElement dse2 = driver.findElement(By.id("box107"));
        Thread.sleep(2000);
        act.dragAndDrop(src2, dse2).build().perform();
        Thread.sleep(1000);
        
        WebElement src3 = driver.findElement(By.xpath("//div[@id=\"box2\"]"));
        WebElement dse3 =driver.findElement(By.id("box102"));
        Thread.sleep(2000);
        act.dragAndDrop(src3, dse3).build().perform();
        Thread.sleep(1000);
        
        WebElement src4 = driver.findElement(By.xpath("//div[@id=\"box1\"]"));
        WebElement dse4 = driver.findElement(By.id("box101"));
        Thread.sleep(2000);
        act.dragAndDrop(src4, dse4).build().perform();
        Thread.sleep(1000);
        
        WebElement src5 = driver.findElement(By.xpath("//div[@id=\"box2\"]"));
        WebElement dse5 = driver.findElement(By.id("box102"));
        Thread.sleep(2000);
        act.dragAndDrop(src5, dse5).build().perform();
        Thread.sleep(1000);
        
        WebElement src6 = driver.findElement(By.xpath("//div[@id=\"box4\"]"));
        WebElement dse6 = driver.findElement(By.id("box104"));
        Thread.sleep(2000);
        act.dragAndDrop(src6, dse6).build().perform();
        
        WebElement src7 = driver.findElement(By.xpath("//div[@id=\"box5\"]"));
        WebElement dse7 = driver.findElement(By.id("box105"));
        Thread.sleep(2000);
        
        act.dragAndDrop(src7, dse7).build().perform();
	}

}

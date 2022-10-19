package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
/*		// 1) by xpath
		
		driver.findElement(By.xpath("//input[@class=\"EmailInput_input_field__6t4Ux undefined\"]")).sendKeys("asd@43466");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@class=\"PasswordInput_input_field__EWMIU undefined\"]")).sendKeys("aksj145");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@class=\"PasswordInput_show_pwd_btn__Ncc9S\"]")).click();
		
		driver.findElement(By.xpath("//button[@class=\"Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu\"]")).click();
*/	
		//  2) by ID
		
/*		driver.findElement(By.id("modalusername")).sendKeys("arrdh@44y");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("current-password")).sendKeys("1456");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class=\"PasswordInput_show_pwd_btn__Ncc9S\"]")).click();
		// unmask button dose not having ID in DOM Structure
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=\"Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu\"]")).click();
*/		// login button dose not having ID in DOM Structure
		
		//  3) by Name
		
/*		driver.findElement(By.name("email")).sendKeys("akshg@35353");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("current-password")).sendKeys("1455@3ysg");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class=\"PasswordInput_show_pwd_btn__Ncc9S\"]")).click();
        // name attribute is not present in unmask button DOM structure
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=\"Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu\"]")).click();
*/        //  name attribute is not present in login button DOM structure
		
	    //  4) by tagname 
		//  15 tagname are present in DOM Structure "result 1 of 15"
		
	//	driver.findElement(By.tagName("input")).sendKeys("amohod745@gmail.com");
		
		// 5) by Link Text
		
	//	driver.findElement(By.linkText("Forgot password?")).click();
		
	//	driver.findElement(By.linkText(" Sign up")).click(); // not responding
	//	Thread.sleep(1000);		
		
		//  6) by Partial
		
	//	driver.findElement(By.partialLinkText("Forgot pas")).click();
		
		//  7) by classname
		
		driver.findElement(By.className("EmailInput_input_field__6t4Ux undefined")).sendKeys("kasgyywej@yeajj");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("PasswordInput_input_field__EWMIU undefined")).sendKeys("12532@kksn");
		
		Thread.sleep(1000); /// NO SUCH WINDOW EXCEPTION
		
		driver.findElement(By.className("PasswordInput_show_pwd_btn__Ncc9S")).click();
		
		driver.findElement(By.className("Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu")).click();

		
	}
}

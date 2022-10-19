package TestNG_Annotations_keywors;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Kite_Test {
   
WebDriver driver;	
	@SuppressWarnings("deprecation")
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
	}
	@Test
	public void kiteOnPlayStroeAndAppStrore() {
		boolean icon =  driver.findElement(By.xpath("//div[@class=\"app-icons\"]")).isDisplayed();
		System.out.println(icon);
	}
	@Test
	public void loginPageTitel() {
		String titel = driver.getTitle();
		System.out.println(titel);
	}
	@Test
	public void zarodhainfno() {
		String textinfo = driver.findElement(By.xpath("//p[@class=\"text-light text-xxsmall exchanges-info dim\"]")).getText();
		System.out.println(textinfo);
	}
	@Test
	public void version() {
		String version = driver.findElement(By.xpath("//p[contains(text(),\"v3.0.6\")]")).getText();
		System.out.println(version);
	}
	@Test
	public void kiteLogo() {
		boolean applogo = driver.findElement(By.xpath("//a[@class=\"logo kite-logo\"]")).isDisplayed();
		System.out.println(applogo);
	}
	@Test
	public void singUp() {
		driver.findElement(By.xpath("//a[@class=\"text-light\"]")).click();
		
		Set<String> pages = driver.getWindowHandles();
		Iterator<String> it = pages.iterator();
		String mainpage= it.next();
		String aboutpage = it.next();
		driver.switchTo().window(aboutpage);
		
		String s=driver.findElement(By.xpath("//a[contains(text(),\"About\")]")).getText();
		System.out.println(s);
		System.out.println(mainpage);
		System.out.println(aboutpage);
	}
	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}
	
}

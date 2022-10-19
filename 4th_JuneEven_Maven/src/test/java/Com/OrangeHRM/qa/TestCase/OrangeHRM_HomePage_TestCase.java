package Com.OrangeHRM.qa.TestCase;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.OrangeHRM.qa.Base.OrangeHRM_TestBase;
import Com.OrangeHRM.qa.Pages.OrangeHRM_HomePage;
import Com.OrangeHRM.qa.Pages.OrangeHRM_LoginPage;

public class OrangeHRM_HomePage_TestCase extends OrangeHRM_TestBase {

	OrangeHRM_LoginPage loginpage;
	OrangeHRM_HomePage homepage;
	
	
	public OrangeHRM_HomePage_TestCase() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void SetUp() throws IOException {
		OrangeHRM_TestBase.initialization();
		loginpage = new OrangeHRM_LoginPage();
		homepage = new OrangeHRM_HomePage();
		
	}
	@Test
	public void employeename() throws InterruptedException {
		loginpage.validateUsername(props.getProperty("username"), props.getProperty("password"));
		Thread.sleep(2000);
		
		homepage.clickonreport(props.getProperty("reportername"));
	}
	
	@Test
	public void listofconfigu() throws InterruptedException {
		loginpage.validateUsername(props.getProperty("username"), props.getProperty("password"));
		driver.findElement(By.xpath("//span[contains(text(),\"Configuration \")]")).click();
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@class=\"oxd-dropdown-menu\"]//li"));
		System.out.println(list1.size());
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i).getText());
			if(list1.get(i).getText().equals("Reporting Methods")) {
				list1.get(i).click();
				break;
			}
		}
	}
	
	@Test
	public void addandsave() throws InterruptedException {
		
		loginpage.validateUsername(props.getProperty("username"), props.getProperty("password"));
		driver.findElement(By.xpath("//span[contains(text(),\"Configuration \")]")).click();
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@class=\"oxd-dropdown-menu\"]//li"));
		System.out.println(list1.size());
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i).getText());
			if(list1.get(i).getText().equals("Reporting Methods")) {
				list1.get(i).click();
				break;
			}
		}
	
		homepage.clickonADD(props.getProperty("inputname"));
}
	public void OrangeLink() throws InterruptedException {
		loginpage.validateUsername(props.getProperty("username"), props.getProperty("password"));
		driver.findElement(By.xpath("//span[contains(text(),\"Configuration \")]")).click();
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@class=\"oxd-dropdown-menu\"]//li"));
		System.out.println(list1.size());
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i).getText());
			if(list1.get(i).getText().equals("Reporting Methods")) {
				list1.get(i).click();
				break;
			}
		}
	
		homepage.clickonADD(props.getProperty("inputname"));
		
		homepage.OrangeHRMwindow();
		
		Set<String> S1 = driver.getWindowHandles();
		Iterator<String> it = S1.iterator();
		String mainpage = it.next();
		String linkpage = it.next();
		
		System.out.println(mainpage);
		System.out.println(linkpage);
		driver.switchTo().window(linkpage);
		String titel = driver.getTitle();
		System.out.println(titel);
		
		driver.switchTo().window(mainpage);
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}

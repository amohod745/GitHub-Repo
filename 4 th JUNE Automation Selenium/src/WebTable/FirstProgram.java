package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		
		WebElement ex = driver.findElement(By.xpath("//h3[contains(text(),\"Example\")]"));
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ex);
		
		//firsy way ----> to find row
		int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		System.out.println("Total number of row :" +row);
		
		//second way
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println("Total numbers of rows :" +rows.size());
		
		// number of col present in table
		// first way
		int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("Total number of col :" +col);
		
		//second way
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
		System.out.println("Total numbers of col :" +cols.size());
		
		// Retrieve the specific row/col from table
		
		String value = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[7]/td[2]")).getText();
		System.out.println(value);
		
		String value1 = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[4]/td[3]")).getText();
		System.out.println(value1);
		
		//Retrieve all the data for table
		for(int i=2; i<=row;i++) {
			for(int j=1; j<=col; j++ ) {
				String values = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
                System.out.print(values +" | ");
			}
			System.out.println();
		}
		
		
		
		
	}		
}

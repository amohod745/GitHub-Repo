package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sir {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		
		//Step 2 :
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),\"Create New Account\")]")).click();
		
		Thread.sleep(3000);
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		Select selectday = new Select(day);
		
		//1 Q.How will u get total number of size
		
		List<WebElement>Listday = selectday.getOptions();
		System.out.println(Listday.size());
		
		//2. Q How will u print all the values from the list
		
		for(int i=0;i<Listday.size();i++) {
			
			String dayvalues = Listday.get(i).getText();
			
			System.out.println(dayvalues);
			
	    //Q 3 - How will you select specified values from list 
			
			if(dayvalues.equals("15")) {
				Listday.get(i).click();
			    break;
			}
		}
		
		System.out.println("------------------------------------------");
		
		Select selectmonth = new Select(month);
		List<WebElement>Listmonth=selectmonth.getOptions();
		System.out.println(Listmonth.size());
		
		for(int i=0;i<Listmonth.size();i++) {
			
			String MonthValues  = Listmonth.get(i).getText();
			System.out.println(MonthValues);
			
			if(MonthValues.equals("May")) {
				Listmonth.get(i).click();
				break;
			}
		}
		
		Select selectyear = new Select(year);
	    List<WebElement>Listyear = selectyear.getOptions();
	    System.out.println(Listyear.size());
	    
	    for(int i=0; i<Listyear.size(); i++) {
	    	String Yearvalues = Listyear.get(i).getText();
	    	System.out.println(Yearvalues);
	    	
	    	if(Yearvalues.equals("2020")) {
	    		Listyear.get(i).click();
	    		break;
	    	}
	    }
	
	
	
	
	
	
	}
	
	

}



package ListBox;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Ass {
    
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Thread.sleep(2000);
		
		String skille = "//select[@id=\"Skills\"]//option";
		String year = "//select[@id=\"yearbox\"]//option";
		String month = "//select[@placeholder=\"Month\"]//option";
		String day = "//select[@id=\"daybox\"]//option";
		
		String a = "APIs/1923/June/8";
		String b [] = a.split("/");
		
		Thread.sleep(2000);
		dropdown(skille,b[0]);
		Thread.sleep(1000);
		
		dropdown(year,b[1]);
		Thread.sleep(1000);

		dropdown(month,b[2]);
		Thread.sleep(1000);

		dropdown(day,b[3]);
		
	
		
	}
    public static void dropdown(String paths, String values){
    	List<WebElement>lists = driver.findElements(By.xpath(paths));
    	
    	// print the size of elemet
    	
    	System.out.println(lists.size());
    	
    	// print all the values in list 
    	
    	for(int i=0; i<lists.size(); i++) {
    		String dob = lists.get(i).getText();
    		System.out.println(dob);
    	
    	//select the values
    		
    		if(lists.get(i).getText().equals(values)) {
    			lists.get(i).click();
    		}
    	}
    }
}

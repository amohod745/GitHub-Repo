package JavScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownBypixcel {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		// scrolldown/up by pixcel
		JavascriptExecutor js =(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,2000)", "");
//    	Thread.sleep(3000);
//    	
//    	js.executeScript("window.scrollBy(0,-1000)", "");
//    	
    	// scroll till bottom/ up
//    	Thread.sleep(3000);
    	js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
  	
//		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		 Thread.sleep(3000);

		 js.executeScript("document.documentElement.scrollTop=0");
    	
    	
    	
	}

}

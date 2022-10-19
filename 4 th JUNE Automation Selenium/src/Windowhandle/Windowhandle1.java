package Windowhandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
//to print single browser windowID ---> use method driver.getWindowHandle(); ---> store into String (retrun type= String)
		
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
//		CDwindow-DC1A04E6407A8D45C60B6F8E34C7956E
//		CDwindow-72F5542A7AC277C0C010265EA3DCEB99
//      CDwindow-F7E98BCC90F5249E5DE424035AAED650

//      The getWindowHandle(); method is used to store the single window browser ID		
		driver.quit();
	}

}

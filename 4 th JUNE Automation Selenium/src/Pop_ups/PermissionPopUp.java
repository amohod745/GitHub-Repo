package Pop_ups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		
		// create a object of ChromeOptions class
		ChromeOptions option = new ChromeOptions();
		// to disable notification --> use addArguments method with objectname of chromeoption and pass para as "--disable-notifications"
		option.addArguments("--disable-notifications");
		// pass object name of chromeoptions as parameter in chromedriver constructor
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		
	}

}

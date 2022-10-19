package Com.OrangeHRM.qa.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.Utils;

import Com.OrangeHRM.qa.Utility.OrangeHRM_TestUtility;

public class OrangeHRM_TestBase {
	
	
	public static WebDriver driver;
	public static Properties props;
	
	
	public OrangeHRM_TestBase() throws IOException {
		
		props = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\amoho\\eclipse-workspace\\4th_JuneEven_Maven\\src\\main\\java\\Com\\OrangeHRM\\qa\\Configure\\Configure.properties_for_LoginPage");
		props.load(fis);
		
	}
	
	@SuppressWarnings("deprecation")
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amoho\\eclipse-workspace\\4th_JuneEven_Maven\\Browsers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(OrangeHRM_TestUtility.IMPLICIT_WAIT, TimeUnit.SECONDS); // methods from OrangeHRM_TestUtility
		driver.manage().timeouts().pageLoadTimeout(OrangeHRM_TestUtility.PAGELOAD_WAIT, TimeUnit.SECONDS); // methods from OrangeHRM_TestUtility
		
		driver.get(props.getProperty("url"));
	}

	public String getScreenshotAs(String reportername) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String destination = System.getProperty("user.dir")+"\\Screenshots\\"+reportername+".png";
		
		FileUtils.copyFile(source, new File(destination));
		
		return destination;
	}
//	public static void uploadSampleImage(StaticSeleniumDriver driver)
//	{
//	    File file = new File(System.getProperty("user.dir") + "\\ExceiSheet\\Student.xlsx/" + SAMPLE_DOCUMENT_FILE_NAME);
//	    Utils.Log("file exists: " + file.exists());
//
//	    String imagePath = file.getAbsolutePath();
//	    WebElement input = driver.findElement(By.name("file"));
//	    input.sendKeys(imagePath);
//	    
//	}
//	
}

package POM_with_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_Class {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
       
	   ChromeOptions opt = new ChromeOptions();
	   opt.addArguments("--disable-notifications");
       System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
       WebDriver driver = new ChromeDriver(opt);
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.get("https://kite.zerodha.com/");
       
    // TO fetch data from excel sheet
       FileInputStream file = new FileInputStream("C:\\Desktop\\Test DATA\\kite user data.xlsx");
       Sheet SH = WorkbookFactory.create(file).getSheet("Sheet1");
       
    // Cretae object of Pom class
       Kite_login_page1 KP1 = new Kite_login_page1(driver);
    // to fetch userid from excel sheet
       String USERID = SH.getRow(0).getCell(0).getStringCellValue();
       KP1.UID(USERID);
       
    // to fetch password from excel sheet
       String pass1 = SH.getRow(0).getCell(1).getStringCellValue();
       KP1.pass(pass1);
       
    // click on loginbutton
       KP1.LoginTAB();
       Thread.sleep(2000);
      
    // Cretae object of Pom class
       Kite_Login_page2 KP2 = new Kite_Login_page2(driver);
    // to fetch pin from excel sheet
       String pinnumber = SH.getRow(0).getCell(2).getStringCellValue();
       KP2.pinForID(pinnumber);
       Thread.sleep(2000);
    // Click on ContinueButton
       KP2.PINbutton();
       
    // Cretae object of Pom class
       KIte_Home_Page KH = new KIte_Home_Page(driver);
       
       KH.verifyUserID(USERID);
       
    }

}

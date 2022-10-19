package Windowhandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"OrangeHRM, Inc\"]")).click();
		Thread.sleep(3000);
//		 to print singel window ID ---> use getWindowHandle(); method --> retrun type String
//		String WindowID = driver.getWindowHandle();
//		System.out.println(WindowID);
//		CDwindow-737954877CDE38F688E09FEFEF9C2CD8
		
// to print multipel browser id we want to use getWindowHandles(); method
//		---> Retrun type is Set<String> // set of string
		
		Set<String> WindowID = driver.getWindowHandles();
		System.out.println(WindowID);
// [CDwindow-DAE5080911B42B282F8FB4C106C4BCCF, CDwindow-A6EBE59A91F577C73BB98CF283D98E3F]
// to know which id belongs to which browser---> 1) First Method = Iterator // 2) Arraylist by passing set<string> referance variable
	
		// 1) first Method ---> Iterator
		
		Iterator<String> it = WindowID.iterator();
		String perentwindow = it.next(); // it gives first windows browser id
		String childwindow = it.next();  //it gives next windows browser id
		
		System.out.println("Perent windowID :" +perentwindow);
		System.out.println("Child windowID :" +childwindow);
		System.out.println("=================================================================");
		
		// 2) second method ---> AraayLIst/list
		
        ArrayList<String> windowlist = new ArrayList(WindowID); // here we pass one para in constructor of Arraylist
		String perentwindow1 = windowlist.get(0); // one para is referance variable of Set<String>
		String childwindow1 = windowlist.get(1);
		System.out.println("Perent Window ID :"+perentwindow1);
		System.out.println("Child Window ID :"+childwindow1);
		
		
		
                                                      
		
	}

}

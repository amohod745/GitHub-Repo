package MultipleLinks;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		// total links present of webpage
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("numbers of link present on page : " + link.size());
//		for(WebElement element : link) {
//			System.out.println(element.getAttribute("href"));
//		}
		
		int brokenlinks = 0;
		
		for(WebElement element : link) {
			
			String url= element.getAttribute("href");
//			if(url == null || url.isEmpty()) {
//				System.out.println("Link is null or empty");
//				continue;
//			}
			URL links = new URL(url);
			
			HttpsURLConnection httpcode = (HttpsURLConnection) links.openConnection();
			httpcode.connect();
			if(httpcode.getResponseCode()>=400)
			{
				System.out.println(httpcode.getResponseCode()+"------>"+url+"is ----->"+" Brokenlink");
				brokenlinks++;
			}
			else
			{
				System.out.println(httpcode.getResponseCode()+"------>"+url+"is ----->"+" Valid Link");
			}
			
		}
		System.out.println("Numbers of brokenlinks : " + brokenlinks);
	}
}


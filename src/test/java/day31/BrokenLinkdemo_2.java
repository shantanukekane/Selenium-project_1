package day31;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkdemo_2 {

	public static void main(String[] args) throws IOException {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// open url or application
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		// first we initialize the brokenlink using integer
		
		int brokenlinks = 0;
		
	    List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement linkEle:links)
		{
			String hrefvalue = linkEle.getAttribute("href");
			
			if(hrefvalue==null || hrefvalue.isEmpty())
			{
				System.out.println("The hrefvalue is empty value or null value");
				continue;
			}
			
			// create a object for the string value convert into URL
			
			URL UrlLinks = new URL(hrefvalue);  
			
			//first we have to open the connection using URL and again covert into HttpURLconnection to connect the
			// server
			
		   UrlLinks.openConnection();   // to open the connection of the server
		   
		   HttpURLConnection  conn = (HttpURLConnection) UrlLinks.openConnection();  // 
			
		   conn.connect();   //using this method we connect to the server
		   
		   if(conn.getResponseCode() >= 400)
		   {
			   System.out.println(hrefvalue+"======>"+"Broken links");
			   brokenlinks++;
		   }
		   else
		   {
			   System.out.println(hrefvalue+"======>"+" Not Broken links");
		   }
			
		}
		System.out.println("Total Number of broken link: "+brokenlinks);
		
		
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

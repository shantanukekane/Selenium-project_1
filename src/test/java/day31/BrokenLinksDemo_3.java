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

public class BrokenLinksDemo_3 {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open Url
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links: "+links.size());
		
		int brokenlinks = 0;
		
		for(WebElement linkEle:links)
		{
			
			String hrefvalue = linkEle.getAttribute("href");
			
			if(hrefvalue==null || hrefvalue.isEmpty())
			{
				
				System.out.println("The hrefvalue is null or empty value");
				
			}
			
			
			// convert this string into the URL
			
			URL urlLinks = new URL(hrefvalue);
			
			
			// again we have to open the link in URL format and convert into Http format
			
			urlLinks.openConnection();  // using these we just open the connection of the server
			
		    HttpURLConnection conn = (HttpURLConnection) urlLinks.openConnection();
			
		     
		    conn.connect();  // using these we connec to the server 
		    
		    if(conn.getResponseCode() >= 400)
		    {
		    	
		    	System.out.println(hrefvalue+"=======>"+"Broken links");
		    	brokenlinks++;
		    }
		    else
		    {
		    	
		    	System.out.println(hrefvalue+"========>"+"Not Broken links");
		    	
		    }			
			
		}
		System.out.println("Total Number of links: "+brokenlinks);
	

	}

}

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

public class BrokenLinksDemo_1 {

	public static void main(String[] args) throws IOException {
	
		
        WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.opencart.com/index.php");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of links: "+links.size());
		
		
		int brokenlinks = 0;
		
		for(WebElement linkEle:links)
		{
			
			// pre-requisit of the  link is that the value of the href attribute should not be null or empty
			String hrefAttvalue = linkEle.getAttribute("href");
		
			if(hrefAttvalue == null || hrefAttvalue.isEmpty())
			{
				System.out.println("href attribute value is empty");
				continue;
			}
			
			
			URL urlLinks =  new URL(hrefAttvalue);    // convert string into URL format 
			
			// send the request to the server  -- Open ,connet
			
			urlLinks.openConnection();      // open the connection to the server
			// again we are coverting the URL connection to the HttpURL connection and connecting to the server
			// and store in a variable using type casting HttpURLConnection
			
		    HttpURLConnection conn = (HttpURLConnection) urlLinks.openConnection();  
			
		    conn.connect();
		    
		    if(conn.getResponseCode()>=400)
		    {
		    	System.out.println(linkEle.getText()+"=====>" +"Broken link");
		    	brokenlinks++;
		    }
		    else
		    {
		    	System.out.println(linkEle.getText()+"=====>" +"Not Broken link");

		    }
			
			
		}
		System.out.println("Total Number of Broken links: "+brokenlinks);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

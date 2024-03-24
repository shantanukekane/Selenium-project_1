package day26;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleBrowser_window {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open url or applications
		
		driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    
	    // Locating the child window browser
	    driver.findElement(By.linkText("Twitter")).click();
	    
	   // capture the window ids
	    
	    Set<String> WindowIDs = driver.getWindowHandles();
	    
	    // Approach 2
	    /*
	    for(String winIDs:WindowIDs)
	    {
	       String title = driver.switchTo().window(winIDs).getTitle();
	        if(title.equals("nopCommerce (@nopCommerce) / X"))
	        {
	        	driver.findElement(By.xpath("")).click();
	        }
	    }
	    
	    */
	    
	    // closing the parent window
	    for(String winIDs:WindowIDs)
	    {
	        String title = driver.switchTo().window(winIDs).getTitle();
	        if(title.equals("nopCommerce demo store"))       // for closing parent window
	        {
	        	driver.close();
	        }
	    }
	    // if we want to close the child window 
	    for(String winIDs:WindowIDs)
	    {
	       String title = driver.switchTo().window(winIDs).getTitle();
	        if(title.equals("nopCommerce (@nopCommerce) / X"))
	        {
	        	driver.close();                            // for closing child window
	        }
	    }

	}

}

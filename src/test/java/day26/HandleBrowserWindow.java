package day26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open url or applications
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();

        
		driver.findElement(By.linkText("Twitter")).click();
	 
		
		// captures IDs of Browser windows
		
	    Set<String> WindowIDs = driver.getWindowHandles();
	   
	    //  Approach 1 
	    //print the ids by using the each loop 
	    //but there are only two IDs so we don't prefer to use for loop
	    
	    /*
	    for(String WinID:WindowIDs)
	    {
	    	System.out.println("Total Number of IDs: "+WinID);
	    }
	    */
	    
	  
	    // converting Set into list by creating list collections
	    
	    List<String> WindowIDlist = new ArrayList(WindowIDs);   
	    
	    // indexing parent id & child id
	    String parentwindowID = WindowIDlist.get(0);
	    
	    String childwindowID = WindowIDlist.get(1);
	   
	    // Switch to child window ID
	    
	    driver.switchTo().window(childwindowID);
	    
	    Thread.sleep(5000);	    
	    driver.findElement(By.xpath("(//img[@alt='Image'])[2]")).click();
	    
	    
	    // Switch to parent windowID
	    
	    driver.switchTo().window(parentwindowID);
	    driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("MackBook");
	    
	    driver.findElement(By.xpath("//button[@type = 'submit'][text() = 'Search']")).click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
	}

}

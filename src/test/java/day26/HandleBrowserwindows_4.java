package day26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserwindows_4 {

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Open URL or application
		
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href = 'http://www.orangehrm.com'][text() = 'OrangeHRM, Inc']")).click();
		
		
		
		// capture the ids of both browser windows
	    Set<String> WindowIDs =	driver.getWindowHandles();
		
	    
	    //Approach 1 - using list collections
	    /*
		List<String> windowidlist = new ArrayList(WindowIDs);
	    
	    String parentwindowid = windowidlist.get(0); 
		String childwindowid = windowidlist.get(1);
		
		
		
		// switching to the child browser window to perform some task
		
		driver.switchTo().window(childwindowid);
		
	
		driver.findElement(By.xpath("//div[@class = 'd-flex web-menu-btn']//li[2]//button")).click();
		
		
		// again if i wanted to switch to the parent window
		driver.switchTo().window(parentwindowid);
		
		driver.findElement(By.xpath("//input[@name = 'txtUsername']")).sendKeys("admin");
		
		*/
	    
	    // Approach 2 - using Enhance loop
	    
	    for(String winIds:WindowIDs)
	    {
	    	// we have to shift to the browser window but we don't know which one is parent and child browser
	    	
	        String title = driver.switchTo().window(winIds).getTitle();
	        
	        if(title.equals("OrangeHRM HR Software | OrangeHRM"))
	        {
	      
	        	driver.findElement(By.xpath("//div[@class = 'd-flex web-menu-btn']//li[2]//button")).click();                                    
	        
	        }
	        else if(title.equals("OrangeHRM"))
	        {
	        	driver.findElement(By.xpath("//input[@name = 'txtUsername']")).sendKeys("admin");
	        }
	        
	    }
	    
	    // closing the multiple windows
	    for(String winIds:WindowIDs)
	    {
	        String title = driver.switchTo().window(winIds).getTitle();
	        if(title.equals("OrangeHRM"))
	        {
	        	driver.close();
	        }
	    }
	    
	    
	    
	    
	    
	    
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

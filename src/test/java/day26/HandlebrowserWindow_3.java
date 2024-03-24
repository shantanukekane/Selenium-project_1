package day26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlebrowserWindow_3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// open url
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		//locating the child browser
		driver.findElement(By.linkText("Open Source HRMS")).click();
		
		// capture the window ids
		
	    Set<String> WindowIDs =	driver.getWindowHandles();
		
		//set is converting into list
	    
	    List<String> winIdlist = new ArrayList(WindowIDs);
	    
	    // parent and child ids
	    
	   String parentid = winIdlist.get(0);
	   String childid = winIdlist.get(1);
	   
	   
	   /*
	    // For using Enhance loop
	    for(String winIds:WindowIDs)
	    {
	      String title = driver.switchTo().window(winIds).getTitle();
	      if(title.equals("Free HR Software | Open Source | OrangeHRM"))
	      {
	    	  driver.findElement(By.linkText("Contact Sales")).click();
	      }
	    
	    	
	    }
	    */
	    
	      
	   // Switching to the child browser
	   
	   driver.switchTo().window(childid);
	   driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
	   
	   
	   //Switching to the parent browser
	   
	   driver.switchTo().window(parentid);
	   
	   driver.findElement(By.xpath("//img[@src='https://test-website.orangehrm.com/assets/Uploads/icons/language/uk-flag.png']")).click();
	   
	   
	   
	   
	   
	   
	   
	   
	    
	    
	   
	   
	   
	   
	   
	    
	    
	    
	    
		
		
		
		

	}

}

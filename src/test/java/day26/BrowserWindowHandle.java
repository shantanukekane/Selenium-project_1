package day26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declare the implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//open url or application
		
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href = 'http://www.orangehrm.com']")).click();
		
		
		// captures the two window ids
		
	    Set<String>	WindowIDs = driver.getWindowHandles();
		
	    // converting set into list
	    
	    List<String> Windowidlist = new ArrayList(WindowIDs);
	    
	    // Now we can get the parent id & child id
	    
	    String parentid = Windowidlist.get(0);
	    String childid = Windowidlist.get(1);  
	    
	     
	    // Switching to the child browser
	    
	    driver.switchTo().window(childid);
	    
	    //driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[2]//a[1]")).click();
	  
	    driver.findElement(By.xpath("//div[@class = 'secondary-menu']//ul//li[2]//a[text() = 'Executive Profiles']")).click();
	  
	    
	    // Switching back to the parent window browser
	    
	    driver.switchTo().window(parentid);
	    
	    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
	    
	    
	    
	    
	    
	   
	    
	     
	    
	    
	    
	    
	    
	    
	    
	    
		

	}

}

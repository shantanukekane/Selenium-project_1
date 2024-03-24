package day26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow_demo_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open Url or applications
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//location the another window or child window 
		driver.findElement(By.linkText("Twitter")).click();
		
		
		// captures the IDs of the browser windows
		
	    Set<String> WindowIDs = driver.getWindowHandles();
		
	    
		/*
		for(String WindID:WindowIDs)
		{
			System.out.println("Total Number of ID: "+WindID);
		}
		*/
		// converting set into list and print these ids 
	    
		List<String>  WindowIdlist = new ArrayList(WindowIDs);

	    String parentwindowId  =  WindowIdlist.get(0);
	    String childwindowId =	 WindowIdlist.get(1);
		
		//System.out.println(childwindowId);
		//System.out.println(parentwindowId);
	    
	    //Switching to the child browser window id
		
		driver.switchTo().window(childwindowId);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img[@alt='Image'])[1]")).click();
		
		// switching to the parent browser window id
		
		driver.switchTo().window(parentwindowId);
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Macbook");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type = 'submit'][text() = 'Search']")).click();
		
		
		
		
		
		
		
	    
		
		
		
		
	}

}

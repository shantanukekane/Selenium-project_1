package day22;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getmethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		// launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
	
		// Open url or application using the get() method
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//driver.getTitle();
		System.out.println("Title of the Web page: "+driver.getTitle());
		
		//driver.getCurrentUrl();
		System.out.println("Current URL: "+driver.getCurrentUrl());
		
		//driver.getWindowHandle();
		System.out.println(driver.getWindowHandle());//B939A5D33B41EE79AF6F18E306862D7A
                                                     //B8E1492937BE2C76DAE11FDC5104CFDC
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
	    Set<String> WindowIDs = driver.getWindowHandles();  // getting set of multiple window ids
		
	    for(String WinID:WindowIDs)
	    {
	    	System.out.println(WinID);
	    }
		
		
	    
	    
	    
	    
		
		

	}

	
}

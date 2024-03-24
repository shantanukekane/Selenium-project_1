package day25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerthandle_with_explicitwait_1 {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
				
		
		// Declaration of Explicit wait
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Open url or application
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");		
		
		// Locating the element 
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		
	    Alert alert_window = mywait.until(ExpectedConditions.alertIsPresent());
		
	    System.out.println(alert_window.getText());
	    
	    alert_window.accept(); // to close by using ok button
	    
	    //alert_window.dismiss(); // to close by using close button
	    
	    
	    
	    
	    
	    
		
		
	}

}

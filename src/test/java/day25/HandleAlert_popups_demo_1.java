package day25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlert_popups_demo_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		/*
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    // Open url or application
	    
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.manage().window().maximize();
	    
	    
	    driver.findElement(By.xpath("//button[text() = 'Click for JS Alert']")).click();
	    
	    
	    Alert alert_window = driver.switchTo().alert();  // This method switch to alert window 
	    
	    alert_window.accept();  // to click the ok button
	    //alert_window.dismiss(); // To click the cancle button 
	    
	    */
		
		// Declaration of Explicit wait 
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		// Open url 
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		// Locating the element and perform the click action
		driver.findElement(By.xpath("//button[text() = 'Click for JS Alert']")).click();
		
		// Perform the action on alert popups or Alert
		Alert alert_window = mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alert_window.getText());
		
		alert_window.accept(); // To click on ok button 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
	    
		
		
		
		
		
		
		
		
		

	}

}

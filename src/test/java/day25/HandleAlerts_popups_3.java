package day25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts_popups_3 {

	public static void main(String[] args) {
	 
		
		WebDriverManager.chromedriver().setup();
		
		//Create an object for the chrome Browser
		WebDriver driver =  new ChromeDriver();
		
		// Declaration of Explicit Wait
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Locating the WebElement 
		
		driver.findElement(By.xpath("//button[text() = 'Click for JS Prompt']")).click();
		
		//perform some action on alert
		
	    Alert alert_window = mywait.until(ExpectedConditions.alertIsPresent());
		
	    alert_window.accept();
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

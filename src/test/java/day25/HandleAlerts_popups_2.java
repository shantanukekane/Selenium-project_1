package day25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts_popups_2 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		
		// Creata an object for the web browser
		
		WebDriver driver = new ChromeDriver();
		
		// declaration of Explicit wait
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		// Open URL or applications
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		// Locating the Element using different locators
		driver.findElement(By.xpath("//button[text() = 'Click for JS Confirm']")).click();
		
		//perform action on alert popups
	    Alert alert_window =  mywait.until(ExpectedConditions.alertIsPresent());
		
	    System.out.println(alert_window.getText());
	    
       // alert_window.accept();  // To click on ok button
        alert_window.dismiss(); // To click on cancel button
        
        
        
        
        
	    
	}

}

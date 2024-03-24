package day25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts_Popups {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// One think remember that when you are validating the popups should prefer Explicit wait
		
		// declaration of Explicit wait
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		// open URl or application
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
		// findding the element and perform click method
		
		driver.findElement(By.xpath("//button[text() = 'Click for JS Alert']")).click();
		
	    Alert alert_window = mywait.until(ExpectedConditions.alertIsPresent());
	    
	   System.out.println(alert_window.getText());
	    
	    
		alert_window.accept();   // this will close the alter window by using ok button
		
		
		
	}

}

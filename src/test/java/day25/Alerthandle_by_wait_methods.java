package day25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerthandle_by_wait_methods {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
				
		
		// Declaration of implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open url or application
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");		
		
		// Locating element and perform click method
		driver.findElement(By.xpath("//button[text() = 'Click for JS Alert']")).click();
		
		
	    Alert alert_window = driver.switchTo().alert();
		
	    System.out.println(alert_window.getText());
	    
	    alert_window.accept();
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		

	}

}

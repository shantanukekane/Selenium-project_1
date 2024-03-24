package day25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_No_4_rediffmail {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		// Create an object for the chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//Declaration of Explicit wait
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		// Open URL or application
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// Locating the Web element submit button
		
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
		
		Thread.sleep(5000);
 	    Alert alert_window = mywait.until(ExpectedConditions.alertIsPresent());
		
 	    // capture the text after alter popops
 	    System.out.println(alert_window.getText());
		
 	    alert_window.accept();  // for close to click on ok button
		
		
		
		

	}

}

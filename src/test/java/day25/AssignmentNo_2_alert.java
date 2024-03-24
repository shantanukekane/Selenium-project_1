package day25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentNo_2_alert {

	public static void main(String[] args) throws InterruptedException {
		
		/*
       WebDriverManager.chromedriver().setup();
       
       WebDriver driver = new ChromeDriver();
       
       // Open url or applications
       
       driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       
       
       // Locating the Element  and perform click method
       
       driver.findElement(By.xpath("//button[text() = 'Click for JS Alert']")).click();
       
       
       Alert alert_window = driver.switchTo().alert();
       
       System.out.println(alert_window.getText());
       
       alert_window.accept();
		
		
		*/
		
       // using the Explicit wait
       
       WebDriverManager.chromedriver().setup();
       
       WebDriver driver = new ChromeDriver();
       
       // declaration of Explicit wait
       
       WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
       
       // Open url or applications
       
       driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       
       
       // Locating the Element  and perform click method
       
       driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
       
       Thread.sleep(5000);
       Alert alert_window = mywait.until(ExpectedConditions.alertIsPresent());
       
       System.out.println(alert_window.getText());
       
       alert_window.accept();  // to close with ok button
	   //alert_window.dismiss();	// to close with cancel button
       
       
       
       
       
	   
	}
}


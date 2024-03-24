package day25;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_No_revised_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
	
		// Open URL or applications
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// Locating the element in web page
		
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
		Thread.sleep(3000);
	    Alert alert_window =  driver.switchTo().alert();
	    
	    System.out.println(alert_window.getText());
	    
	    alert_window.accept();
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package day25;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerthandle_by_rediffmail {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
	    Alert alert_window = driver.switchTo().alert();
		
	    System.out.println(alert_window.getText());
	    
	    alert_window.accept();
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}

}

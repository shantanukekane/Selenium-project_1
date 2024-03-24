package day25;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandled_1 {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");		
		
		
		driver.findElement(By.xpath("//button[text() = 'Click for JS Alert']")).click();
		
		
	    Alert alert_window = driver.switchTo().alert();
		
	    System.out.println(alert_window.getText());
		
		alert_window.accept();
		
		
		
		
		

	}

}

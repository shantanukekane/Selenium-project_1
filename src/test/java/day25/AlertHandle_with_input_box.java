package day25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle_with_input_box {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//Declaration of Explicit wait
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Open URL or application
		driver.get("https://the-internet.herokuapp.com/javascript_alerts"); 
		
		// Locating the element 
		driver.findElement(By.xpath("//button[text() = 'Click for JS Prompt']")).click();
		
	    Alert alert_window = mywait.until(ExpectedConditions.alertIsPresent());
		
	    //Alert alert_window = driver.switchTo().alert();
	    
	    System.out.println(alert_window.getText());
	    
	    alert_window.sendKeys("Welcome");
	    
	    alert_window.accept();
	    //alert_window.dismiss();
	    
	    //validation
	   
	    String act_text = driver.findElement(By.xpath("//p[@id='result']")).getText();	    
	    String exp_text = "You entered: Welcome";
	    
	    System.out.println(act_text);
	    System.out.println(exp_text);
	    
	    if(act_text.equals(exp_text))
	    {
	    	System.out.println("Test passed");
	    }
	    else
	    {
	    	System.out.println("Test Failed");
	    }
	    
	    
	    
	    

	}

}

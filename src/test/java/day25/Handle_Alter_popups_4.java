package day25;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Alter_popups_4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		driver.findElement(By.xpath("//button[text() = 'Click for JS Prompt']")).click();
		
	    Alert alert_window = driver.switchTo().alert();
		
	    System.out.println(alert_window.getText());
		
	    alert_window.sendKeys("welcome");
	    
	    alert_window.accept();
	    
	    //validations 
	    String act_text = driver.findElement(By.xpath("//p[@id = 'result']")).getText();
	    String exp_text = "You entered: welcome";
	    
	    if(act_text.equals(exp_text)) 
	    {
	        System.out.println("Test passed");	
	    }
	    else
	    {
	        System.out.println("Test failed");
	    }
	    
	    
	    
	    
	    
	    
	    
		
		

	}

}

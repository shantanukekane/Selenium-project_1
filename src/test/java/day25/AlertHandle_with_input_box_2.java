package day25;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle_with_input_box_2 {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
	    Alert alert_window = driver.switchTo().alert();
	    
	    alert_window.sendKeys("Selenium WebDriver");
		
	    System.out.println(alert_window.getText());
	    
	    alert_window.accept();
	    
	    //validating
	    
	    String act_text  = driver.findElement(By.xpath("//p[@id = 'result']")).getText();
	    String ext_text  = "You entered: Selenium WebDriver" ;
	    System.out.println(act_text);
	    System.out.println(ext_text);
	 
	 if(act_text.equals(ext_text)) 
	 {
		 System.out.println("Test passed");
	 }
	 else
	 {
		 System.out.println("Test Failed");
	 }
	  

	}

}

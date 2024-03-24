package day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle_with_input_box_3 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		// creata an object for the  chrome Browser
		 
		WebDriver driver = new ChromeDriver();
		
	
		
		//Open URl or application
		//"https://admin:admin@the-internet.herokuapp.com/basic_auth  // with username & password
		//"https://the-internet.herokuapp.com/basic_auth
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		// Locating the Element 
        String text = driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		
		if(text.contains("Congratulations!"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		
		
		
		

		
		
		
		
		
		
		
		
		

	}

}

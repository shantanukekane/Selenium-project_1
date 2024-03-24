package day25;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_No_3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert Alert_window = driver.switchTo().alert();
		
		System.out.println(Alert_window.getText());
		
		Alert_window.sendKeys("Welcome");
		
		Alert_window.accept();
		
	    String act_result =	driver.findElement(By.xpath("//p[text() = 'You entered: Welcome']")).getText();
		
	    String ext_result = "You entered: Welcome";
		
		if(act_result.equals(ext_result))
		{
			System.out.println("Successful login");
		}
		else
		{
			System.out.println("Login Failed");
		}
	    
	    
		
		
		
		
		
		
		
		
		

	}

}

package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_OverActions_2 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//inspecting the Elements
	    WebElement components =	driver.findElement(By.xpath("//a[normalize-space()='Components']"));
		
	    WebElement Monitors =  driver.findElement(By.xpath("//a[normalize-space()='Monitors (2)']"));
		
	    // Create an Actions class to perform action on the elements 
	    
	    Actions act = new Actions(driver);
	    
	    // Mouse hover
	    // Approach 1
	    act.moveToElement(components).moveToElement(Monitors).click().build().perform();  // creating an action and then perform 
	    
	    // Approach 2
	    //act.moveToElement(components).moveToElement(Monitors).click().perform();    // directly perform the action
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		

	}

}

package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickDemo_3 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/on-dom-element.html");
		driver.manage().window().maximize();
		
		// Inspecting the element
	    WebElement  Button_1 =	driver.findElement(By.xpath("//span[normalize-space()='right click me 1']"));
		
	    //WebElement 	Button_2 = driver.findElement(By.xpath("//span[normalize-space()='right click me 2']"));
		

	    // create an Actions class to perform the mouse action
	
	    Actions act = new Actions(driver);
	    
	    // right click
	    
	    act.contextClick(Button_1).perform();
	    
	    //act.contextClick(Button_2).perform();
	    
	    
	    // Inspecting the quit elements
	    
	    driver.findElement(By.xpath("//span[normalize-space()='Quit']")).click();
	    
	    // inspecting the copy Elements
	    
	    //driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
	    
	    Thread.sleep(3000);
	    // After click on quit command you will get the alert window
	    
	    driver.switchTo().alert().accept();   // close the quit alert window
	    
	    //Thread.sleep(3000);
	    //driver.switchTo().alert().accept();   // close the copy alert window
	    
	    
	    
	    
	    
	    
	    
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

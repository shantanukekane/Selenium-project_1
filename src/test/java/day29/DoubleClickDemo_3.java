package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickDemo_3 {

	public static void main(String[] args) {
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		
		//switching to the iframe
		
	    driver.switchTo().frame("iframeResult");
		
		// Inspect the element F1
	    
	    WebElement F1 = driver.findElement(By.xpath("//input[@id='field1']"));
        F1.clear();
        F1.sendKeys("Double click");
        
        WebElement button =  driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        
        Actions act = new Actions(driver);
        
        act.doubleClick(button).perform();
        
        //inspect the field 2
        
        WebElement F2 =  driver.findElement(By.xpath("//input[@id='field2']"));
        
        String copied_text = F2.getAttribute("value");
        System.out.println(copied_text);
        
        
        if(copied_text.equals("Double click"))
        {
        	System.out.println("Test Passed");
        }
        else
        {
        	System.out.println("Test Failed");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	    
	    
	    
	    
		

	}

}

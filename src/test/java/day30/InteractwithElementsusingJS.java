package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractwithElementsusingJS {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// open url
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor) driver;

		//Name ----input box
		WebElement Name = driver.findElement(By.id("name"));
		
		js.executeAsyncScript("arguments[0].setAttribute('value','shantanu')", Name);
		
		//male_rd ------- radio button 
		//WebElement male_rd = driver.findElement(By.id("male"));
        //js.executeScript("arguments[0].click();", male_rd);
		
        
       //male_rd ------- radio button 
        WebElement male_rd = driver.findElement(By.id("male"));
        male_rd.click();
      		
        //chrckbox -------click
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='tuesday']"));
        js.executeScript("arguments[0].click();",checkbox);
        		
        
        
        
        
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

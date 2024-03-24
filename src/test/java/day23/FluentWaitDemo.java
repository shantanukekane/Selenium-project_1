package day23;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		
		 // fluent wait declaration
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   
		 FluentWait mywait = new FluentWait(driver);
		 mywait.withTimeout(Duration.ofSeconds(30));
		 mywait.pollingEvery(Duration.ofSeconds(5));
		 mywait.ignoring(NoSuchElementException.class);
		 
		 
	     WebElement	username =(WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		 username.sendKeys("Admin");
		 
		 
		 
		 
		   

		   
		   
		  
		 
		
		 
		 
		 
		
		

	}

}

package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitwaitdemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		// Launch browser
		WebDriver driver = new ChromeDriver();
		
		// implicit wait declaration
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// open url or application 
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
	    // search the inbox button
		
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("MacBook");
		
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		
		
		
		
		
		
		

	}

}

package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_No_frame_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// open url or application
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
		// Switching to the inner frame
		driver.switchTo().frame("mce_0_ifr");
		
		driver.findElement(By.id("tinymce")).clear(); // using clear method we clear the text
		
		driver.findElement(By.id("tinymce")).sendKeys("Welcome to automation");  
		
		driver.findElement(By.id("tinymce")).sendKeys(Keys.CONTROL+"A");  // select the text
		// before going to the next frame we switch to the main page
	
		driver.switchTo().defaultContent();
	
		driver.findElement(By.xpath("//button[@title = 'Bold']")).click();
		
		driver.findElement(By.xpath("//button[@title='Align center']//span[@class='tox-icon tox-tbtn__icon-wrap']//*[name()='svg']")).click();
		
		
		
		
		
		
		
		
	}

}

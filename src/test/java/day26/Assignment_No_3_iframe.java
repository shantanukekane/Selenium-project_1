package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_No_3_iframe {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// open url
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
		//switching to the inner frame iframe
		driver.switchTo().frame("mce_0_ifr");
		
		driver.findElement(By.id("tinymce")).clear();  // clear the text by using clear method
		driver.findElement(By.id("tinymce")).sendKeys("Welcome to sajjanpur");
		
		driver.findElement(By.id("tinymce")).sendKeys(Keys.CONTROL+"A");  // select the text by using keys
		
		// Before going to the main page we use one command
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[@title='Bold']//span[@class='tox-icon tox-tbtn__icon-wrap']//*[name()='svg']")).click();
		
		driver.findElement(By.xpath("//button[@title='Italic']//span[@class='tox-icon tox-tbtn__icon-wrap']//*[name()='svg']")).click();
		
		
		
		
		
		

	}

}

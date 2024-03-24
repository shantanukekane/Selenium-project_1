package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest_2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		//WebDriverManager.chromedriver().setup();
		//create an object for the Web browser
		
		// Launch Browser
		 WebDriver driver = new ChromeDriver();
		
		 // Open URL or application 
		 
		 driver.get("https://secure1.inmotionhosting.com/index/login");
		 //driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		 // provide username 
		 
		 //driver.findElement(By.name("username")).sendKeys("Admin");
		 
		 
		 // provide password
		 //driver.findElement(By.id("password")).sendKeys("admin123");
		 
		 // linkText
		 
		 driver.findElement(By.linkText("InMotion Hosting Logo")).click();
		 
		 
		 
		 
		 
		 
		 
		//
		
		
		

	}

}

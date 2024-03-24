package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigatingcommands {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		
		// open Url
	
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		// declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// searching elements and sending some values in the input boxes
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		// submit button
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		// perform some navigating commands
		/*
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		System.out.println(driver.getCurrentUrl());
		
		
		*/
		
		
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());   // it returns login page
		
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());  // it returns the dashboard page
		
		driver.navigate().refresh();
		

	}

}

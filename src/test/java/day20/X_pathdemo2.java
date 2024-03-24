package day20;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_pathdemo2 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		// Launch Browser
		
		WebDriver driver = new ChromeDriver();
		
		// Open URL or Application
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		// to capture the macbook text
	String productname = driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).getText();
	System.out.println(productname);	
		
		
		
		
		
		
		
	}

}

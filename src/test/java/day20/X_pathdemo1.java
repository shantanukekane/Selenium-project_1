package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_pathdemo1 {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		// first we have to create an object for the browser
		// Launch Browser
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    
	    // Open URL or Application
	    
	    driver.get("https://demo.opencart.com/");
	    
	    
	    // search text box
	    
	    //driver.findElement(By.xpath("//input[@class='form-control form-control-lg']")).sendKeys("MacBook");
	    
	    // get the text = MacBook using x-path
	    
	   String productname = driver.findElement(By.xpath("//a[text()='MacBook']")).getText();
	   //String productname = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/h4[1]/a[1]")).getText();
	   System.out.println(productname);	
		
		
		
		
		

	}

}

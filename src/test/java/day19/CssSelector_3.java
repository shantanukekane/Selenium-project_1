package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector_3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		// launch the browser
		WebDriver driver  = new ChromeDriver();
		
		// Open URL or applications
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// search elements using CSS selector and categorised by 
		// search input element and enter some value using
		// 1) tag and ID
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
		
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");
		
		// tag and class
		
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("I-phone");
		
		// css selector without tag 
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("I-phone");
	
		
		// css selector with tag and attributes
		
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Galaxy S22");
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Nokia lumia");
		
		// css selector with separator and attributes only
		//driver.findElement(By.cssSelector("[name='q']")).sendKeys("samsung");  
		
		// css selector with class and attributes
		
		
		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("MacBook");
		

		
		
		
	}

}

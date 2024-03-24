package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelectorsdemo {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();	
		
		// Launch Browsers
		WebDriver driver = new ChromeDriver();
		
		//Open URL or application
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		// search inbox of CSS with tag,ID
	    //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MackBook");
		
		// CSS with #withID
	    //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MackBook");
		
		
		// CSS with tag,class
		
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MackBook");
		
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MackBook");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("MackBook");
		
		// CSS with tag & attributes
		
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("MackBook");
		   // or //
		
		//driver.findElement(By.cssSelector("input[aria-label ='Search store']")).sendKeys("MackBook");
		
		// CSS with attributes
		driver.findElement(By.cssSelector("[autocomplete='off']")).sendKeys("MackBook");
		
		
		

	}

}

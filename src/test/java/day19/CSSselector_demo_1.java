package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSselector_demo_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		// Launch Browsers
		
		WebDriver driver = new ChromeDriver();
		
		// Open URL or Applications
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// CSS selector with Tag and ID
        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MackBook");
  
		
		// CSS selector without Tag , here we used only ID
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MackBook");
		
		
		// CSS selector with Tag and class
		
		//driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("MackBook");
		
		
		// CSS selector without tag, here We only use class
		
		//driver.findElement(By.cssSelector(".search-box-text ")).sendKeys("MackBook");
		
		
		// CSS selector with Tag and Attributes
		
        //driver.findElement(By.cssSelector("input[name='q']")).sendKeys("MackBook");
        //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("MackBook");
        
        //driver.findElement(By.cssSelector("input[type='text']")).sendKeys("MackBook");
        
        // css selector with Tag,class and Attributes
        
        //driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("MackBook");
        
        // css selector with class & attributes
		
        //driver.findElement(By.cssSelector(".search-box-text[placeholder='Search store']")).sendKeys("MackBook");
        
        //driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("MackBook");
      
		
		//driver.findElement(By.cssSelector(".search-box-text[aria-label='Search store']")).sendKeys("Mobile");
	
		
		driver.findElement(By.cssSelector(".search-box-text[aria-label='Search store']")).sendKeys("Mobile");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

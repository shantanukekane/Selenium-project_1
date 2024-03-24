package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommand_1 {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		// Launch Broswer
		
		WebDriver driver = new ChromeDriver();
		
		// Open Url or application
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		// validate the logo
	    //WebElement logo =	driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("Display status of logo: "+logo.isDisplayed());
		
		//boolean logostatus = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println("Display status of logo: "+logostatus);
		
		
		// validate the search inbox element on web page using isDisplayed method and isEnabled method
        //WebElement searchbox =	driver.findElement(By.xpath("//input[@id = 'small-searchterms']"));
		//System.out.println("Display the search box: "+searchbox.isDisplayed());
		//System.out.println("Enable status of search box: "+searchbox.isEnabled());
		
		
        //Boolean searchbox = driver.findElement(By.xpath("//input[@id = 'small-searchterms']")).isDisplayed();
		//System.out.println("Display the search box: "+searchbox);
		
		
		
		// isSelected method
		// locating the radio button element 
	    WebElement male_rd = driver.findElement(By.xpath("//input[@id = 'gender-male']"));
        WebElement female_rd =  driver.findElement(By.xpath("//input[@id = 'gender-female']"));		
		// Before selection of radio button
        System.out.println("Before selection of radio button.........");
        System.out.println(male_rd.isSelected());  // false
        System.out.println(female_rd.isSelected());  // false
        
        
		// after selection of male radio button 
        System.out.println("after selection of male radio button.........");
        male_rd.click();
        System.out.println(male_rd.isSelected());  // true
        System.out.println(female_rd.isSelected()); // false
        
		// after selection of female radio button
        System.out.println("after selection of female radio button........");
        female_rd.click();
        System.out.println(male_rd.isSelected());  // false 
        System.out.println(female_rd.isSelected()); // true
        
        
        
        
        
		
		
		
		// close browser
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

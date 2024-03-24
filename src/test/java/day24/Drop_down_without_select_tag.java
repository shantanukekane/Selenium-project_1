package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_down_without_select_tag {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// open URL or application
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		driver.manage().window().maximize();
		
		// Locating the Drop down Element in web 
		
		driver.findElement(By.xpath("//div[contains(@class,'information')]/following::p/select"));
		
		//Total Number of Drop down element or countries in the web page
		
	    List<WebElement> Dd_countries  = driver.findElements(By.xpath("//div[contains(@class,'information')]/following::*/option"));
		System.out.println("Total Number of Drop down Element: "+Dd_countries.size());
		
		// print all the Drop down in console window
		/*
		for(int i = 0;i<Dd_countries.size();i++)
		{
			
		    System.out.println(Dd_countries.get(i).getText());
			
		}
		
		*/
	
		/*
	     for(int i = 0;i<Dd_countries.size();i++)
	     {
	    	 String Drop_down_crt = Dd_countries.get(i).getText();
	    	 if(Drop_down_crt.equals("Mauritius"))
	    	 {
	    		 Dd_countries.get(i).click();
	    	 }
	    	 
	     }
	     
	     */
	    
		// using Enhance loop or each for loop
	     
	     for(WebElement Drop_down:Dd_countries)
	     {
	    	 if(Drop_down.getText().equals("Mongolia"))
	    	 {
	    		 Drop_down.click();
	    	 }
	     }
	     
	     
	     
		
		
		
		
		
		
		
	 
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

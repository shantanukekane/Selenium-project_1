package day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDatePicker_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		// Declaration of implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open Url or application
		driver.get("https://jqueryui.com/datepicker/"); 
		driver.manage().window().maximize();
		
		// first we switch to the inner frame
		driver.switchTo().frame(0);
		
		// Approach 1
		
		//driver.findElement(By.xpath("//input[@id = 'datepicker']")).sendKeys("05/12/2024");  //mmddyyyy 
		
		// Approach 2
		// Create a string variable for month,year
		
		String month = "December";
	    String year = "2024";
	    String date = "31";
	   
		driver.findElement(By.xpath("//input[@id = 'datepicker']")).click();
		
		// select month and year
	
		
		while(true)
		{
			
		    String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month) && yr.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-circle-triangle-e']")).click();   // future date 
			
			
		}
	

		// select date 
		
		// first we have capture all dates in a variable like webelement
		
	    List<WebElement> alldates =	driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']//tbody/tr/td"));
		
		// We are using enhance for loop to pick the date
	    
	    for(WebElement dt:alldates)
	    {
	    	
	    	if(dt.getText().equals(date))   // first we have to put getText method and then equals to date 
	    	{	                            // because dt is the WebElement so we get the text from the date element
	    	
	    		dt.click();
	    		break;
	    		
	    	}
	    	
	    }
	    
	    /*
	    // same logic we have to do with for loop
	    
	    for(int d = 1;d<=alldates.size();d++)
	    {
	    	String dt = alldates.get(d).getText();
	    	
	    	if(dt.equals(date))
	    	{
	    		alldates.get(d).click();
	    		break;
	    	}
	    	
	    	
	    }
	    */
	    
	    
	    
	    
	  
	    
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

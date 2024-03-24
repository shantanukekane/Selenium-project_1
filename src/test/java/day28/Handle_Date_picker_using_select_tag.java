package day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Date_picker_using_select_tag {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open url
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		
		// find the DOB element
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		
		// Find the Drop down month element in the  Web date picker
		
	    WebElement drop_down_month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		
	    // create a select class for the select tag object element
	    
	    Select dd_month = new Select(drop_down_month);
	    	
	    // Select one of the  drop down month options 
	    
	    dd_month.selectByVisibleText("Dec");
	    
	    
	    // Find the drop down Year element in the datepicker
	    
	    WebElement drop_down_yr =   driver.findElement(By.xpath("//select[@aria-label='Select year']"));
	    
	    
	    // create a select class for the select tag object element
	    
	    Select dd_year = new Select(drop_down_yr);
	    
	    // Select  one of the drop down year options
	    
	    dd_year.selectByVisibleText("2023");
	    
	    
	    // Select data
	    
        List<WebElement> all_dates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']//tbody//td"));
	    
        for(WebElement dt:all_dates)
        {
        	if(dt.getText().equals("20"))
        	{
        		dt.click();
        		break;
        	}
        		
        			
        }
	    
	    
	    
		
		
		
		
		

	}

}

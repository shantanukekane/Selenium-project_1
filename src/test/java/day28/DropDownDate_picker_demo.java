package day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDate_picker_demo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		//Declaration Implicit wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		// Open Url or application
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		
		// Find the DOB element
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		// Find the drop down month Element 
		
	    WebElement drop_down_month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		
		// create select class for the select drop down element
	    
	    Select dd_month = new Select(drop_down_month);
	    
	    // select the option from the drop down
	    
	    dd_month.selectByVisibleText("Sep");
	    
	    
	    
	    // findout the drop down Year element
	    
	    WebElement  drop_down_year = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
	    
	    // Create an object for the select tag using select tag
	    
	    Select dd_year = new Select(drop_down_year);
	    
	    // Select the drop down year option 
	    
	    dd_year.selectByVisibleText("2021");
	    
	    
	    
	    // select date
	    
	    
	    List<WebElement> all_dates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']//tbody//td"));
	    
	    // select the date from the all dates
	    
	    for(WebElement date:all_dates)
	    {
	    	if(date.getText().equals("15"))
	    	{
	    		date.click();
	    		break;
	    	}
	    
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}

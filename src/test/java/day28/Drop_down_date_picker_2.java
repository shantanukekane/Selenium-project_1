package day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_down_date_picker_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open url
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
	    // Find the input box of the datepicker
		
		driver.findElement(By.xpath("//input[@id='datepicker2'][@class='form-control is-datepick']")).click();
		
		
		// Find the drop down month option in the Date picker
	    WebElement drop_down_month = driver.findElement(By.xpath("//div[@class = 'datepick-month-header']/select[@title = 'Change the month']"));
		
		// create a select class for the select tag object
	    
	    Select dd_month = new Select(drop_down_month);
	    
	    // select the one of the drop down month 
	    
	    dd_month.selectByVisibleText("September");
	    
	    
	    
	    // Find out the drop down year element in the datepicker
	    
	    WebElement drop_down_year = driver.findElement(By.xpath("//select[@title='Change the year']"));
	    
	    // create a select class for the select tag objects
	    
	    Select dd_year = new Select(drop_down_year);
	    
	    // select out the one of the drop down year
	    
	    dd_year.selectByVisibleText("2019");
	    
	    // select dates
	    
	    
	    List<WebElement> all_dates = driver.findElements(By.xpath("//div[@class = 'datepick-month-header']/following::table//tbody//tr//td"));
	    
	    // Select one of the date from the all dates option
	    
	    for(WebElement dates:all_dates)
	    {
	    	
	    	if(dates.getText().equals("20"))
	    	{
	    		dates.click();
	    		break;
	    	}
	    
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		

	}

}

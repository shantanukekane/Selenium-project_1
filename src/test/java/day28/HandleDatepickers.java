package day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDatepickers {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open Url or application
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		// Approach 1 
		//driver.findElement(By.xpath("//input[@id='datepicker2'][@class='form-control is-datepick']")).sendKeys("12/12/2025");   // mmddyyy	
		//driver.findElement(By.xpath("//a[@title = 'Clear all the dates'][text() = 'Clear']")).click();
		

		// Approach 2
		// Create an String variable such as month,date,year,
		
		String month = "March";
		String year = "2025";
		String date = "15";
	
		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
		
		while(true)
		{
			// find the total number of months
		      List<WebElement> month_options = driver.findElements(By.xpath("//select[@title = 'Change the month']/option"));
			
			for(WebElement mon:month_options)
			{
				
				if(mon.getText().equals(month))
				{
					mon.click();
					break;
				}
				
			}
			
			// Find the Total Number of years 
		    List<WebElement> years_options = driver.findElements(By.xpath("//select[@title = 'Change the year']/option"));
			
		     
		     for(WebElement yrs:years_options)
		     {
		    	 if(yrs.getText().equals(year))
		    	 {
		    		 yrs.click();
		    		 break;
		    	 }
		    	 
		     }
		     
		     break;
		 
		}
		
		
		// select dates
		
		List<WebElement> all_dates = driver.findElements(By.xpath("//div[@class = 'datepick-month-header']/following::table//tbody//td"));
		
		for(WebElement dt:all_dates)
		{
			
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
			
		}
		

	}

}

package day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlleDatePicker_3 {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open URL or applications
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		
		// Approach 1
		//driver.findElement(By.xpath("//input[@class='form-control is-datepick'][@id='datepicker2']")).sendKeys("06/25/2024"); // mm/dd/yyyy
		
		
		// create some string variable and Locating the datepicker element
		String date = "30";
		String month = "November";
		String Year = "2024";
	
		driver.findElement(By.xpath("//input[@class='form-control is-datepick'][@id='datepicker2']")).click();
		
	   
		while(true)
		{
		    List<WebElement> month_options = driver.findElements(By.xpath("//div[@class  = 'datepick-month-header']/child::select[1]/option"));        
            

			for(WebElement option:month_options)
			{
			      String text =	option.getText();
			      if(text.equals(month))
			      {
			    	  option.click();
			    	  break;
			      }
			}
		    
		    
		    List<WebElement> years_options = driver.findElements(By.xpath("//div[@class = 'datepick-month-header']/select[2]/option"));

			
		    for(WebElement options:years_options)
			{
			     String year_text =options.getText();
			     if(year_text.equals(Year))
			     {
			    	 options.click();
			    	 break;
			     }
			}
			break;
			
		}
		

		List<WebElement> all_dates =driver.findElements(By.xpath("//div[@class='datepick-month-header']/following::table/tbody//td"));
		
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

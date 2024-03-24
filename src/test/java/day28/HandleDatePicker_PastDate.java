package day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDatePicker_PastDate {

	public static void main(String[] args) {
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open URL or applications
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		// Switch to the inner frame by using the index
		driver.switchTo().frame(0);
		
		// Aprroach 1
		//driver.findElement(By.xpath("//input[@type = 'text'][@class='hasDatepicker']")).sendKeys("06/28/2024");
		
		
		// Approach 2
		// create some string variable such as date,month,year
		

		String month = "May";
		String Year = "2000";
		String date = "15";
		
		driver.findElement(By.xpath("//input[@id = 'datepicker']")).click();
		
		// select the Month & Year
		
		while(true)
		{
			String mon = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();
		    String yr = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();
			
		    if(mon.equals(month) && yr.equals(Year))
		    {
		    	break;
		    }
		    
		    // select to back dated dates, we can directly jump to the past date value using previous back button
		    
		    driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-circle-triangle-w']")).click();   // past date
			
		}
		
		// select date
		 List<WebElement>  all_dates =   driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']//tbody//tr//td"));
		//table[@class = 'ui-datepicker-calendar']//tbody//tr//td
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

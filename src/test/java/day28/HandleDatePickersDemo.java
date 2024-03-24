package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDatePickersDemo {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Open url 
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		// Before going to the iframe we have to switch to iframe from frame
		driver.switchTo().frame(0);
		// Approach 1;
		//driver.findElement(By.xpath("//input[@id = 'datepicker']")).sendKeys("05/22/2024");   // mm/dd//yyyy

		//approach 2
		//create string variable for date,,month.year
		String date = "29";
		String month = "June";
		String year = "2024";
		
		driver.findElement(By.xpath("//input[@id = 'datepicker']")).click();   // mm/dd//yyyy
		
		
		while(true)
		{
			
		  String mon = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();
		  String yr = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();	 
		  
		  if(mon.equals(month)  && yr.equals(year))
		  {
			  break;
		  }
		  
		  // If Both the condition failes then again click on below element
		  driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-circle-triangle-e']")).click();
		  
			
		}
		
		
		
		
		

	}

}

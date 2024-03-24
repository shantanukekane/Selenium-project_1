package day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlePastDates_demo {

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
		String date = "31";
		String month = "December";
		String Year = "2027";
	
		driver.findElement(By.xpath("//input[@class='form-control is-datepick'][@id='datepicker2']")).click();
		
	    
	    
	    //Finding the Drop down Element in the Web page
	    WebElement mon = driver.findElement(By.xpath("//div[@class  = 'datepick-month-header']/child::select[1]"));
	    	
	    // Total Number of Options in the Drop Down
	         
	    List<WebElement> month_options = driver.findElements(By.xpath("//div[@class  = 'datepick-month-header']/child::select[1]/option"));        
	   // System.out.println("Total Number of Months: "+month_options.size());
	    
		for(WebElement option:month_options)
		{
		      String text =	option.getText();
		      if(text.equals(month))
		      {
		    	  option.click();
		    	  break;
		      }
		}
		
	    // Finding the Drop Down Element in th Web page

	    WebElement yr = driver.findElement(By.xpath("//div[@class = 'datepick-month-header']/select[2]"));

	    // Total Number of years options in the drop down

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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
	    while(true)
	    {
	         // MONTH //
		    //Finding the Drop down Element in the Web page
		     WebElement mon = driver.findElement(By.xpath("//div[@class  = 'datepick-month-header']/child::select[1]"));
		     mon.getText();
		     mon.click(); 	
		    // Total Number of Options in the Drop Down
		         
		    List<WebElement> month_options = driver.findElements(By.xpath("//div[@class  = 'datepick-month-header']/child::select[1]/option"));     
		    month_options.size();
		    
		    // YEAR //
		    
		    // Finding the Drop Down Element in th Web page
		    WebElement yr = driver.findElement(By.xpath("//div[@class = 'datepick-month-header']/select[2]"));
		    yr.getText();
		    yr.click();
		
		    
		    
		    // Total Number of years options in the drop down
		    List<WebElement> years_options = driver.findElements(By.xpath("//div[@class = 'datepick-month-header']/select[2]/option"));
		    years_options.size();
		    
	    	if(month.equals(month_options) && Year.equals(years_options))
	    	{
	    		break;
	    	}
	    	
	    	driver.findElement(By.xpath("//a[@class='datepick-cmd datepick-cmd-next ']")).click();
	    	
	    	
	    }
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

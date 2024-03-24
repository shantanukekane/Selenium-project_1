package assignment_end_to_end_test_script;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy_ticket_com_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		// Declaration of implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open URL or application
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
	
		// Start End to End testing 
		
	   
		driver.findElement(By.id("product_550")).click();
		driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Shantanu");
		driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("Kekane");
		driver.findElement(By.xpath("//textarea[@id='order_comments']")).sendKeys("Order the Product as soon as possible");
		
		// finding the DOB datepicker Element
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		
		// select month & year
		// Finding the Number of month options
	    List<WebElement> birthmonth = driver.findElements(By.xpath("//select[@aria-label='Select month']/option"));
		//System.out.println("Total Number of months: "+birthmonth.size());
		
		// using Enhance loop we select one of the month option
	
	
		for(WebElement month:birthmonth)
		{
			if(month.getText().equals("Sep"))
			{
				month.click();
				break;
			}
				
					
		}
		
		// Find the Total Number of Year options 
		
	    List<WebElement> all_years = driver.findElements(By.xpath("//select[@aria-label='Select year']/option"));
		System.out.println("Total Number of years: "+all_years.size());
		
		// Using the Enhance loop
		
		for(WebElement years:all_years)
		{
			if(years.getText().equals("1993"))
			{
				years.click();
				break;
			}
			
		}
	    
	 	
	
		// Select date 
		
		List<WebElement> all_dates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		
		
		for(WebElement date:all_dates)
		{
			
			if(date.getText().equals("12"))
			{
				date.click();
				break;
			}
			
			
		}
		
		
		
		// To select the gender radio button 
		driver.findElement(By.xpath("//input[@id='sex_1']")).click();
		
		
		// trip type
		driver.findElement(By.xpath("//input[@id='traveltype_2']")).click();   // trip type
		
		//from city origin
		driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Nashik");
		
		//to city /destination
		driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Bangalore");
		
		// departure date
		// datepicker
	    driver.findElement(By.xpath("//input[@id='departon']")).click();
		
	    //Finding the total departure date months in the options
	    
	    List<WebElement> depart_month =  driver.findElements(By.xpath("//select[@aria-label='Select month']/option"));
		System.out.println("Total Number of departure month: "+depart_month.size());
		
		for(WebElement d_month:depart_month)
		{
			
			if(d_month.getText().equals("May"))
			{
				d_month.click();
				break;
			}
			
		}
		
		// Find the total years in the departure date
		
	   	List<WebElement> depart_year = driver.findElements(By.xpath("//select[@aria-label='Select year']/option"));
		System.out.println("Total number of depart year: "+depart_year.size());
		
		for(WebElement d_year:depart_year)
		{
			if(d_year.getText().equals("2025"))
			{
				d_year.click();
				break;
			}
		}
		
		
		// select date
		
	    List<WebElement> depart_dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td"));
		
	    for(WebElement d_dates:depart_dates)
	    {
	    	
	    	if(d_dates.getText().equals("25"))
	    	{
	    		d_dates.click();
	    		break;
	    	}
	    	
	    	
	    }
	    
	    // return date 
	    
	    driver.findElement(By.xpath("//input[@id='returndate']")).click();
	   
	    
	    List<WebElement> return_month =  driver.findElements(By.xpath("//select[@aria-label='Select month']/option"));
		System.out.println("Total Number of departure month: "+return_month.size());
		
		for(WebElement r_month:return_month)
		{
			
			if(r_month.getText().equals("May"))
			{
				r_month.click();
				break;
			}
			
		}
	    
	   
	    
	    List<WebElement> return_year = driver.findElements(By.xpath("//select[@aria-label='Select year']/option"));
		System.out.println("Total number of depart year: "+depart_year.size());
		
		for(WebElement r_year:return_year)
		{
			if(r_year.getText().equals("2025"))
			{
				r_year.click();
				break;
			}
		}
		
		
		// select date
		
	    List<WebElement> return_dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td"));
		
	    for(WebElement r_dates:return_dates)
	    {
	    	
	    	if(r_dates.getText().equals("27"))
	    	{
	    		r_dates.click();
	    		break;
	    	}
	    	
	    	
	    }
	    
	    
	    //addition option
	    driver.findElement(By.xpath("//textarea[@id='notes']")).sendKeys("testing");
	    
	    
	    // delivery options
	    
	    driver.findElement(By.xpath("//span[@id='select2-reasondummy-container']")).click();
	    driver.findElement(By.xpath("//input[@id='appoinmentdate']")).sendKeys("Visa extension"+Keys.ENTER);
	    
	    
	  
	    
		// Where you will receive the tickets 
	    
	     driver.findElement(By.xpath("//input[@id='deliverymethod_3']")).click();
	     
		// Billing address
	     
	     driver.findElement(By.xpath("//input[@id='billname']")).sendKeys("Arogyam Foods & Generals");
		
		//contact details
	     
	     driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("8257548659");
		
		// email address
	     
	     driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("shantanu12kekane@gmail.com");
	     
	    //country
	     
	     driver.findElement(By.xpath("//span[@id='select2-billing_country-container']")).click();
	     
	     // Find total Number of country in the billing country element
	     
	 	List<WebElement> all_countries =  driver.findElements(By.xpath("//span[@class = 'woocommerce-input-wrapper']//option"));
		System.out.println("Total Number of Billing Country: "+all_countries.size());
		
		for(WebElement country:all_countries)
		{
			if(country.getText().equals("Indonesia"))
			{
				country.click();
				break;
			
			}
		}
		
		// Street address
		
		driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("Plot No 13 digambar Nagar");
		driver.findElement(By.xpath("//input[@id='billing_address_2']")).sendKeys("Amrutdham panchavati");
		
		// zonal code
		driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("422003");
		
		// Town city
		driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Nashik");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package assignment_end_to_end_test_script;


import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Blazedemo_com {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(); 
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open URL or application
		
		driver.get("https://blazedemo.com/");
	    driver.manage().window().maximize();
	    
	    // Find the of  departure Drop down Element 
	    WebElement  departure_city =  driver.findElement(By.xpath("//form[@action = 'reserve.php']/select[1]"));
	    
		
	    // create an object for the select tag using select class

	    Select D_city = new Select(departure_city);
	    		
		// select one of the option from the drop down 
	    
	    D_city.selectByVisibleText("Boston");
		
		
		// Find out the destination drop down Element 
		
	   WebElement Destination_city = driver.findElement(By.xpath("//form[@action = 'reserve.php']/select[2]"));
		
	   
	   // create a select class for the select tag object Elements
	   
	   Select Destine_city = new Select(Destination_city);
	   
	   // Select one of the destination city from the drop down
	   
	   Destine_city.selectByVisibleText("London");
	   
	   // Find the flights by using click button 
	   
	   driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	   
	   
	   // Find out the price of the tickets according to the minimum price 
	   
	   int rows = driver.findElements(By.xpath("//table[@class = 'table']//tr//td[6]")).size();
	   System.out.println("Total Number of rows: "+rows);   // 5 rows 
	   
	   // capture prices and store in array
	   
	   String priceArr[] = new String [rows];  // 0 to 4 ( String start from 0)
	   
	   for(int r = 1;r<=rows;r++)
	   {
		   String ticket_price = driver.findElement(By.xpath("//table[@class = 'table']//tr["+r+"]//td[6]")).getText();
		   priceArr[r-1] = ticket_price;   // adding price into array
		   
	   }
	   
	   // sort prices then find lower price value
	   
	   for(String Arrayvalue:priceArr)
	   {
		   System.out.println(Arrayvalue);
	   }
	   
	   Arrays.sort(priceArr);
	   
	    String lowest_value = priceArr[0];
	    System.out.println("Smallest value of ticket price: "+lowest_value);
	    
	   //Find record in table having lower price
	    
	    for(int r = 1;r<=rows;r++)
	    {
			   String ticket_price = driver.findElement(By.xpath("//table[@class = 'table']//tr["+r+"]//td[6]")).getText();

			   if(ticket_price.equals(lowest_value))
			   {
				   driver.findElement(By.xpath("//table[@class = 'table']//tr["+r+"]//td[1]")).click();
				   break;
			   }
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   
	   
	   
		
	   
	   
	   
	   
	
	   
		
	   
		
		
		
		
		
		

	}

}

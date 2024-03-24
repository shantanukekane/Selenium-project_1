package assignment_end_to_end_test_script;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Blazedemo_com_2 {


	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(); 
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open URL or application
		
		driver.get("https://blazedemo.com/");
	    driver.manage().window().maximize();
		
		//1) Find the departure city drop down in the Web page
	    
	    WebElement departure_city = driver.findElement(By.xpath("//form[@action = 'reserve.php']/select[1]"));
	    
	    
	    // create a select class for the select tag objects
	    
	    Select depart_city = new Select(departure_city);
	    
	    // Select one of the option from the departure city
	    
	    depart_city.selectByVisibleText("Boston");
	    
	    
	    // 2) find the destination city Element in the web page
	    
	    WebElement destination_city = driver.findElement(By.xpath("//form[@action = 'reserve.php']/select[2]"));
	   
	    
	    // create select class for the select tag object 
	    
	    Select destine_city = new Select(destination_city);
	    
	    
	    // Select one of the destination city from the options
	    
	    destine_city.selectByVisibleText("London");
	    
	    
	    //3) Find the find flight check button and click on
	    
	    driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	    
	    
	    
	    // 4) Find the Total Number of rows in the tables
	    
	    int rows =  driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
	    System.out.println("Total Number of rows: "+rows);
	    
	    
	    // 5) capture prices in the array
	    // create a string array variable 
	    String arrayprice[] = new String[rows];   //  0 to 4
	    
	    for(int r = 1;r<=rows;r++)
	    {
	    	String price =driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[6]")).getText();
	        arrayprice[r-1] = price;   // adding price to the  string array
	    }
	    
	    // 6) sort price and Find the minimum price of the flight ticket and print the all the prices in ascending order
	    
	    Arrays.sort(arrayprice);
	    
	    for(String Arrvalue:arrayprice)
	    {
	    	System.out.println(Arrvalue);
	    }
	    
	    

	    String lowestprice = arrayprice[0];
	    
	    // removing the doller
	    //String price1 =  lowestprice.replace("$", "");
	    
	    
	    System.out.println("Lowest price is: "+lowestprice);
	    
	    // 7) To find the flight in the table having lower price
	    
	    for(int r = 1;r<=rows;r++)
	    {
	    	String price = driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[6]")).getText();
	    	if(price.equals(lowestprice))
	    	{
		    	driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[1]")).click();
		    	break;
                
	    	}
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}

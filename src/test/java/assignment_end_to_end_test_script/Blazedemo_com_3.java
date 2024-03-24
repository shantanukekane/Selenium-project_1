package assignment_end_to_end_test_script;



import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Blazedemo_com_3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open url or application
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
	
		
		// 1) Find the departure city Element in the web page
		
	    WebElement departure_city =	driver.findElement(By.xpath("//select[@name='fromPort']"));
		
		// Create a select class for the select tag objects
	    
	    Select depart_city = new Select(departure_city);
		
		// Select one of the city from the departure city options
	    
	    depart_city.selectByVisibleText("Portland");
		
		// 2) Find the destination city Element in the Web page
	    
	    WebElement Destination_city = driver.findElement(By.xpath("//select[@name='toPort']"));    
	    
		// Create a select class for the select tag objects 
	    
	    Select destine_city = new Select(Destination_city);
	    
	    // Select the one of the city from the destination city
	    
	    destine_city.selectByVisibleText("London");
	    
	    
	    // 3) Find the find flight button and click on
	    
	    driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	    
	    
	    // 4) Find the Total Number of rows in the table
	    
	   int rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
	    System.out.println("Total Number of rows: "+rows);
	    
	    // 5) create an array variable to store the string variable price
	    
	       String arrayprice[] = new String[rows];    // 0 to 4
	     
	     
	     for(int r = 1;r<=rows;r++)
	     {
	    	 String price = driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[6]")).getText();
	         arrayprice[r-1] = price;  // adding price to the array,[r-1] = string start from 0 and
                                                                  //  we initialize from 1 that way [r-1]
	     
	     }
	    
	    // 6) sorting the array and find the highest price from it and print the array in the form of string
	     
	     Arrays.sort(arrayprice);
	     
	     for(String arrayvalue:arrayprice)
	     {
	    	 System.out.println(arrayvalue);
	     }
	    
	     String Highest_price = arrayprice[4];
	     
	     System.out.println("Highest price is : "+Highest_price);
	     
	     // 7) select the flight with highest price ticket
	     
	     for(int r = 1;r<=rows;r++)
	     {
	    	 String price = driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[6]")).getText();

	    	 if(price.equals(Highest_price))
	    	 {
	    		 driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[1]")).click();
	    		 break;
	    	 }
	    	 
	    	 
	    	 
	     }
	     
	     // 8) Find the input Box Name & send some data
	     
	 WebElement Name = driver.findElement(By.xpath("//input[@id='inputName']"));
	 Name.clear();
	 Name.sendKeys("Shantanu Kekane");

	 WebElement Address = driver.findElement(By.xpath("//input[@id='address']"));
	 Address.clear();
	 Address.sendKeys("Plot No 13 Digambar Nagar Amrutdham Panchavati Nashik");
	     
	    
	 WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
	 city.clear();
	 city.sendKeys("Nashik");
	    
	    
	 WebElement state = driver.findElement(By.xpath("//input[@id='state']"));
	 state.clear();
	 state.sendKeys("Maharashtra");
		
	 WebElement pincode = driver.findElement(By.xpath("//input[@id='zipCode']"));
	 pincode.clear();
	 pincode.sendKeys("123456");
	 
	 
	 // 9) Drop down card type
	 
	 WebElement card_type =  driver.findElement(By.xpath("//select[@id='cardType']"));
	 
	 // create a select class and select tag of the object
	
	 Select creditcard_type = new Select(card_type);
			 
	 // Select the one of the options from the card type
	 
	 creditcard_type.selectByVisibleText("American Express");
	 
	 // 10) Find the credit card number inbox Element
	 
	 driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("123456789");
	
	 WebElement card_month = driver.findElement(By.xpath("//input[@id='creditCardMonth']"));
	 card_month.clear();
	 card_month.sendKeys("11");
	 
	 WebElement card_year = driver.findElement(By.xpath("//input[@id='creditCardYear']"));
	 card_year.clear();
	 card_year.sendKeys("2020");
	 
	 
	 driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("shashikant kadam");
	 
	 //11) click on remember and purchase flight
	 
	 driver.findElement(By.xpath("//div[@class = 'controls']/label/input")).click();
	 
	 WebElement purchase_button = driver.findElement(By.xpath("//input[@value='Purchase Flight']"));
	 purchase_button.click();
	 
	 // 12) validations
	 
	 String msg = driver.findElement(By.xpath("//h1")).getText();
	 System.out.println(msg);
	 
	 if(msg.contains("Thank you for your purchase"))
	 {
		 System.out.println("Successfully login");
	 }
	 else
	 {
		 System.out.println("Login failed");
	 }
		 
			 
	 
	 
	 
	 
	 

	}

}

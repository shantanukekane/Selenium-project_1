package assignment_end_to_end_test_script;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy_ticket_com_2 {

	
	      static void Selectdate(WebDriver driver, WebElement Datepicker,String month, String year,String date)
	      {
	    	  
	    	  Datepicker.click();
	    	 
	    	  Select drp = new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
	    	  drp.selectByVisibleText(month);
	    	
	    	  drp = new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
	    	  drp.selectByVisibleText(year);
	    			
	    	  // select date
	    	  
	    	List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
	    	  
	    	  for(WebElement dt:dates)
	    	  {
	    		  if(dt.getText().equals(date))
	    		  {
	    			  dt.click();
	    			  break;
	    		  }
	    	  }
	    	  
	      }
	      
	      //Main code
	
	public static void main(String[] args) {
		
       WebDriverManager.chromedriver().setup();
       
       WebDriver driver = new ChromeDriver();
       
       // declaration of implicit wait
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       // Open url
       
       driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
       driver.manage().window().maximize();
       
       // 1)
	   driver.findElement(By.xpath("//input[@id='product_551']")).click();
		
	   // 2) 
	   driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Shantanu");
		
	   // 3)
	   driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("kekane");
		
	   // 4)
	   driver.findElement(By.xpath("//textarea[@id='order_comments']")).sendKeys("Testing");
		
		
	   // 5)DOB
	  // WebElement dobdatedatepicker = driver.findElement(By.xpath("//input[@id='dob']"));
	  //Selectdate(driver, dobdatedatepicker,"30","Jun","2025");  // using selectdate method
	   
	   // DOB
	  WebElement dobdatedatepickers = driver.findElement(By.xpath("//input[@id='dob']"));
	  Selectdate(driver,dobdatedatepickers,"Sep","1993","12");   // month /year/ date
	   
	  //6)
	  driver.findElement(By.xpath("//input[@id='sex_1']")).click();
	  
	  //7) 
	  driver.findElement(By.xpath("//input[@id='traveltype_2']")).click();
	   
	  //8)
	  driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Nashik");
	  
	  //9)
	  driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Bangalore");
	  
	  //10)
	  WebElement departdatepicker = driver.findElement(By.xpath("//input[@id='departon']"));
	  Selectdate(driver,departdatepicker,"Mar","2024","25");  // month/year/date
	   
	  // 10) A
	  WebElement returndatedatepicker =  driver.findElement(By.xpath("//input[@id = 'returndate']"));
	  Selectdate(driver,returndatedatepicker,"Mar","2024","27");
	  
	  
	  //11)
	  driver.findElement(By.xpath("//textarea[@id='notes']")).sendKeys("Testing");
	  
	  driver.findElement(By.xpath("//span[@id='select2-reasondummy-container']")).click();
	  driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Visa extension"+Keys.ENTER);
	    
	  
	  	  
	   
	  //12)submission date
	 // WebElement subdatedatepicker =  driver.findElement(By.xpath("//input[@id='appoinmentdate']"));
	  //Selectdate(driver,subdatedatepicker,"Jul","2025","30");   // month/year/date
	  

	  //12 A
	  driver.findElement(By.id("deliverymethod_3")).click();
	  
	  //13)
	  //driver.findElement(By.xpath("//input[@id='deliverymethod_3']")).click();
	  
	  //14)
	  driver.findElement(By.xpath("//input[@id='billname']")).sendKeys("Arogyam Foods & Generals");
	  
	  //15)
	  driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("8275594562");
	  
	  //16)
	  
	  driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("kekaneshantanu@gmail.com");
	  
	  //17)
	  driver.findElement(By.xpath("//span[@id='select2-billing_country-container']")).click();  // Bootstrap dropdown
	  driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("India"+Keys.ENTER);
	   
		
	  //18)
	  driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("Amrutdham Nashik");
	  driver.findElement(By.xpath("//input[@id='billing_address_2']")).sendKeys("Plot 13 Digambar Nagar");
	  
	  
	  // 19)
	  driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("422003");
	  
	  
	  //20)
	  driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Nashik");
	  
	  
	  
	}

}

package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_down_date_picker_selecttag {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		//Declaration Implicit wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		// Open Url or application
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
	
		
		// Find the DOB element
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		// Find the drop down month options in the DOB Element 
	    WebElement   Dropdown_months =	driver.findElement(By.xpath("//div[@class = 'ui-datepicker-title']/select[@class = 'ui-datepicker-month']"));
		
		// create an object for the select tag
		
		Select drop_down_months = new Select(Dropdown_months);
		
		// Selecting the option from the dropdown
		
		drop_down_months.selectByVisibleText("Jun");
		
		Thread.sleep(3000);
		// find the drop down year options in the DOB Element
		
	    WebElement	Dropdown_years = driver.findElement(By.xpath("//div[@class = 'ui-datepicker-title']//select[2]"));
		
		// create object for select tag
	    
	    Select drop_down_Year = new Select(Dropdown_years);
	    
	    // Selecting the option from the drop down
	    
	    drop_down_Year.selectByVisibleText("2020");
	    
	    
	    
	    
		
		
		
		

	}

}

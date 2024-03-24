package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationTabledemo_2 {

	public static void main(String[] args) throws InterruptedException {
	
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		
		 // Declaration of implicit wait
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 // Open url or application
		 
		 driver.get("https://demo.opencart.com/admin/index.php");
		 driver.manage().window().maximize();
		 
		// login page  - username & password
		WebElement Username = driver.findElement(By.xpath("//input[@id='input-username']"));
		Username.clear();
		Username.sendKeys("demo");
		 
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='input-password']"));
		Password.clear();
		Password.sendKeys("demo");
		 
		// Submit button
		
         WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		 submit.click();
		
		// Security Notification
		 
		 if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		 {
			 driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		 }
		 
		 // customers --------> customers
		 
		 driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		 
		 driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		 
		 // //div[@class='col-sm-6 text-end']
		 
		 String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		 
		 // To find the total number of pages or pagination options
		 
	     int total_page = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		 
	     System.out.println("Total Number of Pages:  "+total_page);
	     
	     
	     for(int p = 1;p<=total_page;p++)
	     {
	    	 if(total_page>1)
	    	 {
	    		 
	    	    WebElement	active_page = driver.findElement(By.xpath("//ul[@class = 'pagination']//li["+p+"]"));
	    	    System.out.println("Active page is : "+active_page.getText());
	    	    active_page.click();
	    	    
	    	    Thread.sleep(2000);
	    	    
	    	 }  
	    	    
	    	   int No_of_rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
	    	   System.out.println("No_of_rows:  "+No_of_rows);
	    	    
	    	   for(int r = 1;r<=No_of_rows;r++)
	    	   {
	    		  String checkbox = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]//td[1]")).getText();
	    	      String Customer_Name = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]//td[2]")).getText();
	    	      String Email_ids = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]//td[3]")).getText();
	    	   
	    	   }
	    		 
	    		 
	    	   driver.quit();	 
	    	 
	     }
	     
	     
		 
		 
		 
		 
		 
		 
		

	}

}

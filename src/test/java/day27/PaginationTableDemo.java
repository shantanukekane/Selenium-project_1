package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationTableDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open Url or application 
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		//Login the  page
		
	    WebElement Username =driver.findElement(By.xpath("//input[@id='input-username']"));
	    Username.clear();
	    Username.sendKeys("demo");
	    
	    
	    WebElement Password = driver.findElement(By.xpath("//input[@id='input-password']"));
	    Password.clear();
	    Password.sendKeys("demo");
	    
	    //press the submit button
	    
	   driver.findElement(By.xpath("//button[@type = 'submit']")).click();
       
		
	 
       
       if(driver.findElement(By.xpath("//button[@class = 'btn-close']")).isDisplayed());
       {
          
    	   driver.findElement(By.xpath("//button[@class = 'btn-close']")).click();

       }
		
		// customers------->customers
    
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@class='collapse show']//a[contains(text(),'Customers')]")).click();
		
		// Showing 1 to 10 of 18311 (1832 Pages)
		
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		
		//Find the Total Number of pages or pagination options are......
		//starting index start from 0 and ending index from 1
		
	    int totalpages = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
	 
	    System.out.println("Total Number of Pages are: "+totalpages);    // 1832 pages 
		
         /*
        //Showing 1 to 10 of 57 entries   
        String text_data = driver.findElement(By.xpath("//div[@id='dtBasicExample_info']")).getText();	     
	    
        // Find the total Number of pages or pagination options are
        
        int total_entities = Integer.parseInt(text_data.substring(text_data.indexOf(" ")+1,text_data.indexOf("entries")-1));
        
        */
	    
	    // Showing 91 to 100 of 5513 (10000000 Pages)
	    // Showing 91 to 100 of 5513 (10 Pages)
	    // showing 91 to 100 of 5513 (2 Pages)
	    // showing 91 to 100 of 5513 (234556 Pages)
	    
	    //String text_title = text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1);
	    
	    
	    for(int p = 1;p<=5;p++)    // int p = 1;p<=5;p++     // int p = 1;p<=totalpages;p++
	    {
	    	if(totalpages>1)      // if total pages are greater than 1 then only pagination option is there
	    	{
	    		 
	    	     WebElement active_pages = driver.findElement(By.xpath("//ul[@class = 'pagination']//li//*[text() = "+p+"]"));
	    		 System.out.println("Active pages: "+active_pages.getText());
	    	     active_pages.click();
	    	     Thread.sleep(2000);	    	
	    	}
	    	
	    	
	    
	    	int No_of_rows = driver.findElements(By.xpath("//table[@class = 'table table-bordered table-hover']//tbody//tr")).size();
	    	System.out.println("Total Number of rows: "+No_of_rows);
	    
	    	System.out.println("checkbox"+" "+"customer_Name"+"E_mailIDs"+" "+"Data_added");
	    	for(int r = 1;r<=No_of_rows;r++)
	    	{
	    		
	    	   String checkBox = driver.findElement(By.xpath("//table[@class = 'table table-bordered table-hover']//tbody//tr["+r+"]//td[1]")).getText();
	    	   String customer_Name = driver.findElement(By.xpath("//table[@class = 'table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();	
	    	   String E_mailIDs = driver.findElement(By.xpath("//table[@class = 'table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();	
	    	   String Data_added = driver.findElement(By.xpath("//table[@class = 'table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();	

	    	}
	    	
	    	
	    }
	    
	    driver.quit();

	}

}

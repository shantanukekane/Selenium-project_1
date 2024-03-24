package day27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTableDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open url or application
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		driver.manage().window().maximize();
		
		//1) Find total Number of rows
	    
		int rows = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr")).size(); // Mostly preferable 
	    System.out.println("Total Number of rows: "+rows);
		
	    //int rows = driver.findElements(By.tagName("tr")).size();  //  preferable when only one table in the web page
	    //System.out.println("Total Number of rows: "+rows);
	   
		//2) Find Total Number of columns
		
	    int columns = driver.findElements(By.xpath("//table[@name = 'BookTable']//th")).size();  // most preferable way
	    System.out.println("Total Number of columns:  "+columns);
	    
	    //int columns  = driver.findElements(By.tagName("th")).size();  // only preferable when one table is available
	    //System.out.println("Total Number of columns: "+columns);
	    
	    /*
	    String header = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr[1]")).getText();
	    System.out.println(header);
	    */
	    
		//3) Read Specific rows and column data
		/*
	   String exp_result = "Java";
	   
	   String act_result = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr[3]//td[3]")).getText();
	   
	   System.out.println(act_result); 
		
	  //4) Read data from all rows and columns
		/*
	 int N_rows = 7;
	 int N_column = 4;		   
	
	 for(int r = 2;r<=7;r++)  // Number of rows
	 {
		 for(int c = 1;c<=4;c++)
		 {
			String all_data = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]//td["+c+"]")).getText();
		    //System.out.println(data);   // it doesn't return in tabular format
		    System.out.print(all_data+"  ");
		 
		 }
		 System.out.println();        // it return data in tabular form
	 }
	 */
	 // read the entire data from the table
	  /*
	 System.out.println("BookName"+" "+"Author"+" "+"Subject"+" "+"Price");
	   
	 for(int r = 2;r<=7;r++)
	 {
		 for(int c = 1;c<=4;c++)
		 {
			 
			 String data = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]//td["+c+"]")).getText();
			 System.out.print(data+"\t");                                 // syntax of xpath is here to 
		 }
		 System.out.println();
	 }
	 
	 */
	 

		
		//5) print book name whose auther is amit
		/*
		for(int r = 2;r<=rows;r++)
		{
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		    if(author.equals("Amit"))
		    {
		     
		      String BookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
		      System.out.println(author+":"+BookName);
		    }
		
		}
	 
		// Print the Book auther whose name is Mukesh
		
		for(int r = 2;r<=rows;r++)
		{
		     String	author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		     if(author.equals("Mukesh"))
		     {
			  
		    	 String	BookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
                 System.out.println(author+" "+BookName); 
		     }
		}
		*/
	    
		
		// Print the book auther whose name is animesh
	    /*
	    for(int r = 2;r<=rows;r++)
	    {
	        String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
	        
	        if(author.equals("Animesh"))
	        {
	        	String BookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
	            System.out.println(author+":"+BookName);
	        }
	    
	    }
	    
		// read the overall data from the table
	    
	    
	    for(int r = 2;r<=rows;r++)   // Number of rows
	    {
	    	for(int c = 1;c<=columns;c++)
	    	{
	    	   String data = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]//td["+c+"]")).getText();
	    	   System.out.print(data+"\t");
	    	}
	    	System.out.println();
	    }
	    
	   */
		
		//6) find sum of prices for all books
        int sum = 0;
	    for(int r = 2;r<=rows;r++)
	    {
	    	String price = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]//td[4]")).getText();
	        //System.out.println(price);
	      
	        sum = sum +Integer.parseInt(price);  // converting String into int variable
	         
	    }
	        
	     System.out.println("sum of all books: "+sum);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    driver.quit();
	    
	}

}

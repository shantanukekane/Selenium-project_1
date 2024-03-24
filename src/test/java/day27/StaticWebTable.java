package day27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open Url or application
		
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		driver.manage().window().maximize();
		
		// want to perform some operation on the static table.
		// 1) Find the total number of rows in the table
		
        int rows = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr")).size();
	    System.out.println("Total Number of rows: "+rows);
		
	    //int rows = driver.findElements(By.tagName("tr")).size();
		//System.out.println("Total Number of rows: "+rows);
		

	    // 2) Find the Total Number of Columns in a table
	    
	    int columns = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr/th")).size();
	    System.out.println("Total Number of columns: "+columns);
	    
	    // 3) Read the specific data from the table 
	    
	    String Specific_word = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr[5]//td[1]")).getText();
	    System.out.println("Specific Word is : "+Specific_word);
	    
	    // 4) Read data from all rows and columns
	    
	    System.out.println("BookName"+" "+"Author"+" "+"Subject"+" "+"Price");
	    
	    for(int r = 2;r<=rows;r++)    // Number of rows
	    {
	    	for(int c = 1;c<columns;c++)   // Number of columns
	    	{
	    	  
	    		 String data =	driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]//td["+c+"]")).getText();
	    	     System.out.print(data+"\t");
	    	
	    	}
	    	System.out.println();
	    	
	    }
	    
	    // 5) print book Names whose subject is Selenium
	    System.out.println("BookName"+"  :  "+"Subject");
	    for(int r = 2;r<=rows;r++)
	    {
	        String subject = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]//td[3]")).getText();
	    	
	        if(subject.equals("Selenium"))
	        {
		        String BookName = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]//td[1]")).getText();
                System.out.println(BookName+"  :  "+subject);
	        }
	    	
	    }
	    
	    
	    // 6) Print the BookName whose price is 300
	    
	    for(int r = 2;r<=rows;r++)
	    {
	    	String price = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]//td[4]")).getText();
	    	if(price.equals("300"))
	    	{
	    		String BookName = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]//td[1]")).getText();
	    	    System.out.println(BookName+"  :  "+price);
	    	}
	    	
	    }
	    
	    
	    
	    
	    // 7) print the BookName whose author is Amit
	    
	    for(int r = 2;r<=rows;r++)
	    {
	    	
	        String author = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]//td[2]")).getText();
	    	if(author.equals("Amit"))
	    	{
		        String BookName = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]//td[1]")).getText();
                System.out.println(BookName+" : "+author);
	    	}
	        
	    }
	    
	    // 8) find the sum of prices for all books
	    // initalize a variable
	    
	    int sum = 0;
	    
	    for(int r = 2;r<=rows;r++)
	    {
	        String price = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]//td[4]")).getText();
	    	System.out.println(price);
	    	
	    	sum = sum + Integer.parseInt(price);
	    }
	    System.out.print("Total price of all Books: "+sum);
	    
	    
	    
	    
	    // 8) find the sum of prices for all books
        int add = 0;
	    for(int r = 2;r<=rows;r++)
	    {
	    	String price = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]//td[4]")).getText();
	        add = add + Integer.parseInt(price);   // converting string into integer value
	    	
	    }
	    System.out.print(add);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}

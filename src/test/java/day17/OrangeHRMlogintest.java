package day17;

/*

 1) Launch Browser
 2) Open URL
    https://opensource-demo.orangehrmlive.com/
 3) Provide username - admin
 4) provide password - admin123
 5) click on login button
 6) verify the title of dashboard page
    Exp title : OrangeHRM
 7) close browser      
 
 */


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRMlogintest {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		
		// we have to create an object for the each driver class
		
		// 1) Launch Browser
		//ChromeDriver driver = new ChromeDriver();
	     WebDriver driver = new ChromeDriver();
		
		// 2) Open URl on the Browser
	     driver.get("https://opensource-demo.orangehrmlive.com/");
	     
	     // this below command will maximize the page as soon as you open the url or web page
	     
	     driver.manage().window().maximize();
	     
	     // we used thread.sleep for once the url or web page is open and it take 5sec
	     // after that the automation script will execute to maintain the smooth synchronization process ;
		 Thread.sleep(5000);
		// 3) Provide username - Admin
	     
	      //WebElement textusername = driver.findElement(By.name("username"));
	      //textusername.sendKeys("Admin");
 	           // or //
	      driver.findElement(By.name("username")).sendKeys("Admin");
	      
	    // 4) provide password - admin123
	      
	      driver.findElement(By.name("password")).sendKeys("admin");
	      
	    // 5) click on login or submit button
	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	    //6) verify the title of dashboard page
	     // Exp title : OrangeHRM  
         
	      String act_title = driver.getTitle();
	      String exp_title = "OrangeHRM";
	      
	      // we have to compare this two string  if-else condition using equal() method
	      
	      if(act_title.equals(exp_title))
	      {
	    	  System.out.println("Test passed");
	      }
	      else
	      {
	    	  System.out.println("Test failed");
	      }
	      
	      
	      // label validation after succesfull login
	     String act_label = null;
	     try
	     {
	     act_label = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	     }
	     catch(Exception e)
	     {
	    	 act_label = " ";
	     }
	     String exp_label = "Dashboard"; 
	     
	     
	     // comparing the both label using if else condition
	     
	     if(act_label.equals(exp_label))
	     {
	    	 System.out.println("Test passed");
	    	 
	     }
	     else
	     {
	    	 System.out.println("Test Failed");
	     }
	     
	     
	     // 7) close browser      
	      driver.close();  //if statement gives the exception then use quit() method
	      //driver.quit();
	      
	}

}
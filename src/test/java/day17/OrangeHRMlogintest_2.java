package day17;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 1) Launch Browser
 2) Open URL
    https://opensource-demo.orangehrmlive.com/
 3) Provide username - Admin
 4) provide password - admin123
 5) click on login button
 6) verify the title of dashboard page
    Exp title : OrangeHRM
 7) close browser      
 
*/

public class OrangeHRMlogintest_2 {

	public static void main(String[] args) throws InterruptedException {
		
		// 1) Launch Browser
		WebDriver driver = new ChromeDriver();
		

		// 2) Open application or URL
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		//  3) Provide username - Admin

		driver.findElement(By.name("username")).sendKeys("Admin");
		
		
		//  4) provide password - admin123

		driver.findElement(By.name("password")).sendKeys("admin");
		
		//  5) click on login button

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		
		// 6) verify the title of dashboard page
	    //Exp title : OrangeHRM
		
	    String act_title = driver.getTitle();
	    String exp_title = "OrangeHRM";
		
		
	    if(act_title.equals(exp_title))
	    {
	    	System.out.println("Test passed");
	    }
	    else
	    {
	    	System.out.println("Test failed");
	    }
		
		// 7) verify the label dashboard after submit button
	 String act_label = null;
	 try
	 {
	   act_label = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	 }
	 catch(NoSuchElementException e)
	 {
		 act_label = "";
	 }
	 String exp_label = "Dashboard";
	 
	 if(act_label.equals(exp_label))
	 {
		 System.out.println("Test passed");
	 }
	 else
	 {
		 System.out.println("Test Failed");
	 }
	 
	    
	    
	}
	

}

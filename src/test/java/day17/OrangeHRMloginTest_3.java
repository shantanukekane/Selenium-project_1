package day17;

import org.openqa.selenium.By;

/*
1) Launch Browser
2) Open URL
   https://opensource-demo.orangehrmlive.com/
3) Provide username - Admin
4) provide password - admin123
5) click on login button
6) verify the title of dashboard page
   Exp title : OrangeHRM
7) validate the label = Dashboard
   Exp label = Dashboard   
8) close browser      

*/






import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMloginTest_3 {

	public static void main(String[] args) throws InterruptedException {
	
		
		//WebDriverManager.chromedriver().setup();
		
		// Launch The Browser
		WebDriver driver = new ChromeDriver();
		
		
		// Open URL or application
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		
		/*
		//3) Provide username - Admin

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		
		
		//4) provide password - admin123

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		
		//5) click on login button

		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		
		//6) verify the title of dashboard page
		//   Exp title : OrangeHRM
		
		*/
		
		// 3) provide username = Admin
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		// 4) provide password = admin123
		
		driver.findElement(By.name("password")).sendKeys("admin");
		
		// 5) click on login button

		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		// 6) verify the title of dashboard page
		//  Exp title : OrangeHRM
		
	    String act_title = driver.getTitle();
	    
	    String Ext_title = "OrangeHRM";
	    
	    if(act_title.equals(Ext_title))
	    {
	    	System.out.println("Test Passed");
	    }
	    else
	    {
	    	System.out.println("Test Failed");
	    }
		
		
		// 7) validate the label = Dashboard
	    // Exp label = Dashboard 
		
	    String act_label = "";  // or null
	    
	    try
	    {
           act_label = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	    }
	    catch(Exception e)
	    {
	    	//act_label = "";  // we can't apply null value equals method
	    }
	    String Ext_label = "Dashboard";
	    
	    
	    if(act_label.equals(Ext_label))
	    {
	    	System.out.println("Test Passed");
	    }
	    else
	    {
	    	System.out.println("Test Failed");
	    }
        
        // 8) close browser
	    
	    //driver.close();
	    driver.quit();
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_down_hidden_objects {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open URL or application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		// Login page
		
	    WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		Username.clear();
		Username.sendKeys("Admin");
		
	    WebElement	Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	    Password.clear();
	    Password.sendKeys("admin123");
	    
	    
	    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	    
	    Thread.sleep(3000);
	    
        driver.findElement(By.xpath("//ul[@class = 'oxd-main-menu']/li[2]/a")).click();
	    
	    
		// Find the Drop Down Element and press click Button
		
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		
		/* Find the total Number of options in the Drop down hidden objects first we have to inspect the 
		   element and lets see the hidden object is visible or not if not then go to the Event Listeners
		   check the blur option and and keep refreshing the page until the blur option could see 
		   if it is then click on remove then you can see Entire hidden object in the DOM 
		*/
		
		// Find the Total Number of options in the Web Page
        List<WebElement> all_options = driver.findElements(By.xpath("//div[@role = 'listbox']//span"));
		
        
        // Print all the options in the hidden drop down 
        /*
        for(WebElement option:all_options)
        {
        	System.out.println(option.getText());
        }
        
        */
        
		// Use Enhance for loop to get all the options
        
        for(WebElement option:all_options)
        {
        	if(option.getText().equals("Automaton Tester"))
        	{
        		option.click();
        		break;
        	}
        }
        
        
        
		
		

	}

}

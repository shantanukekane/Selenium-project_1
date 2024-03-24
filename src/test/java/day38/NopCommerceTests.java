package day38;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(day38.ExtentReportManager.class)
public class NopCommerceTests {

	
	    WebDriver driver;
	    
	    @BeforeClass
	    void setup()
	    {
	    	
	    	WebDriverManager.chromedriver().setup();
	    	driver = new ChromeDriver();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	
	    	driver.get("https://demo.nopcommerce.com");
	    	driver.manage().window().maximize();
	    	
	    }

	    @Test(priority = 1)
	    void testLogo()
	    {
	    	
	       try
	       {
	          boolean status =	driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	          Assert.assertEquals(status, true);	
	       }
	    	
	       catch(Exception e)
	       {
	    	   
	    	   Assert.fail();
	    	   
	       }
	    	
	    }
	    
	    @Test(priority = 2)
	    void testlogin() throws InterruptedException
	    {
	    	try
	    	{
	    	driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
	    	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abc123@gmail.com");
	    	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("test@123");
	    	driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	    	
	    	Thread.sleep(3000);
	    	//validation
	        boolean status =	driver.findElement(By.xpath("//a[@class='ico-account']")).isDisplayed();
	        Assert.assertEquals(status, true);
	        }
	    	catch(Exception e)
	    	{
	    		Assert.assertTrue(false); // Assert.fail();
	    	}
	    	
	    	
	    }
	    
	    @Test(priority = 3,dependsOnMethods = {"testlogin"})
	    void testlogout() throws InterruptedException
	    {
	    	
	    	driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
	    	Thread.sleep(3000);
	    	
	        boolean status = driver.findElement(By.xpath("//a[normalize-space()='Register']")).isDisplayed();
	    	Assert.assertEquals(status, true);
	    	
	    	
	    }
	   
	
	    @AfterClass
	    void close()
	    {
	    	driver.quit();
	    }

	
}	
	

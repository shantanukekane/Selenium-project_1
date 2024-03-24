package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_Demo_3 {

	     WebDriver driver;
	    
	    @BeforeClass       // i want to execute this test only once i prefer @Beforeclass method 
	    void setup()
	    {
	    	WebDriverManager.chromedriver().setup();
	    	driver = new ChromeDriver();
	    	
	    }
	
	    @Test(dataProvider= "dp")
	    void testLogin(String user,String pwd)
	    {
	    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    	driver.manage().window().maximize();
	    	driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys(user);
	    	driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys(pwd);
	    	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	    	
	    	String exp_title = "OrangeHRM";
	    	String act_title = driver.getTitle();
	    	
	    	Assert.assertEquals(exp_title, act_title);
	    	
	    }
	    
	    
	    @AfterClass
	    void tearDown()
	    {
	    	driver.quit();
	    }
	    
	    
	    @DataProvider(name = "dp",indices = {0,2})
	    String [][] logindata()
	    {
	    	
	    	String data [][] = {
	    			           {"shantanu","shantanu@1234"},
	    			           {"Admin","admin123"},
	    			           {"admin","admin123"},
	    			           {"shantanu","shantanu@123"},
	    			     
	    			      
	    	                                      };
	    	return data;
	    	
	    }
	    
	    
	
}

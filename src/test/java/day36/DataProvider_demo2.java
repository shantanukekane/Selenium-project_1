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

public class DataProvider_demo2 {

	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
    @Test(dataProvider = "dp")
	void testLogin(String email,String pwd)
	{
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		String exp_title = "nopCommerce demo store. Login";
		String act_title = driver.getTitle();
		
		Assert.assertEquals(exp_title, act_title);
			
	}
	
    @AfterClass
	void tearDown()
	{
    	driver.quit();
	}
	
	@DataProvider(name = "dp")
   String [][] loginData()
    {
    	
		String [][] Data = { 
				           {"test@gmail.com","pass123"},
				           {"shantanu@gmail.com","test1234"},
				           {"shantanukekane@gmail.com","shantanu@1234"},
				           {"kekaneshantanu@gmail.com","Shantanu@1234"},
				           {"kekaneshantanu@gmail.com","Shantanu@1234"}
		                   };
		
		return Data;
		
    }
	
	
	

}

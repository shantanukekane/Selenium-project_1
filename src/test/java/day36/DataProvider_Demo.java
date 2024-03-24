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

public class DataProvider_Demo {

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
	
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		String exp_title = "nopCommerce demo store";
		String act_title = driver.getTitle();
		
		Assert.assertEquals(exp_title, act_title);
		
	}
	
	@AfterClass
	void  tearDown()
	{
		
		driver.quit();
		
	}
	
	@DataProvider(name = "dp")
	String [][] loginData()
	{
		// This data actually we are getting from Excel sheet 
		// right now we are just create by our own way
		
		String data[][] = {
				            {"abc@gmail.com","test123"},
			            	{"shantanu@gmail.com","test@123"},
				            {"kekaneshantanu@gmail.com","test3"},
				            {"kekaneshantanu@gmail.com","Shantanu@1234"},
				            {"kekaneshantanu@gmail.com","Shantanu@1234"}
		
		                   };		
		
		return data;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest_Demo_By_ParallelTesting {

	  WebDriver driver;
	
	  @BeforeClass
	  @Parameters({"browser","url"})
	  void setup(String br,String appurl) throws InterruptedException
	  {
		  if(br.equals("chrome"))
		  {
		      WebDriverManager.chromedriver().setup();
		      driver = new ChromeDriver();
		  }
		  else if(br.equals("edge"))
		  {
			  WebDriverManager.edgedriver().setup();
			  driver = new EdgeDriver();
		  }
		  
		  else
		  {
			  WebDriverManager.firefoxdriver().setup();
			  driver = new FirefoxDriver();
		  }
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get(appurl);
		  driver.manage().window().maximize();
		  
		  Thread.sleep(5000);
	  }
	
	  @Test(priority = 1)
	  void testLogo()
	  {
		 try
		 {
		    boolean logo_status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		    Assert.assertEquals(logo_status, true); 
		 }
		 catch(Exception e)
		 {
		    Assert.fail();
		 }
	  }
	
	  @Test(priority = 2)
	  void testHomePageTitle()
	  {
		  /*
		String  exp_title = "OrangeHRM";
	    String  act_title = driver.getTitle();
		
	    Assert.assertEquals(exp_title, act_title);
	    */
		  
		  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		  
	  }
	
	  @AfterClass
	  void close()
	  {
		  driver.quit();
	  }
	
	  @Test(priority = 3)
	  void loginTest()
	  {
		  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  
	      driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  
	  }
	  
	
	  
	  
	
	
}

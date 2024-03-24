package day39_copy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	
	WebDriver driver;
	LoginPage Lp;
	@BeforeClass
	void setup()
	{
	     WebDriverManager.chromedriver().setup();
	     driver =  new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
	     driver.manage().window().maximize();	 
	
	}
	
	@Test(priority = 1 )
	void checklogopresent()
	{
		  Lp = new LoginPage(driver);
		  Assert.assertEquals(Lp.testLogo(), true);
	
	}
	
	@Test(priority = 2)
	void clickLoginButton()
	{
		Lp.loginClick();
		Lp.setEmail("abc123@gmail.com");
		Lp.setPassword("test@123");
		Lp.clickButton();
	}
	
	@Test(priority = 3)
	void myAccPresent()
	{
		Assert.assertEquals(Lp.MyAccountPresent(), true);
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	
	
}

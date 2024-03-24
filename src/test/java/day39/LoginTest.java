package day39;

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
	//create global variable for the loginpage class
	LoginPage lp;
	
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
	}
	
	@Test(priority = 1)
	void testLogo()
	{
		// whichever driver you created that you have to pass
		
		lp = new LoginPage(driver);
		
		Assert.assertEquals(lp.checklogoPresent(), true);
		// here we have to validate the action method
		
	}
	
	@Test(priority = 2)
	void testlogin()
	{
	    lp.setUsername("Admin");
	    lp.setPassword("admin123");
	    lp.ClickButton();
		// validation
	    Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	
	
	
}

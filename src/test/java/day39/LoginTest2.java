package day39;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriverLogLevel;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest2 {

	WebDriver driver;
	LoginPage2 lp;
	
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
		
		lp = new LoginPage2(driver);
		Assert.assertEquals(lp.checkLogoPresent(), true);
		
	}
	
	@Test(priority = 2)
	void testLogin()
	{
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		lp.clickButton();
		
		// validation after login
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		
	}
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	
	
}

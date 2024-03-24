package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		// Launch Browser
		WebDriver driver =  new ChromeDriver();
		
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Open Application or URL
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	
		
		driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

		
		
		
		
		
		
		
		

	}

}

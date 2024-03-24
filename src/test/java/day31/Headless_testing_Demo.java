package day31;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless_testing_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		
		// Approach 1 =====> headless testing
		/*
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver(options);
		*/
		// Approach 2 -=====> headless testing
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		WebDriver driver = WebDriverManager.chromedriver().capabilities(options).create();
		

		
		/*
	    // Approach 1 =====> headless testing
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
	
		WebDriver driver = WebDriverManager.chromedriver().capabilities(options).create();
		
		
		// Approach 2 ======> headless testing
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		
		
	    // Headless testing
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		
	    WebDriver driver =  WebDriverManager.chromedriver().capabilities(options).create();
		
		
		/*
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		
		*/
		
	
		// Open url
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Username
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		// password
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//submit button
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		// after submit the button 
		// validate the title of the page
		String act_title = driver.getTitle();
		String exp_title = "OrangeHRM";
		
		
		if(act_title.equals(exp_title))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		
		
		
		
		
		
		
		

	}

	private static WebDriver ChromeDriver(ChromeOptions options) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

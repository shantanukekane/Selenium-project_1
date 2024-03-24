package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsercommand {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		// launch browser
		WebDriver driver = new ChromeDriver();
		
		// open URl
		driver.get("https://opensource-demo.orangehrmlive.com/");  
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(5000);
		
		//driver.close();  // it closed single browser window
		driver.quit();
		
		
		
		

	}

}

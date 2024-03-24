package day23;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigatingCommand_1 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://amazon.in/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://flipkart.in/");
		System.out.println(driver.getCurrentUrl());		

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl()); // amazon.com
		
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); // flipkart.com
		
		driver.navigate().refresh();
		
		
		
		
	}

}

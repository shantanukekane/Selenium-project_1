package day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigatecommand {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.co.in/");
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().to("https://youtube.com/");
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());   // google.com
		
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); // youtube.com
		
		driver.navigate().refresh();
		
		
		
		
		
		
		
		

	}

}

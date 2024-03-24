package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tabs_and_Window_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		// Open URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.switchTo().newWindow(WindowType.TAB); // switch to another tab
		driver.get("https://demo.opencart.com/");
		
		driver.switchTo().newWindow(WindowType.TAB); // Switch to the another tab of same Browser
		driver.get("https://www.youtube.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

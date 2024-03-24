package day30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tabs_and_Windows {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.switchTo().newWindow(WindowType.TAB);  // switching to the another tab
		driver.get("https://www.youtube.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);  // switching to the another window
		driver.get("https://demo.opencart.com/");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

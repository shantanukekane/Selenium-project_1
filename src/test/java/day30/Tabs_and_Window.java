package day30;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tabs_and_Window {

	public static void main(String[] args) {
	
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		//Declaration of implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open url or application
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.switchTo().newWindow(WindowType.TAB);   // switch to the new tab
		driver.get("https://www.google.com");
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.yahoo.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);   // switch to new window
		driver.get("https://www.google.com");
		
		
		
		
		
		
		

	}

}

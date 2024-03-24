package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocationofElement_2 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement username =driver.findElement(By.name("username"));
		System.out.println("location of username after maximum window: "+username.getLocation()); // 
		
		driver.manage().window().minimize();
		System.out.println("Location of username after minimum window: "+username.getLocation());
		
		driver.manage().window().fullscreen();
		System.out.println("Location of username after full screen: "+username.getLocation());
		
		
		Point p = new Point(100, 100);
		driver.manage().window().setPosition(p);
		System.out.println("after setting window: "+username.getLocation());
		
		p = new Point(200,200);
		driver.manage().window().setPosition(p);
		System.out.println("after setting window: "+username.getLocation());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocationofElement {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		System.out.println("location of logo after maximizing the Element : "+logo.getLocation());// (404,40)
		
		driver.manage().window().minimize();
		System.out.println("Locating the Logo after minimizing the element: "+logo.getLocation()); // (271,40)
		
		
		// make it as full screen 
		driver.manage().window().fullscreen();
		System.out.println("Locating the logo after fullsize the logo: "+logo.getLocation());
		
		
		// If we want to set the position of the window you can use command like setposition
		// create an object for the pointer position
		
		Point p = new Point(150,150);      // size of the page do we want
		driver.manage().window().setPosition(p);
		System.out.println("after setting window 150 * 150: "+logo.getLocation());
		p = new Point(500,500);
		driver.manage().window().setPosition(p);		
		System.out.println("after setting window 500 * 500: "+logo.getLocation());
		
		
		
		
		
		

	}

}

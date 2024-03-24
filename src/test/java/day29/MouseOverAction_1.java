package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverAction_1 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of Implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open URL 
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Locating the elements
	     WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	     WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		//create an object for the mouse hover action using Actions class
	     
	     Actions act = new Actions(driver);
	     
	     // Mouse Hover
	     // first approach
	     act.moveToElement(desktop).moveToElement(mac).click().build().perform();  // first we create an actions and then complete an actions
	     
	     // second approach
	     //act.moveToElement(desktop).moveToElement(mac).click().perform();  // here we directly perform the actions
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

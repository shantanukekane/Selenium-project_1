package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame_1 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Open url or applications
		driver.get("https://www.javadoc.io/doc/org.seleniumhq.selenium/selenium-api/3.141.59/index.html");
		
		// Locating the frame/uframe using the  webelement 
	    WebElement frm1 = driver.findElement(By.xpath("//iframe[@class='content']"));  
		driver.switchTo().frame(frm1);         
	
		// perform the action the element within the frame 
		driver.findElement(By.linkText("org.openqa.selenium.html5")).click();   // frame 1
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(frm1);
		driver.findElement(By.linkText("WebDriver")).click();   // frame 2
		
	
		
		driver.findElement(By.xpath("//div[@class='topNav']//li[@class='navBarCell1Rev'][normalize-space()='Overview']")).click();    // frame 3
		
		

	}

}

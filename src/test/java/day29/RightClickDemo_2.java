package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickDemo_2 {

	public static void main(String[] args) throws InterruptedException {
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		// create an actions class for the perform the mouse actions
		
		Actions act = new Actions(driver);   // pass the driver instance
		
		// right click
		
		act.contextClick(button).perform();   // perform right click action
		
		//click on paste operation 
		driver.findElement(By.xpath("//span[normalize-space()='Paste']")).click();  // click action
		
		Thread.sleep(3000);
		
		// switch to the alert window and close it using accept command
		driver.switchTo().alert().accept();   // close the alert window
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

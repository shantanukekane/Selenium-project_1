package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickDemo_1 {

	public static void main(String[] args) throws InterruptedException {
	
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		
		// We have to switch to the inner frame first 
		
		driver.switchTo().frame("iframeResult");
		
		// Inspecting the Element
		
        WebElement Field_1 = driver.findElement(By.xpath("//input[@id='field1']"));
		Field_1.clear();
		Field_1.sendKeys("Welcome");
		
		
	    WebElement button =	driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		// Create an actions class for the double click event
		
		Actions act = new Actions(driver);
		
		// double click
		
		act.doubleClick(button).perform(); // copy element
		
		// validation of text copied or not
		// Before going to validate we inspect the field 2
		WebElement Field_2 = driver.findElement(By.xpath("//input[@id='field2']"));
	
		
		String copied_text = Field_2.getAttribute("value");          //here we are using the value attributes
		
		
		Thread.sleep(3000);
		
		if(copied_text.equals("Welcome"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		
		
		
		
		
		
		
		
		

	}

}

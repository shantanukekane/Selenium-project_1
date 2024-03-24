package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Doubleclickdemo_2 {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		// switching to the inner frame
		
		driver.switchTo().frame("iframeResult");
		
		// Inspecting element
		WebElement F1 = driver.findElement(By.xpath("//input[@id='field1']"));
		F1.clear();
		F1.sendKeys("Welcome");
		
		// inspecting double click element
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		// create an actions class to perform on mouse event
		
		Actions act = new Actions(driver);
		
		//double click
		act.doubleClick(button).perform();   // 
		
		// inspecting the Field 2
		WebElement F2 = driver.findElement(By.xpath("//input[@id='field2']"));
		
		String copied_text = F2.getAttribute("value");   // we are using getAttributes methods when only 
		                                                // value is present in the DOM
                                                           		
		// validations
		
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

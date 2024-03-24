package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemo1 {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		
		//1) Launch browser
		// First create an object for the browsers through which we can identify the web element 
		// using different method
		
		WebDriver driver = new ChromeDriver();
		
		//2) Open application or URL
		driver.get("http://www.automationpractice.pl/index.php");
		//driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();// maximize browser window
		
		// search box
		
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		
		// search button
		
		driver.findElement(By.name("submit_search")).click();
		
		// Linktext
		
		//driver.findElement(By.linkText("Blouse")).click();
		
		//partial linktext
		//driver.findElement(By.partialLinkText("Blo")).click();
		

		//driver.findElement(By.linkText(" Faded Short Sleeve T-shirts ")).click();
		
		driver.findElement(By.linkText("Printed Summer Dress")).click();
		// link text
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		//driver.findElement(By.partialLinkText("Printed Chiffon")).click();
		
		

	}

}

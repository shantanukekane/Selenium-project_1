package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatordemo_1 {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		
		  WebDriver driver = new ChromeDriver();

		  // open browser
		  
		  driver.get("http://www.automationpractice.pl/index.php");
		  driver.manage().window().maximize();
		  
		  // Search input box
		  
		  driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		  
		  // press search button 
		  
		  driver.findElement(By.name("submit_search")).click();
		  
		  // linkText or partial linktext
		  
		  
		 //driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
		  
		   //driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		  
		 //driver.findElement(By.linkText("Printed Dress")).click(); 
		  
		  
		  driver.findElement(By.partialLinkText("Printed")).click();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}

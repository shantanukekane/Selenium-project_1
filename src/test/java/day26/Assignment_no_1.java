package day26;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_no_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//open url or application
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class = 'wikipedia-search-input']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		// total Number of options in the auto suggestions
	    List<WebElement> searchlinks =	driver.findElements(By.xpath("//div[@id = 'wikipedia-search-result-link']//a"));
		System.out.println("Total Number of auto suggestions: "+searchlinks.size());
		/*
		for(WebElement links:searchlinks)
		{
			System.out.println(links.getText());
			links.click();
		}
		
		//captures the all ids 
		
		Set<String> WindowIds = driver.getWindowHandles();
		
		System.out.println("Switching to all the pages and capture the title of the each page:..........");
		
		for(String WinIds:WindowIds)
		{
			String title = driver.switchTo().window(WinIds).getTitle();
			System.out.println(title);
		}
		
		driver.quit();
		
		*/
		
		
		//selecting the one of the options
		for(int i = 0;i<searchlinks.size();i++)
		{
		   String text = searchlinks.get(i).getText();
		   System.out.println(searchlinks);
		   searchlinks.get(i).click();
		}	
		
		
		//captures the all ids 
		
		 Set<String> WindowIds = driver.getWindowHandles();
		
		// switching to the individual window  browser and capture the title of the page
		 
		System.out.println("switching to the individual window  browser and capture the title of the page :........");
		for(String Winids:WindowIds)
		{
		  String title = driver.switchTo().window(Winids).getTitle();
		  System.out.println(title);
		}
		
	
		
		// closing the Browsing window if the particular wants to close 
		
		for(String Winids:WindowIds)
		{
		  String title = driver.switchTo().window(Winids).getTitle();
		  if(title.equals("Selenium dioxide - Wikipedia") || title.equals("Selenium disulfide - Wikipedia"))
		  {
			  driver.close();
		  }
		  
		  
		  
		}
		
		
	}		
		
		
				
		
}

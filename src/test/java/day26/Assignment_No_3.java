package day26;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_No_3 {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//open url or application
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class = 'wikipedia-search-input']")).sendKeys("automation");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// Total Number of search links 
		
	    List<WebElement> searchlinks = driver.findElements(By.xpath("//div[@id = 'wikipedia-search-result-link']//a"));
	
		System.out.println("Total Number of links: "+searchlinks.size());
		
		// Open the total number of Links
		for(WebElement links:searchlinks)
		{
			System.out.println(links.getText());
			links.click();
			
		}
		
		// We are capturing the ID of each browser window
		
		Set<String> WindowIDs = driver.getWindowHandles();
		
		//Switching to the each browsing window and capture the title
		System.out.println("Switching to the each browsing window and capture the title: .......");
		for(String winids:WindowIDs)
		{
			String title = driver.switchTo().window(winids).getTitle();
		    System.out.println(title);
			
		}
		
		driver.quit();
		
		
		
		
		
	    
		
		
	}

}

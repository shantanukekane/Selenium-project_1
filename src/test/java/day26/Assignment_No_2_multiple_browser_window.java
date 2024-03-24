package day26;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_No_2_multiple_browser_window {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Open URL or application
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class = 'wikipedia-search-input']")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// Total Number of search links 
	    List<WebElement> searchlinks = driver.findElements(By.xpath("//div[@id = 'wikipedia-search-result-link']//a"));
		System.out.println("Total Number of searchlinks are: "+searchlinks.size());
		
		
		// with the help of Enhance loop we are opening the all links
		for(WebElement links:searchlinks)
		{
			System.out.println(links.getText());
			links.click();
		}
		
		
	    // capture all ids
		
		Set<String> WindowIds = driver.getWindowHandles();
		
		System.out.println("Switching to all browser pages and capture the all title:..........");
		
		for(String WinIds:WindowIds)
		{
		     String title =	driver.switchTo().window(WinIds).getTitle();			
			 System.out.println(title);     
			
		}
		
		driver.quit();
		
		

	}

}

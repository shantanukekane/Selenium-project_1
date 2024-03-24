package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentNo_1 {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		// Open Url or application 
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		
		//locating the Element in web page
		driver.findElement(By.xpath("//textarea[contains(@id,'sb_form_q')]")).sendKeys("Automation");
		
		Thread.sleep(4000);
		
		// Total Number of auto suggestions in the search input
	
        List<WebElement> auto_suggestions =	driver.findElements(By.xpath("//div[contains(@class,'sa_as')]//following-sibling::li"));
		System.out.println("Total Number of auto options: "+auto_suggestions.size());		
	
		/*
		// Print all the auto suggestions
		
		for(int i = 0;i<auto_suggestions.size();i++)
		{
		 System.out.println(auto_suggestions.get(i).getText());
		}
		*/
		
		// select one the auto suggestions from the list
		
		for(int i = 0;i<auto_suggestions.size();i++)
		{
		  String text =	auto_suggestions.get(i).getText();
		  if(text.equals("automation tools"))
		  {
			  auto_suggestions.get(i).click();
			  break;
		  }
		}
		
		
		
		
		
		
		
	}

}

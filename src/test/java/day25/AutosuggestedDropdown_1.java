package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestedDropdown_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		// declaration of implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// open url or applications
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		// locating  the search box element
		driver.findElement(By.xpath("//textarea[@class ='gLFyf'][@id = 'APjFqb']")).sendKeys("Automation");
		
		Thread.sleep(3000);
		
		// Total Number of auto suggestions 
	    List<WebElement> auto_suggestions = driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
        System.out.println("Total Number of suggestions: "+auto_suggestions.size());
	    
        // print all the suggestion in the console window
        /*
        for(int i = 0;i<auto_suggestions.size();i++)
        {
           System.out.println(auto_suggestions.get(i).getText());
        }
        
        */
        
		//Thread.sleep(5000);
		
		// select one of the auto suggestion from the list
        
        for(int i = 0;i<auto_suggestions.size();i++)
        {
        	String text = auto_suggestions.get(i).getText();
        	if(text.equals("automation testing"))
        	{
        		auto_suggestions.get(i).click();
        		break;
        	}
        }
      

	}

}

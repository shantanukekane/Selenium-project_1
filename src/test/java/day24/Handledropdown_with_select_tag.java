package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handledropdown_with_select_tag {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open url or applications
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		driver.manage().window().maximize();
		
		// finding the drop down element in the webpage 
		
	    WebElement  Dd_countries = driver.findElement(By.xpath("//div[@class = 'information closable']/following::p/select"));
		
		// create an object for the select tag using select class
	    
	    Select drop_down_crty = new Select(Dd_countries);
		
		//1) selecting the options in the drop down
	    
	    //drop_down_crty.selectByVisibleText("Australia");
	    
	    //1) selecting the oprtion using value attributes
	    
	    drop_down_crty.selectByValue("ARM");
	    
	    //1) selecting the options by using index
	    
	    // drop_down_crty.selectByIndex(3);
	    
	    
	    // 2) Total Number of drop down options in the webpage
	    
	    List<WebElement>  Options = drop_down_crty.getOptions();
	    System.out.println("Total Number of drop down: "+Options.size());
	    
	    // 3) print all the options in the console window
	    
	    for(int i = 0;i<Options.size();i++)
	    {
	    	System.out.println(Options.get(i).getText());
	    }	

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	
	
	

}

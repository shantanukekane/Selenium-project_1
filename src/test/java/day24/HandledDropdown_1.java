package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandledDropdown_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of Implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open URL or application
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		driver.manage().window().maximize();
		
		
	    WebElement Drop_down_Ele = driver.findElement(By.xpath("//div[@class='information closable']/following::p/child::select"));
		
	    Select Dropcountry = new Select(Drop_down_Ele);
	    
	    //1) Select the option from drop down
	    
	    // You just simply specify the name inside the Dropdown 
	    //Dropcountry.selectByVisibleText("Australia");
	    //Dropcountry.selectByVisibleText("India");

		// another approach using value method
	    
	    //Dropcountry.selectByValue("SGP");  // here we can pass attribute of the text
	                                       // if value is avaliable in the options

	    //Dropcountry.selectByValue("SAU");
	    
	    
	    //2) Finding the Total options in the drop down
	    
	     List<WebElement> Options = Dropcountry.getOptions();
	     System.out.println("Total Numbe of Options: "+Options.size());
	    
	    //3) print all Options in console window
	     for(int i = 0;i<Options.size();i++)
	     {
	    	 System.out.println(Options.get(i).getText());
	     }
	    
	    
	    
	    
	    
	    
	}

}

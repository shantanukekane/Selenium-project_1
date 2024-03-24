package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropdown_without_select_tag {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Open URL or application
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		// clicking the BootStrab drop down element
		
	    driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
	    // Total Number of Drop down in web element
	    
	   List<WebElement> Options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	    System.out.println("Total Number of drop down: "+Options.size());
	    
		
		//print all the Drop down console window
	    /*
	    for(int i = 0;i<Options.size();i++)
	    {
	    	String option = Options.get(i).getText();
	    	
	    	if(option.equals("Java") || option.equals("Python"))
	    	{
	    		Options.get(i).isSelected();
	    		Options.get(i).click();
	    		
	    	}
	    }
	    */
	    // using the each for loop to selecting the multiple options
	    for(WebElement option:Options)
	    {
	    	String text = option.getText();
	    	if(text.equals("Java")||text.equals("C#"))
	    	{
	    		option.click();
	    	}
	    }
	    
	    
	    
		
		

	}

}

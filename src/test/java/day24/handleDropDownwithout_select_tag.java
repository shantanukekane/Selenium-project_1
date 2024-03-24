package day24;

import java.lang.foreign.Linker.Option;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleDropDownwithout_select_tag {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =  new ChromeDriver();
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open url or application
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		// clicking the bootstrap drop down
		
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
        
        List<WebElement> Options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
        System.out.println("Total Number of options in multiple dropdown: "+Options.size());
		
		
        //printing all Options in console window
        /*
        for(int i = 0;i<Options.size();i++)
        {
        	System.out.println(Options.get(i).getText());
        }
        
       */
        //
        /*
        for(int i = 0;i<Options.size();i++)
        {
        	if(Options.get(i).getText().equals("Java"))
        	{
        	   Options.get(i).click();
        	}
        }
        */
        // select multiple drop down like java and python
        /*
        for(int i = 0;i<Options.size();i++)
        {
        	String option = Options.get(i).getText();
        	if(option.equals("Java") || option.equals("Python"))
        	{
        		Options.get(i).click();
        	}
        }
        */
        
        // using each loop
        
        for(WebElement option:Options)
        {
        	String text = option.getText();
        	if(text.equals("MySQL") || text.equals("C#"))
        	{
        		option.click();
        	}
        }
        
        
        
        
        
        
        
		
		
		
		
		
		
	}

}

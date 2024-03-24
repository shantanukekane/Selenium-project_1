package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handledropdown_without_select_tag {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =  new ChromeDriver();
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open url or application
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		driver.manage().window().maximize();
		
		
		//finding the drop down element in the web page
		driver.findElement(By.xpath("//div[contains(@class,'information')]/following::select"));
		
		// Total Number of options in the drop down
	    List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'information')]/following::*/option"));
		System.out.println("Total Number of option in drop down: "+options.size());
	    
	    // select the option in the drop down using for loop
		/*
		for(int i = 0;i<options.size();i++)
		{
			if(options.get(i).getText().equals("India"))
			{
				options.get(i).click();
			}
			
		}
		
		*/
		
		// select the options using the each loop
		for(WebElement option:options)
		{
			String text = option.getText();
			if(text.equals("Australia"))
			{
			   option.click();
			}
		}
		
		
		
		
		
		
		
		
		

	}

}

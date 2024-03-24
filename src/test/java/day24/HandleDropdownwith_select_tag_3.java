package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdownwith_select_tag_3 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// declaration of implicit wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//open url or application
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		driver.manage().window().maximize();
		
		
		// finding the  drop down element from the web page and store in the webelement variable 
	    WebElement drop_down_countries = driver.findElement(By.xpath("//div[@class = 'information closable']/following::p/select"));
		
	    // selecting the drop down option by using select class
	    
	    Select Dp_countries = new Select(drop_down_countries);
	    
	    // 1) selecting the option from the drop down
	    Dp_countries.selectByVisibleText("India");  // we can select only one option at a time 
	    
	    
	    // 1) selecting the option from the drop down using selectByvalue
	    
	    //Dp_countries.selectByValue("BHS");  // if value attribute avaliable in the HTML
	    
	    // 1) selecting the option from the drop down using selectByvalue
	    
	    //Dp_countries.selectByIndex(3);
	    
	    
        // 2) total Number of drop down in current web page
	    List<WebElement> options = Dp_countries.getOptions();
	    System.out.println("Total Number of Drop down: "+options.size());
	    
	    // 3) printing all the options from the drop down
	    
	    for(int i = 0;i<options.size();i++)
	    {
	        System.out.println(options.get(i).getText());
	    }
	    
	    // using the each loop or enhance loop
	    
	    
	    for(WebElement option:options)
	    {
	    	option.getText();
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}

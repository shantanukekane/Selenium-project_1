package day24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown_select_tag {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		;
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		driver.manage().window().maximize();
		
		// finding the  drop down element from the web page and store in the webelement variable 
	    WebElement Drop_down_countries = driver.findElement(By.xpath("//div[@class='information closable']/following::*/select"));
		
		// create an object for the select tag using the Select class
	    
	    Select Dd_countries = new Select(Drop_down_countries);
	    
	    // 1) selecting the options from drop down
	    
	   Dd_countries.selectByVisibleText("Australia");
	    
	    //Dd_countries.selectByVisibleText("India");
	      
	    // OR //
	    
	    // 1) selecting the Options by Using the value attribute 
	    //Dd_countries.selectByValue("IND");
	    
	    // 1) selecting the options by using index as well if index is Avaliable
	   // Dd_countries.selectByIndex(3) 
	    
	    
	    // 2) Total Number of options in the drop down
	    
	    List<WebElement> Options = Dd_countries.getOptions();
	    System.out.println("Total Number of Options in the Drop Down "+Options.size());
	    
	    
	    // 3) Printing all the options in console window
	    /*/
	    for(int i = 0;i<Options.size();i++)
	    {
	    	
	         System.out.println(Options.get(i).getText()); // get(i) methods gives you the webelements such first Webelement,second
	                                                       // getText()  gets the all the text inside the webelements
	    }   
	    */
	    // same thing we are doing with the help of each for loop or Enhance for loop
	    for(WebElement Opt:Options)
	    {
	         System.out.println(Opt.getText());
	    }
	   
	    
	    
	    

	}

}

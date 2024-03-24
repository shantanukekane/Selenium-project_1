package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handledropdown_without_select_class {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		driver.manage().window().maximize();
		
		// locating  the drop down element
		
		driver.findElement(By.xpath("//div[@class = 'information closable']/following::*/select"));		
		
	    // total Number of countries in the drop down 
	    List<WebElement> Dd_countries =  driver.findElements(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//option"));
		System.out.println("Total Number of Drop Down countries: "+Dd_countries.size());
		
		
		// print all drop down countries in console window
		/*
		for(int i=0;i<Dd_countries.size();i++)
		{
			    String option = Dd_countries.get(i).getText();
			    if(option.equals("Argentina"))
			    {
			    	Dd_countries.get(i).click();
			    }
		}
		*/
		
		// using Enhance for loop
		
		for(WebElement Dropdown:Dd_countries)
		{
			if(Dropdown.getText().equals("India"))
			{
				Dropdown.click();
			}
		}

		
		
		
		
	}



}

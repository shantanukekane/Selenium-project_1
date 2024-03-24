package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		driver.manage().window().maximize();
		
		// finding the element an store in webelement variable
	    WebElement DpcountryElem = driver.findElement(By.xpath("//div[@class = 'information closable']/following::*/select"));
		
		// create a Select object for the select tag 
		
		Select Drop_down = new Select(DpcountryElem);
		
		// 1) you just simply specified the name inside the drop down
		
		//Drop_down.selectByVisibleText("India");
		
		Thread.sleep(5000);
		
		//Drop_down.selectByValue("MLI"); // we can use this method if value if avaliable in Options
		
		// or we can use the index method as well
		
		//Drop_down.deselectByIndex(3);  // possible if less number of values
		
		
		// 2) Total Number of Options in the drop downs
		  
		List<WebElement> Options = Drop_down.getOptions();
		
		System.out.println("Total Number of Options: "+Options.size());
		
		//3) printing all options in console window
		
		for(int i = 0;i<Options.size();i++)
		{
			System.out.println(Options.get(i).getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

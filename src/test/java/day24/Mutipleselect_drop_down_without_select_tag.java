package day24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.main.Option;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mutipleselect_drop_down_without_select_tag {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// open url 
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		
		// finding the element in the web page
		//driver.findElement(By.xpath("//div[contains(@class,'btn-group')]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		// Total Number of element in the web page
		
	    List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Total Number of options in the drop down: "+options.size());
		
	    // selecting the multiple option in the drop down
		
		for(int i = 0;i<options.size();i++)
		{
			String text = options.get(i).getText();
			if(text.equals("Python") || text.equals("MySQL"))
			{
				options.get(i).click();
			}
		}
			
		
		/*
		
		for(WebElement option : options)
		{
			if(option.getText().equals("Java"))
			{
				option.click();
			}
		}
		
		*/
		
	    	
		
		

	}

}

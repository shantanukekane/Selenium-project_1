package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatordemo_3 {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		
		  WebDriver driver = new ChromeDriver();

		  // open browser
		  
		  driver.get("http://www.automationpractice.pl/index.php");
		  driver.manage().window().maximize();
		  
		  // Find Number of sliders on home page
		  
          List<WebElement> sliders = driver.findElements(By.className("homeslider-container"));
		  System.out.println("Number of sliders: "+sliders.size());
		  
		
		  // Find the Number of Images on the home page
		  
	      List<WebElement> images =  driver.findElements(By.tagName("img"));
		  System.out.println("Number of Images: "+images.size());
		  
		  
		  // Find the Number of Links on the Home page
		  
	      List<WebElement> links =  driver.findElements(By.tagName("a"));
	      System.out.println("Number of Links: "+links.size());
		   
	      
	     // Find the Number of input Box or input text on the home page 
	      List<WebElement> input_box = driver.findElements(By.tagName("input"));
	      System.out.println("Number of input box: "+input_box.size());
		  
		  //driver.quit();

	}

}

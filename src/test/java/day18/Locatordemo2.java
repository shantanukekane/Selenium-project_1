package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatordemo2 {

	public static void main(String[] args) {
	
		//WebDriverManager.chromedriver().setup();
		
		//1) Launch browser
		// First create an object for the browsers through which we can identify the web element 
		// using different method
				
		WebDriver driver = new ChromeDriver();
				
		//2) Open application or URL
		driver.get("http://www.automationpractice.pl/index.php");
		//driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();// maximize browser window
				
		// Finding number of Slider on homepage		
		List<WebElement> sliders = driver.findElements(By.className("homeslider-container"));
		System.out.println("Number of sliders: "+sliders.size());	
				
		// FInd Number of Images on Homepage
        List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total Number of images: "+images.size());
	
		// Find the total Number of Links
        List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of links: "+links.size());
		
		
		// close page
		//driver.quit();
		
	}

}

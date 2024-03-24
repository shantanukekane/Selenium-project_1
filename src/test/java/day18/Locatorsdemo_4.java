package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatorsdemo_4 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		// Launch Browser
		WebDriver driver = new ChromeDriver();
		
		
		// Open URL OR Application
		
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// Search text box
		
		//driver.findElement(By.id("search_query_top")).sendKeys("T-shirt");
		
		// search button
		
		//driver.findElement(By.name("submit_search")).click();
		
		// search sort by box
		//driver.findElement(By.id("selectProductSort")).click();
		
		
		// select category women by using linkText
		
		//driver.findElement(By.linkText("Women")).click();
		
		// Link text 
		
		//driver.findElement(By.linkText("Printed Dress")).click();
		
		// partial Link text
		
		//driver.findElement(By.partialLinkText("Printed")).click();
		
		//driver.findElement(By.partialLinkText("Dress")).click();
		
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		
		//driver.findElement(By.partialLinkText("Printed Chiffon")).click();
		
		
		// find the multiple elements
		
        List<WebElement> sliders =	driver.findElements(By.className("homeslider-container"));
		System.out.println("Number of sliders: "+sliders.size());
	
        //find the total Number of images on homepage
		
	    List<WebElement> images = driver.findElements(By.tagName("img"));
	    System.out.println("Number of images: "+images.size());
	    Thread.sleep(5000);
		
	    //Find the total number links present in the homepage
	    
        List<WebElement> links =  driver.findElements(By.tagName("a"));
	    System.out.println("Total Number of links: "+links.size());
	    
	    
	    
		// search women category 
		
		//driver.findElement(By.linkText("Women")).click();
		//Thread.sleep(2000);
		
		// find the total number of images on women category
	    
		//List<WebElement> women_img = driver.findElements(By.tagName("img"));
		//System.out.println("Total images on women category: "+women_img.size());
		
		
		
		
		
		

	}

}

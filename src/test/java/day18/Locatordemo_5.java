package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatordemo_5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		// Open URL or application
		
		driver.get("http://www.automationpractice.pl/index.php");
		Thread.sleep(5000);
		driver.manage().window().maximize();
	
		
		
		/*
		// search contact us link
        String	act_text = driver.findElement(By.linkText("Contact us")).getText();
        String exp_text = "Contact us";
 
        if(act_text.equals(exp_text))
        {
	        System.out.println("Test passed");
        }
       else
        {
	        System.out.println("Test Failed");
        }
		
		

		// search inbox
		
		driver.findElement(By.name("search_query")).sendKeys("T-shirts");
		
		// submit search button
		
		driver.findElement(By.name("submit_search")).click();
		
		//Thread.sleep(5000);
		// search selectProductSort
		//driver.findElement(By.id("selectProductSort")).click();
		
		
		// linked text
		
		//driver.findElement(By.linkText("Women")).click();
		//Thread.sleep(3000);
		
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();		
		
		*/
	    
		// now using the tagname and classname
		// I want to find the Number of images
		
        List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Number of images: "+images.size());
		
		// want to find the number of inputs
		
	    List<WebElement> input_box = driver.findElements(By.tagName("input"));
		System.out.println("Number of inputs: "+input_box.size());
		
		
		// Total number of links
		
	    List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links: "+links.size());
		
		// Number of sliders
		
        List<WebElement> slider = driver.findElements(By.className("homeslider-container"));
		System.out.println("Number of sliders: "+slider.size());
		
		
		
		
	}

}

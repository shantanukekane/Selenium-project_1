package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderClickdemo_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
	    Actions act = new Actions(driver);
	    
	    WebElement min_slider =  driver.findElement(By.xpath("//span[1]"));
	    System.out.println("current location of min slider: "+min_slider.getLocation());  // (59,250)
	    
	    
	    WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
	    System.out.println("current location of max slider: "+max_slider.getLocation()); // (544,250)
	    
	    
	    act.dragAndDropBy(min_slider, 141, 250).perform();
	    System.out.println("Location of after moving the min slider: "+min_slider.getLocation()); // (200,250)
	    
	    
	    
	    act.dragAndDropBy(max_slider, -144, 250).perform();
	    System.out.println("Location of after moving the max slider: "+max_slider.getLocation()); // (399,250)
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

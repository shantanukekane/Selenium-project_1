package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider_Element_Demo_1 {

	public static void main(String[] args) {
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement min_slider = driver.findElement(By.xpath("//span[1]"));
		System.out.println("Current Location of min slider is: "+min_slider.getLocation());  // (59,250)
		
		
		act.dragAndDropBy(min_slider, 100, 250).perform();
		System.out.println("Location of min slider after moving: "+min_slider.getLocation());  // (161,250)
		
		act.dragAndDropBy(min_slider, 130, 250).perform();
		System.out.println("Location of min slider after slide moving: "+min_slider.getLocation()); //(292,250)
		
		// maximum slider
		
		WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
		System.out.println("current location of max slider: "+max_slider.getLocation());  // (544,250)
		
		act.dragAndDropBy(max_slider, -100, 250).perform();
		System.out.println("Location of max slider after moving: "+max_slider.getLocation());  // (442,250)
		
		
		act.dragAndDropBy(max_slider, -50, 250).perform();
		System.out.println("Location of max slider after moving: "+max_slider.getLocation());  // (242,250)
		
		
		
		

	}

}

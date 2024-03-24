package day26;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleInnerFrame_demo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		// declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open the url or application
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		
		// switching to the first frame 1 using webelement  if name/id attribute is not present
		// Frame 1
	    WebElement frm1 =	driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	    driver.switchTo().frame(frm1);
	    
		driver.findElement(By.xpath("//input[@name = 'mytext1']")).sendKeys("1111");
		
		
		// before going to second frame we need to go back to main page
		driver.switchTo().defaultContent();
		
		// switching to second frame using webelement
		// Frame 2
	    WebElement frm2 = driver.findElement(By.xpath("//frame[@src = 'frame_2.html']"));
		driver.switchTo().frame(frm2);
		
		driver.findElement(By.xpath("//input[@name = 'mytext2']")).sendKeys("22222");
		
		// before going to the third frame switch back to the main page
		
		driver.switchTo().defaultContent();
		// Frame 3
	    WebElement frm3 = driver.findElement(By.xpath("//frame[@src = 'frame_3.html']"));
		driver.switchTo().frame(frm3);
		
		driver.findElement(By.xpath("//input[@name = 'mytext3']")).sendKeys("33333");
		
		// inner frame of frame_3
		// switching to the iframe 
		driver.switchTo().frame(0); // if there is only one iframe we use index
		
		driver.findElement(By.cssSelector("div.AB7Lab")).click();
		driver.findElement(By.xpath("//span[text() = 'Clear selection']")).click();
	    
		// Before going to fourth frame we again Switch to main page
		driver.switchTo().defaultContent();
	    // frame 4
	    
	    WebElement frm4 = driver.findElement(By.xpath("//frame[@src = 'frame_4.html']"));
		driver.switchTo().frame(frm4);
		
		driver.findElement(By.xpath("//input[@name = 'mytext4']")).sendKeys("44444");
		
		
		// Before going to fifth frame we switch to main page
		driver.switchTo().defaultContent();
		// frame 5
		WebElement frm5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frm5);
		
		driver.findElement(By.xpath("//input[@name = 'mytext5']")).sendKeys("55555");
		
		
	}

}

package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleInnerFrame_demo_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    // Open url or applications
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		
		// switching to the first frame using webElement if name/id attribute is not present
		
	    WebElement frm1 = driver.findElement(By.xpath("//frame[@src = 'frame_1.html']"));
		driver.switchTo().frame(frm1);
		
		// we performing the task on frame 1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("11111");
		
		
		// before going to the second frame we switched to the main page
		driver.switchTo().defaultContent();
		
		// switching to the second frame 2 using webElement if name/id attributes is not present
		
	    WebElement frm2 = driver.findElement(By.xpath("//frame[@src = 'frame_2.html']"));
		driver.switchTo().frame(frm2);
		
		// switch to the second frame to perform operation
		// frame 2
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("22222");
		
		
		// Before going to the Third frame we Switched to the main page
		driver.switchTo().defaultContent();
		
		//frame 3
	    WebElement frm3 = driver.findElement(By.xpath("//frame[@src = 'frame_3.html']"));
		driver.switchTo().frame(frm3);
		
		// switch to the third frame to perform operation
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("33333");
	
		
		// Inner frame of Frame 3
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("div.AB7Lab")).click();
		
		driver.findElement(By.xpath("//span[text() = 'Clear selection']")).click();
		
		
		//Before going to the Fourth Frame we switched to the main page
		driver.switchTo().defaultContent();
		
		// frame 4
		WebElement frm4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frm4);
		
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("44444");
		
		//Before going to the fifth frame we switched to the main page
		driver.switchTo().defaultContent();
		
		// frame 5
	    WebElement frm5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frm5);
		
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("55555");
		
	
	}

}

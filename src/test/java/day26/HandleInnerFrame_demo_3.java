package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleInnerFrame_demo_3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//declare implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// open url
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		// switching to the frame 1 in the web page by using webelement
	    WebElement	frm1 = driver.findElement(By.xpath("//frame[@src = 'frame_1.html']"));
		driver.switchTo().frame(frm1);
		// frame 1
		driver.findElement(By.xpath("//input[@name = 'mytext1']")).sendKeys("11111");
		
		
		// Before going to the frame 2 we switched to the main page
		driver.switchTo().defaultContent();
		
		// switching to the frame 2
	    WebElement frm2 = driver.findElement(By.xpath("//frame[@src = 'frame_2.html']"));
		driver.switchTo().frame(frm2);
		// frame 2
		driver.findElement(By.xpath("//input[@name = 'mytext2']")).sendKeys("22222");
		
		// Before going to the frame 3 we switched to the main page
		driver.switchTo().defaultContent();
		
		// switch to the frame 3
	    WebElement frm3 = driver.findElement(By.xpath("//frame[@src = 'frame_3.html']"));
		driver.switchTo().frame(frm3);
		// frame 3
		driver.findElement(By.xpath("//input[@name = 'mytext3']")).sendKeys("33333");
		
		// inner frame 
		// switching to the inner frame using index concept
		driver.switchTo().frame(0);
		
		// innerframe 3
		driver.findElement(By.xpath("//div[contains(@class,'uHMk6b')]")).click();
		
		
		// Before going to frame 4 we switch to the main page
		
		driver.switchTo().defaultContent();
		//frame 4
		
		WebElement frm4 = driver.findElement(By.xpath("//frame[@src = 'frame_4.html']"));
		driver.switchTo().frame(frm4);
		
		driver.findElement(By.xpath("//input[@name = 'mytext4']")).sendKeys("44444");
		
		
		//Before going to the frame 5 we switched to the main page
		
		driver.switchTo().defaultContent();
		
		// frame 5
	    WebElement frm5 = driver.findElement(By.xpath("//frame[@src = 'frame_5.html']"));
		driver.switchTo().frame(frm5);
		
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("55555");
		
		
		
		
		
		

	}

}

package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrameDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.javadoc.io/doc/org.seleniumhq.selenium/selenium-api/3.141.59/index.html");
		driver.manage().window().maximize();
		
		// we are switching into the frame using webelement 
	    WebElement frm1 = driver.findElement(By.xpath("//iframe[@class='content']"));
		driver.switchTo().frame(frm1);
		
		// after switching to the frame we perform click operation 
		//driver.switchTo().frame("packageListFrame");   // first frame 
		driver.findElement(By.linkText("org.openqa.selenium")).click();  // frame 1
		

		//again switching back to default main page
	
		driver.switchTo().defaultContent();  // switch to back to page
		
		// again coming to the second frame and perform operation
		driver.switchTo().frame("packageFrame");  // second frame
		driver.findElement(By.linkText("WebDriver")).click();         // frame 2
		
		// switch to default page or main page
        driver.switchTo().defaultContent();
		
        //
		driver.switchTo().frame("classFrame");   // Third frame
		driver.findElement(By.xpath("//frame[@title='Package, class and interface descriptions']")).click();   // frame 3
		
		
		

	}

}

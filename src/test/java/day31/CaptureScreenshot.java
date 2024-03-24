package day31;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//Declaration of Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open URL
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
	    
		// capture the full screeshot of the page
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		// we create a reference variable this variable capture the screen shot and store in a memory 
		// source file
		File scr = ts.getScreenshotAs(OutputType.FILE);
		// we have to get the screenshot in our location in the target location
		// target file
		File trg = new File("C:\\Users\\ASUS\\Desktop\\Javacorerevised\\seleniumproject_1\\Screeshots\\fullpage.png");
		
		
		FileUtils.copyFile(scr, trg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

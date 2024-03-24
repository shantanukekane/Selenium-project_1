package day31;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot_1 {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// capture the screenshot of specific area we don't require any TakesScreeshot interface 
		// we can directly use the webElement 
		/*
	    WebElement featureproduct =	driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));

	    File scr = featureproduct.getScreenshotAs(OutputType.FILE);
	    File trg = new File("C:\\Users\\ASUS\\Desktop\\Javacorerevised\\seleniumproject_1\\Screeshots\\featureproduct.png");
	    
	    FileUtils.copyFile(scr, trg);
	    
	    */
		/*
	    // capture the screen shot of the logo Element 
	    
	    WebElement logo = driver.findElement(By.xpath("//div[@class='header-logo']"));
	    File scrlogo = logo.getScreenshotAs(OutputType.FILE);
	    File trglogo = new File("C:\\Users\\ASUS\\Desktop\\Javacorerevised\\seleniumproject_1\\Screeshots\\header_logo.png");
	    
	    FileUtils.copyFile(scrlogo, trglogo);
	
		*/

		// capture the screenshot of the specific  Element search items
		
		WebElement searchinbox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	    File search_scr = searchinbox.getScreenshotAs(OutputType.FILE);
		File search_trg = new File("C:\\Users\\ASUS\\Desktop\\Javacorerevised\\seleniumproject_1\\Screeshots\\search_inbox.png");
		
		FileUtils.copyFile(search_scr, search_trg);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

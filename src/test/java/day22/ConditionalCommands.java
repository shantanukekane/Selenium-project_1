package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommands {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		// Launch Browsers
		WebDriver driver = new ChromeDriver();
		
		
		// Open URL or application
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		// validate the logo of the web page 
		// isDisplayed() and isEnabled()
		
	    //WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("Display Status of logo: "+logo.isDisplayed());  // these method returns true if logo is displayed 
		                                                                    // and its returns false if logo is not displayed
		
	    //boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println(status);
	    
	    //WebElement searchbox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		//System.out.println("Display logo status: "+searchbox.isDisplayed());
		//System.out.println("Display searchbox: "+searchbox.isEnabled());
		
		
		
		//isSelected method
		
	    WebElement male_rd = driver.findElement(By.xpath("//input[@id = 'gender-male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id = 'gender-female']"));
		
		// Before Selection
		System.out.println("Before Selection of radio button.........");
		System.out.println(male_rd.isSelected());  // false
		System.out.println(female_rd.isSelected()); // false
		
		// after selection of male radio button
		
		System.out.println("After selection of male radio button......");
		male_rd.click();
		System.out.println(male_rd.isSelected());  // true
		System.out.println(female_rd.isSelected()); // false
		
		// after selection of female radio button
		
		System.out.println("after selection of female radio button.....");
		female_rd.click();
		System.out.println(male_rd.isSelected());  // false
		System.out.println(female_rd.isSelected()); // true
		
		
		
		
		
		
		
		
		
		
		
		
		
		// close browser
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

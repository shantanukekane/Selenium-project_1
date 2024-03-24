package assignment_end_to_end_test_script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_drag_drop {

	public static void main(String[] args) {
	
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		// dabit side
		WebElement Bank = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement Debit_placeholder = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		
		WebElement Dabit_amount = driver.findElement(By.xpath("//div[@class = 'ui-widget-content']//li[2]/a"));
		WebElement amount_placeholder_1 = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		
		// Credit side 
		WebElement Sales = driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		WebElement Credit_placeholder = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));

		WebElement Credit_amount = driver.findElement(By.xpath("//div[@class = 'ui-widget-content']//li[4]/a"));
		WebElement amount_placeholder_2 = driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
		
		
		
		act.dragAndDrop(Bank, Debit_placeholder).perform();
		act.dragAndDrop(Dabit_amount, amount_placeholder_1).perform();
		act.dragAndDrop(Sales, Credit_placeholder).perform();
		act.dragAndDrop(Credit_amount, amount_placeholder_2).perform();
		
	    // validation part
	    String result = driver.findElement(By.xpath("//div[@class = 'table4_result']/a")).getText();
		
	    if(result.equals("Perfect!"))
	    {
	    	System.out.println("Successfully drag & drop the elements");
	    }
	    else
	    {
	    	System.out.println("Failed to drag & drop the elements");
	    }
		
	    
	    
	    
		
		
		
		

	}

}

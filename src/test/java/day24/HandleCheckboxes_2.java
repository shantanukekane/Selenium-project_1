package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckboxes_2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// open URL or application
		
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		
		// select single check box
		//driver.findElement(By.xpath("//input[@id = 'monday']")).click();
		
		// Total Number of check boxes to be selected
		
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class = 'form-check-input'][@type = 'checkbox']"));
		System.out.println("Total Number of checkboxes: "+checkboxes.size());
		
		/*
		
		// select all the checkboxes individual is not possible , its possible its a tedious process
		for(int i = 0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(4000);
		// using the enhance loop
		
		for( WebElement chboxes:checkboxes)
		{
			
			 chboxes.click();
		}
		
		
		// first two checkboxes will be selected
		
		for(int i = 0;i<checkboxes.size();i++)
		{
			if(i<2)
			{
				checkboxes.get(i).click();
			}
		}
		*/
		/*
		//select last two checkboxs
		// Total number of checkbox - how many checkbox to be selected = staring point
		 // 7 - 2 = 5;
		for(int i = 5;i<checkboxes.size();i++)
		{
			
			checkboxes.get(i).click();
			
		}
		
		
		
		// select all check boxes Except 2 and 4 
		
		for(int i=0;i<checkboxes.size();i++)
		{
			if(i==2)
				continue;
			if(i==4)
			    continue;
			checkboxes.get(i).click();
		}
		*/
		// select all the check boxes and unselect them immediately
		
		for(int i = 0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();   // get(i) is the calling the each and every checkboxes one by one 
		}                                // then use click method to click the check boxes
		Thread.sleep(3000);
		
		for(int i = 0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

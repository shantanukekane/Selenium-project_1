package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlecheckboxes_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//Declaration of implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Open URL or application
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
        driver.manage().window().maximize();
        
        
		// select only one check box i.e monday
        
        //driver.findElement(By.xpath("//input[@id='monday']")).click();
        
        //Total number of checkbox
        
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class = 'form-check-input' and @type ='checkbox']"));
        System.out.println("Total Number of checkbox: "+checkboxes.size());
        
        
        // selecting all the checkboxes using for loop
        /*
        for(int i = 0;i<checkboxes.size();i++)
        {
        	checkboxes.get(i).click();
        }
        
       // selecting all the checkboxes using for loop using Enhance for loop
        for(WebElement chboxes:checkboxes)
        {
        	chboxes.click();
        }
        
        
        
        // select first five check boxes using for loop
        
        for(int i = 0;i<5;i++)
        {
        	checkboxes.get(i).click();
        }
        
        // first we get all the checkboxes who are selected and then unselect them 
        for(int i = 0;i<checkboxes.size();i++)
        {
        	if(checkboxes.get(i).isSelected())
        	{
        		if(i<3)
        		{
        			checkboxes.get(i).click();  // only first three to be unchecked remaining two is still checked or clicked
        		}
        	}
        }
        */
        /*
        // first three check boxes are selected
        
        for(int i = 0;i<checkboxes.size();i++)
        {
        	if(i==3)
        	  break;
        	checkboxes.get(i).click();
        }
        
        */
        // last three checkboxes will selected 
 
        /*
        for(int i = 4;i<checkboxes.size();i++)
        {
        	checkboxes.get(i).click();
        }
        
        */
        /*
        for(int i=0;i<checkboxes.size();i++)
        {
        	if(i==3)
        		break;
        	checkboxes.get(i).click();
        }
        */
        
        
        // select all Except 1 and 6 checkboxes
        /*
        for(int i=0;i<checkboxes.size();i++)
        {
        	if(i == 1)   // 
        	  continue;
        	if(i == 6)
        	  continue;
        	checkboxes.get(i).click();
        }
        
        */
        /*
        
        //  select all Except 3rd and 5th checkboxes
        
        for(int i = 0;i<checkboxes.size();i++)
        {
        	if(i==3)           // select everything except 1 checkbox
        		continue;
        	if(i==5)           // similar to 6
        		continue;
        	checkboxes.get(i).click();
        }
        
        /*
        
        // select all the check boxes using for loop statement
        
        for(int i = 0;i<checkboxes.size();i++)
        {
        	checkboxes.get(i).click();
        }
        // we just repeat the for loop
        // unselect all the check boxes using for loop statemente
        
        for(int i = 0;i<checkboxes.size();i++)
        {
        	checkboxes.get(i).click();
        }
        */
        /*
        // first select first three checkboxes
        for(int i = 0;i<3;i++)
        {
        	checkboxes.get(i).click();
        }
        
        Thread.sleep(4000);
        // uncheck or unselect only these three
        
        for(int i = 0;i<checkboxes.size();i++)
        {
        	if(checkboxes.get(i).isSelected())   
        	{
        		checkboxes.get(i).click();
        	}
        }
        
        */
        
        // select last three checkboxes 
        // total checkboxes in the web page - how many checkbox to be selected = staring index
        // 7 - 3 = 4
        
        for(int i = 4;i<checkboxes.size();i++)
        {
        	checkboxes.get(i).click();
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        // select first two check boxes using for loop
        
        for(int i = 0;i<2;i++)
        {
            checkboxes.get(i).click();
        }
        
        Thread.sleep(3000);
        // if it is selected then i wanted to unselect them that is the operation we perform here
        for(int i = 0;i<checkboxes.size();i++)
        {
        	if(checkboxes.get(i).isSelected())
        	{
        		checkboxes.get(i).click();
        	}
        }
        
        /*
        for(int i = 0;i<checkboxes.size();i++)
        {
        	if(i<2)
        	{
        		checkboxes.get(i).click();
        	}
        }
        */
        
        
        
        
        
        
        
        
        
		
		
		

	}

}

package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Open the url or applications
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		driver.manage().window().maximize();
		
		// select single check box e.g monday
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		
		// total number of check box
		
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class = 'form-check-input'][@type = 'checkbox']"));
		System.out.println("Total number of checkboxes: "+checkboxes.size());
		
		// select all the checkboxes
		/*
		for(int i = 0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();   // for array we used checkboxes[i]
		                                // list is a collection, array is not a collection,array has fixed in sized
		
		} 
		
		// using ehnance for loop or advance loop
		for(WebElement chboxes:checkboxes)
		{
			chboxes.click();
		}
		*/
		
		
		// select last two check boxes
		// total number of checkboxes - how many checkboxes to be selected = starting index
		// 7 - 2 = 5 (starting Index)
		/*
		for(int i = 5;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		*/
		// select first two check boxes
		/*
		for(int i = 0;i<2;i++)
		{
			checkboxes.get(i).click();
		}
		
		
		for(int i = 2;i<5;i++)
		{
			checkboxes.get(i).click();
		}
		
		
		
		// selecting first five check boxes
		for(int i = 0;i<checkboxes.size();i++)
		{
			if(i==5)  // or i<5 // condition to get first five checkboxes 
			break;
			checkboxes.get(i).click();
			
		}
		
		// selecting only first five elements checkboxes
		for(int i = 0;i<checkboxes.size();i++)
		{
			if(i<5)
			{
			    checkboxes.get(i).click();
			}
		}
		
		
		
		
		/*
		// select all checkboxes except 3rd and 5th checkboxes
		
		for(int i = 0;i<checkboxes.size();i++)
		{
			if(i==3)      // select all Except 3rd checkbox
			   continue;
			if(i==5)      // select all Except 5th checkbox
			   continue;
			checkboxes.get(i).click();
		}
		
		
		/*
		
		// select all checkboxes , first for loop statement select all checkboxes
		for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		// unselect all checkboxes, second for loop unselect all the checkboxes
		
		for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		*/
		
		
		/*
		
		// select only first three checkboxes and only those checkboxes are unselect by using for loop
		
		for(int i = 0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(4000);
		
		for(int i = 0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected()) 
			{
				checkboxes.get(i).click();
			}
		}
		
		*/
		/*
		// select first five checkboxes and again these checkboxes are unselect by using for loop

		for(int i = 0;i<5;i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(4000);
		
		for(int i = 0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())   // if these condition is true then it will execute the below statement
			{
			   checkboxes.get(i).click();
			}
		}
		
		
		//  using enhance loop for, to get the first five elements checked them 
		
		for(int i=0;i<5;i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(5000);
		/*
		
		for(int i = 0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				if(i==4)
				   break;
				checkboxes.get(i).click();
			}
		}
		*/
		// using Enhance for loop
		
		for(int i = 0;i<4;i++)
		{
			checkboxes.get(i).click();
		}
		
		for(WebElement chboxes:checkboxes)
		{
			if(chboxes.isSelected())
			{
				chboxes.click();
			}
		}
		
		
		
		
		
		
		/*
		// using enhance for loop
		
		for(int i = 0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(3000);
		
		for(WebElement chboxes : checkboxes)
		{
			if(chboxes.isSelected())  // if condition is true then it will perform the unselect uncheck operation
			{
			    chboxes.click();  // if checkbox is selected then it will unselect the checkbox
			}
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

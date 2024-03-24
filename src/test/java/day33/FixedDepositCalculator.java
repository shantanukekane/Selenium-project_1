package day33;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FixedDepositCalculator {

	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();		
		
		String file = System.getProperty("user.dir")+"\\testdata\\calcu_data.xlsx";
		
		int rows = ExcelUtils.getRowCount(file, "sheet1");
		
		for(int r = 1;r<=rows;r++)
		{
		 //1) Read data from the Excel
			
		 String princ =	ExcelUtils.getCellData(file, "Sheet1", r, 0);
	     String rate_of_int = ExcelUtils.getCellData(file, "Sheet1", r, 1);
	     String per1 = ExcelUtils.getCellData(file, "Sheet1", r, 2);
	     String per2 = ExcelUtils.getCellData(file, "Sheet1", r, 3);
	     String freq = ExcelUtils.getCellData(file, "Sheet1", r, 4);
	     String exp_mvalue = ExcelUtils.getCellData(file, "Sheet1", r, 5);
	     
	     //2) Passing the data into the application
	     
	     driver.findElement(By.id("principal")).sendKeys(princ);
	     
	     driver.findElement(By.id("interest")).sendKeys(rate_of_int);
	     
	     driver.findElement(By.id("tenure")).sendKeys(per1);
	     
	     // Element period is a drop down we have to create a select class
	     
	     Select perdrp = new Select(driver.findElement(By.id("tenurePeriod")));
	     perdrp.selectByVisibleText(per2);
	     
	     
	     Select fredrp = new Select(driver.findElement(By.id("frequency")));
	     fredrp.selectByVisibleText(freq);
	     
	     // click on calculate button
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     WebElement calcu_button = driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']"));
	     js.executeScript("arguments[0].click();", calcu_button);
	     
	     // 3) validation and update the data into the Excel file
	     
	    String act_mvalue =  driver.findElement(By.xpath("//span[@class = 'gL_27']/strong")).getText();
	    
	    if(Double.parseDouble(act_mvalue) == Double.parseDouble(exp_mvalue))
	    {
	    	
	    	System.out.println("Test Passed");
	    	ExcelUtils.setCellData(file, "Sheet1", r, 7,"Passed");
	    	ExcelUtils.fillGreenColor(file, "Sheet1", r, 7);
	    	
	    }
	    else
	    {
	    	System.out.println("Test Failed");
	    	ExcelUtils.setCellData(file, "Sheet1", r, 7,"Failed");
	    	ExcelUtils.fillRedColor(file, "Sheet1", r, 7);
	    	
	    }
	    
	     WebElement clear_button = driver.findElement(By.xpath("//img[@class='PL5']"));
		js.executeScript("arguments[0].click();", clear_button);
			
			
		}
		
		

	}

	
		
	}


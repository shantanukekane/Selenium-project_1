package day33;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CTbank_cal_data_driven_test {

	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		
		
		
		String file = System.getProperty("user.dir")+"\\testdata\\caldata2.xlsx";
		
		int row = ExcelUtils.getRowCount(file, "Sheet1");
		
		
	    for(int r = 1;r<=row;r++)
	    {
	     //1) read the data from the Excel
	    	
	     String	Id_amt = ExcelUtils.getCellData(file, "Sheet1", r, 0);
	     String int_rate = ExcelUtils.getCellData(file, "Sheet1", r, 1);
	     String length = ExcelUtils.getCellData(file, "Sheet1", r, 2);
	     String compound = ExcelUtils.getCellData(file, "Sheet1", r, 3);
	     String Exp_total = ExcelUtils.getCellData(file, "Sheet1", r, 4);
	     
	     //2) pass the data into the application
	     
	      
	     WebElement inideposit_amt = driver.findElement(By.id("mat-input-0"));
	     inideposit_amt.clear();    
	     inideposit_amt.sendKeys(Id_amt);

         WebElement length_CD = driver.findElement(By.id("mat-input-1"));
	     length_CD.clear();
	     length_CD.sendKeys(length);
	     
	     WebElement interest_rate = driver.findElement(By.id("mat-input-2"));
	     interest_rate.clear();
         interest_rate.sendKeys(int_rate);

 
         WebElement compound_drp = driver.findElement(By.xpath("//div[@class='mat-select-trigger ng-tns-c109-4']"));
	     compound_drp.click();
             
         // Total Number of options
         
	     List<WebElement> options=driver.findElements(By.xpath("//div[@id='mat-select-0-panel']//mat-option"));
			
			for(WebElement option:options)
			{
				if(option.getText().equals(compound))
				{
					option.click();
				}
			}

	     
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     WebElement button = driver.findElement(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']"));
	     js.executeScript("arguments[0].click();", button);
	     
	    
	      //3) validation and update result in the Excel sheet
	      // Read the data in the specific table
	     
	    String act_total =  driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
	     
	    
	       if(act_total.equals(Exp_total))
	       {
	    	   System.out.println("Test passed");
	    	   ExcelUtils.setCellData(file, "Sheet1", r, 6,"Passed");
	    	   ExcelUtils.fillGreenColor(file, "Sheet1", r, 6);
	       }
	       else
	       {
	    	   System.out.println("Test failed");
	    	   ExcelUtils.setCellData(file, "Sheet1", r, 6,"failed");
	    	   ExcelUtils.fillRedColor(file, "Sheet1", r, 6);
	       }
	    	    	
	    }
		
	  	
	

		

	}

}

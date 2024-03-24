package day33;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fixed_deposite_calculator {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		// locate the Excel file 
		
		String file = System.getProperty("user.dir")+"\\testdata\\calfix_data.xlsx";
		
	    int rows = ExcelUtils.getRowCount(file, "Sheet1");
		
		
	    for(int r = 1;r<=rows;r++)
	    {
	    // 1) Read data from the Excel sheet 
	    	
	    String princ = ExcelUtils.getCellData(file, "Sheet1", r, 0);
	    String r_o_i = ExcelUtils.getCellData(file, "Sheet1", r, 1);
	    String per1 = ExcelUtils.getCellData(file, "Sheet1", r, 2);
	    String per2 = ExcelUtils.getCellData(file, "Sheet1", r, 3);
	    String freq = ExcelUtils.getCellData(file, "Sheet1", r, 4);
	    String exp_mvalue = ExcelUtils.getCellData(file, "Sheet1", r, 5);
	    


	    // 2) pass the data into application 
	    
	    driver.findElement(By.id("principal")).sendKeys(princ);
	    
	    driver.findElement(By.id("interest")).sendKeys(r_o_i);
	    
	    driver.findElement(By.id("tenure")).sendKeys(per1);
	    
	    Select perdrp = new Select(driver.findElement(By.id("tenurePeriod")));
	    
	    perdrp.selectByVisibleText(per2);
	    
	    Select fredrp = new Select(driver.findElement(By.id("frequency")));
	    fredrp.selectByVisibleText(freq);	   
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    WebElement  cal_button = driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']"));
	    js.executeScript("arguments[0].click();", cal_button);
	    
	    //3) validation and update the values in the Excel
	    
	    String act_mvalue =  driver.findElement(By.xpath("//span[@class = 'gL_27']/strong")).getText();
	    
	    if(Double.parseDouble(act_mvalue) == Double.parseDouble(exp_mvalue));
	    {
	    	
	    	
	    	System.out.println("Test passed");
	    	ExcelUtils.setCellData(file, "Sheet1", r, 7, "Passed");
	    	ExcelUtils.fillGreenColor(file, "Sheet1", r, 7);
	    }
	    
	    
	    {
	    	
	    	System.out.println("Test Failed");
	    	ExcelUtils.setCellData(file, "Sheet1", r, 7, "Failed");
	    	ExcelUtils.fillRedColor(file, "Sheet1", r, 7);
	   
	    }	
	    	
	    Thread.sleep(3000);
	    	
	    WebElement click_button = driver.findElement(By.xpath("//img[@class='PL5']"));
	    js.executeScript("arguments[0].click();", click_button);
	    
	    
	    
	  }
	    

	}

}

package day30;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractwithElementusingJS {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//JavascriptExecutor js = driver;
		
		//name ----->this is the syntax of javascript statement  input boxes
		WebElement inputBox = driver.findElement(By.id("name"));
		js.executeScript("arguments[0].setAttribute('value','shantanu')", inputBox);
		
		//email
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','kekaneshantanu@gmail.com')", email);		
		
		//phonenumber inbox
		//WebElement Number = driver.findElement(By.id("phone"));
		//Number.sendKeys("8275583225");
		
		// address
		
		//WebElement address = driver.findElement(By.id("textarea"));
		//address.sendKeys("Panchavati Nashik");		
		
		
		// male_rd ---- radio button
		WebElement male_rd = driver.findElement(By.id("male"));
		js.executeAsyncScript("arguments[0].click();", male_rd);
		
		
		// female_rd
		//WebElement female_rd = driver.findElement(By.id("female"));
		//js.executeAsyncScript("arguments[0].click();", female_rd);
		
		// check box
		WebElement check_box = driver.findElement(By.id("sunday"));
		js.executeAsyncScript("arguments[0].click();", check_box);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		

	}

}

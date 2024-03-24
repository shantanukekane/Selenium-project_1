package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public WebDriver driver;
	
	
	// constructor
	// here we create a constructor to initialize the driver
     LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	// locators  // we can use any locators
	
	By img_logo_loc = By.xpath("//img[@alt='company-branding']");
	By txt_username_loc = By.name("username");
	By txt_password_loc = By.name("password");
	By btn_submit_loc = By.xpath("//button[normalize-space()='Login']");

	
	// Action Methods
	
	public void setUsername(String username) 
	{
		driver.findElement(txt_username_loc).sendKeys(username);
	}
	
	
	public void setPassword(String password)
	{
		driver.findElement(txt_password_loc).sendKeys(password);
	}
	
	public void ClickButton()
	{
		driver.findElement(btn_submit_loc).click();
		
	}
	
	public boolean checklogoPresent()
	{
		
	  boolean status = driver.findElement(img_logo_loc).isDisplayed();
	  return status;	
	
	}
	
}

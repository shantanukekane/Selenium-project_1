package day39;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

   public WebDriver driver;
	
	//constructor
	LoginPage2(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElements Locator + identification
	
	@FindBy(xpath = "//img[@alt='company-branding']") 
	WebElement img_logo;
	
	@FindBy(name = "username") 
	WebElement txt_username;
	
	@FindBy(name = "password") 
	WebElement txt_password;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement btn_submit;
	
	
	// Action Method
	
	public boolean checkLogoPresent()
	{
		boolean status = img_logo.isDisplayed();
		return status;
	}
	
	public void setUsername(String username)
	{
		txt_username.sendKeys(username);
	}
	
	
	public void setPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	
	public void clickButton()
	{
		btn_submit.click();
	}
	
	
	
	
}

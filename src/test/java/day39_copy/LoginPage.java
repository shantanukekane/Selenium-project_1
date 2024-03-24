package day39_copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public WebDriver driver;
	
	//constructor
	
	LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// WebElement locators + identification
	
	@FindBy(xpath = "//img[@alt='nopCommerce demo store']")
	WebElement img_logo_loc;
	
	@FindBy(xpath = "//a[normalize-space()='Log in']") 
	WebElement login_loc;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement txt_Email_loc;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement txt_Pass_loc;
	
	@FindBy(xpath = "//button[normalize-space()='Log in']")
	WebElement btn_submit;
	
	@FindBy(xpath = "//a[@class='ico-account']")
	WebElement my_acc_loc;
	
	
	// Action methods
	
	public boolean testLogo()
	{
		
	   boolean status =img_logo_loc.isDisplayed();
	   return status;
		
	}
	

	public void loginClick()
	{
		login_loc.click();	
	}

	public void setEmail(String email_address)
	{
		txt_Email_loc.sendKeys(email_address);
	}
	
	public void setPassword(String password)
	{
		txt_Pass_loc.sendKeys(password);
	}
	
	public void clickButton()
	{
		btn_submit.click();
	}
	
	public boolean MyAccountPresent()
	{
	  boolean my_acc_status = my_acc_loc.isDisplayed();
	  return my_acc_status;
	}
	

	
}

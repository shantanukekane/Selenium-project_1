package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutheticalPopops {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
	    String text = driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		
	    if(text.contains("Congratulations"))
	    {
	    	System.out.println("Successful login");
	    }
	    else
	    {
	    	System.out.println("login Failed");
	    }
		
		

	}

}

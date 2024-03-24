package day39_copy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencard {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://localhost/opencardsite/index.php?route=common/home&language=en-gb");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Shantanu");
		
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("kekane");
		
		WebElement email =driver.findElement(By.xpath("//input[@id='input-email']"));
		email.clear();
		email.sendKeys("kekane@gmail.com");
		
		
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@1234");
		
	    WebElement privacy = driver.findElement(By.xpath("//input[@name='agree']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("agruments[0].click();", privacy);
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		
		//driver.findElement(By.xpath(""))
		
		
		

	}

}

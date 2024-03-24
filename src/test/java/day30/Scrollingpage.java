package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollingpage {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		
		//WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.opencart.com/index.php");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = driver;
		
		
		// 1A)Approach =  scroll down the page by pixel 
		//js.executeScript("window.scrollBy(0,500);","");
		//System.out.println(js.executeScript("return window.pageYOffset;"));      // 539 
		
		// 2A)scroll down the page till the expected text is present
		//WebElement txt = driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xl'][normalize-space()='Get Started']"));
		
		//js.executeScript("arguments[0].scrollIntoView();", txt);
		//System.out.println(js.executeScript("return window.pageYOffset;"));      // 1561


		// 2B) scroll down the page till the expected button is present
		//WebElement button = driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xl'][normalize-space()='Visit Marketplace']"));
		
		//js.executeScript("arguments[0].scrollIntoView();", button);
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		// 1B) scroll down the page by pixel
		//js.executeScript("window.scrollBy(0,700);", "");
		//System.out.println(js.executeScript("return window.pageYOffset;"));   // 700
		
		
		//4) scroll down till the end of the page/document
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");  // 4982
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(3000);
		
		// again go back to the initial position (use - sign)
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");  // 0
		System.out.println(js.executeScript("return window.pageYOffset;"));

		
		
	}

}

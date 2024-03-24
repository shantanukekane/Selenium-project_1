package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTable_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Declaration of Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Open url or application
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();

		
		// 1) Find total Number of rows in the table
		
	    int rows = driver.findElements(By.xpath("//table[@id = 'customers']//tr")).size();
		System.out.println("Total Number of rows: "+rows);
		
		
		// 2) Find Total Number of columns in the table
		
		int columns = driver.findElements(By.xpath("//table[@id = 'customers']//th")).size();
		System.out.println("Total Number of columns: "+columns);
		
		// 3) read the specific value from the table
		
		driver.findElement(By.xpath(""));
		
		
		
		
		
	}

}

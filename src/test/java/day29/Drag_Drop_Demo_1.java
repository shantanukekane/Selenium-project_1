package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop_Demo_1 {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Open url
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		
		// Inspecting the source and target Elements
		
		// Rome -----> italy
	    WebElement Rome = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
		
		// Washington -----> United_states
		WebElement Washington = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement United_states = driver.findElement(By.xpath("//div[@id='box103']"));
		
		// Oslo --------> Norway
		WebElement Oslo = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement Norway = driver.findElement(By.xpath("//div[@id='box101']"));

		// stockholm ------> sweden
		WebElement stockholm =driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement Sweden = driver.findElement(By.xpath("//div[@id='box102']"));
		
		// Create an actions class to perform drag and drop operation
		
		Actions act = new Actions(driver);
		
		
		// Drag & drop 
		act.dragAndDrop(Rome, italy).perform();   // drag and drop operation
		
		act.dragAndDrop(Washington, United_states).perform();
		
		act.dragAndDrop(Oslo, Norway).perform();
		
		act.dragAndDrop(stockholm, Sweden).perform();
		
		
		
		

	}

}

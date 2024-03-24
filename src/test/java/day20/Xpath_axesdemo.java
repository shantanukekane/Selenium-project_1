package day20;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_axesdemo {

	public static void main(String[] args) {
		
		
		//WebDriverManager.chromedriver().setup();
		
		// Launch Browser
		WebDriver driver = new ChromeDriver();
		
		// Open URL or applications
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		// self node
	    String text = driver.findElement(By.xpath("//a[contains(text(),'Indigo Paints')]/self::a")).getText();		
		
		System.out.println(text);
		
		// parent - select the parent of the current node(always one)
        
	    text = driver.findElement(By.xpath("//a[contains(text(),'Indigo Paints')]/parent::td")).getText();
		
		System.out.println(text);
		
		// child - select all children of the current node(one or many)
		
	    List<WebElement> child = driver.findElements(By.xpath("//a[contains(text(),'Indigo Paints')]/ancestor::tr/child::*"));
	    
		System.out.println("Number of child elements :"+child.size());
		
		// ancestors - selects all ancestors (parent,grandparent,etc.)
	    text = driver.findElement(By.xpath("//a[contains(text(),'Indigo Paints')]/ancestor::tr")).getText();
		System.out.println(text);
		
		// decsendant - selects all descendant (child and grand child,etc.) of current node
	    List<WebElement> descendant = driver.findElements(By.xpath("//a[contains(text(),'Indigo Paints')]/ancestor::tr/descendant::*"));
        System.out.println("Number of Descendant: "+descendant.size());
	    
        // following - selects all following after closing the current node
        List<WebElement> followingnode = driver.findElements(By.xpath("//a[contains(text(),'Indigo Paints')]/ancestor::tr/following::tr"));
        System.out.println("Number of following node: "+followingnode.size());
        
        
        // following - sibling : select all sibling after the current node
        List<WebElement> following_sibling = driver.findElements(By.xpath("//a[contains(text(),'Indigo Paints')]/ancestor::tr/following-sibling::tr"));
        System.out.println("Number of following sibling: "+following_sibling.size());
        
        
        // Preceding = select all the nodes before the current node in the documents
        List<WebElement> preceding = driver.findElements(By.xpath("//a[contains(text(),'Indigo Paints')]/ancestor::tr/preceding::tr")); 
        System.out.println("Number of preceding node: "+preceding.size());       
        
        // preceding - siblings select all the sibling before the current node in the documents
        
        List<WebElement> precedingsibling = driver.findElements(By.xpath("//a[contains(text(),'Indigo Paints')]/ancestor::tr/preceding-sibling::tr"));
        System.out.println("Number of preceding-sibling node: "+precedingsibling.size());
        
        // close browser
        driver.quit();
        
	    
	}

}

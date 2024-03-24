package day20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatordemoXpathaxes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		// Launch Browser
		
		WebDriver driver = new ChromeDriver();
		
		// Open application or open URl
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		//self - select the current node
		
	    //String selfnode = driver.findElement(By.xpath("//a[contains(text(),'TD Power System')]/self::a")).getText();
		//System.out.println(selfnode);
		
		
		//self - select the current node
	    String selfnode = driver.findElement(By.xpath("//a[contains(text(),'Oracle Financial Ser')]/self::a")).getText();
		System.out.println(selfnode);
		
		//Parent - select the parent of the current node (always one)	    
		String parentnode =	driver.findElement(By.xpath("//a[contains(text(),'Oracle Financial Ser')]/parent::td")).getText();
		System.out.println(parentnode);
		
		
		//child - select all the children node (one or more)
	    List<WebElement> childnode = driver.findElements(By.xpath("//a[contains(text(),'Oracle Financial Ser')]/ancestor::tr/child::td"));
		System.out.println("Number of child nodes: "+childnode.size());
		
		
		//ancestors - select all ancestors (parent,grandparent,etc)		
	    String ancestornode = driver.findElement(By.xpath("//a[contains(text(),'Oracle Financial Ser')]/ancestor::tr")).getText();
		System.out.println(ancestornode);
		
		//Descendant - select all the descendanat(child,grandchild,etc)
	    List<WebElement> descendantnode = driver.findElements(By.xpath("//a[contains(text(),'Oracle Financial Ser')]/ancestor::tr/descendant::*"));
		System.out.println("Number of Descendant Elements: "+descendantnode.size());
		
		// following - select everything in the document after the closing tag of current node
	    List<WebElement> following = driver.findElements(By.xpath("//a[contains(text(),'Oracle Financial Ser')]/ancestor::tr/following::tr"));
		System.out.println("Number of following elements: "+following.size());
		
		// following-sibling  select all sibling after current node
		
		List<WebElement> followingsibling = driver.findElements(By.xpath("//a[contains(text(),'Oracle Financial Ser')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of following-sibling: "+followingsibling.size());
		
		// preceding - select everything in the document before the closing tag of current node
		
	    List<WebElement> preceding = driver.findElements(By.xpath("//a[contains(text(),'Oracle Financial Ser')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of preceding: "+preceding.size());
		
		// preceding - sibling  select all sibling before the current node 
		
	    List<WebElement> precedingsibling =driver.findElements(By.xpath("//a[contains(text(),'Oracle Financial Ser')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of preceding-sibling: "+precedingsibling.size());
		
		
		
		
		
		
		
		
		
		
	
		//close browser
		driver.quit();
		
		
		
		

	}

}

package day35;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo_1 {

	
	   @BeforeMethod
	   void login()
	   {
		   System.out.println("Login...");
	   }
	
	   @Test(priority = 1)
	   void search()
	   {
		   
		   System.out.println("Search...");
		   
	   }
	   
	   @Test(priority = 2)
	   void advancedSearch()
	   {
		   
		   System.out.println("Advance search....");
	   }
	   
	   @AfterMethod
	   void Logout()
	   {
		   
		   System.out.println("Logout...");
		   
	   }
	
	
	   
	
	
	
	
	
	
	

}

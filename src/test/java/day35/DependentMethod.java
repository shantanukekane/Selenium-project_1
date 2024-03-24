package day35;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentMethod {

	 // scenario ===> 1
	   @Test(priority = 1)
	   void OpenApp()
	   {
		   Assert.assertTrue(true);
		   
	   }
	
	   @Test(priority = 2)
	   void Login()
	   {
		   
		   Assert.assertTrue(false);         // Assertation is nothing but the Validation
	   }
	
	   @Test(priority = 3)
	   void search()
	   {
		   
		   Assert.assertTrue(true);
		   
	   }
	
	   @Test(priority = 4)
	   void Advsearch()
	   {
		   
		   Assert.assertTrue(true);
		   
	   }
	
	   @Test(priority = 5)
	   void Logout()
	   {
		   
		   Assert.assertTrue(true);
		   
	   }
	
	
}

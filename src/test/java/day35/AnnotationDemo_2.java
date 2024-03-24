package day35;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationDemo_2 {

	  @BeforeClass
	  void login()
	  {
		  System.out.println("Login...");
	  }
	   
	  @Test(priority = 2)
	  void search()
	  {
		  
		  System.out.println("Search...");
	  }
	
	
	  @Test(priority = 3)
	  void advancedsearch()
	  {
		  
		  System.out.println("AdvanceSearch....");
		  
	  }
	
	  @AfterClass
	  void logout()
	  {
		  System.out.println("logout....");
	  }
	
	
	
}

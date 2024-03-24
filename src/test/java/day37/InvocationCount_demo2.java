package day37;

import org.testng.annotations.Test;

public class InvocationCount_demo2 {

	   
	  @Test(invocationCount = 5)
	  void test()
	  {
		  System.out.println("Testing....");
	  }
	  
	  
	  @Test
	   void test_2()
	   {
		   
		   System.out.println("Testing two...");
	   
	   }
	
	
	   
	   
	
	
	
	
	
	
	
	
	
}

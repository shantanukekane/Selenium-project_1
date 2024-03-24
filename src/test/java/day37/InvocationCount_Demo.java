package day37;

import org.testng.annotations.Test;

public class InvocationCount_Demo {


	   @Test
	   void test()
	   {
		   System.out.println("Testing....");
	   }
	
	   
	   
	   
	   @Test(invocationCount = 10)
	   void test_repeat()
	   {
		   System.out.println("multiple times Testing....");
	   }
	
	   
	   
	   
	   
	
	
	
}

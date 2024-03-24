package day35;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftassertions {

	//@Test
	void test_hardassertion()
	{
		
		System.out.println("Testing........");
		System.out.println("Testing........");
		System.out.println("Testing........");
		System.out.println("Testing........");
		System.out.println("Testing........");

		Assert.assertEquals(1, 2);   //if this hard assertion got failed then rest of the statement will not executed
		                             
		System.out.println("Hard assertion completed");
		Assert.assertEquals(1, 1);
		
		
	}
	
	
	@Test
	void test_softassertion()
	{
		System.out.println("Testing........");
		System.out.println("Testing........");
		System.out.println("Testing........");
		System.out.println("Testing........");
		System.out.println("Testing........");
		
		// here we use soft assertion using softAssert class
		// for that we create a objct 
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(1, 2);
		
		System.out.println("Soft assertion completed....");
		//sa.assertEquals(1, 1); even this assertion is pass but rest of the test gets fails so overall test will fails
		
		sa.assertAll();  // mandatory
		
		
		
		
		
		
		
	}
	
	
	
	
}

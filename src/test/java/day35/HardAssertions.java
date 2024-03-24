package day35;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	
	@Test
	void test()
	{
		
		//int a = 10;
		//int b = 20;
		
		/*
		if(a == b)
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		*/
		
		//Assert.assertEquals(a, b);
		//Assert.assertTrue(true);  // pass
		//Assert.assertTrue(false); //		
		
		
		//int a = 10;
		//int b = 20;
		
		//Assert.assertEquals(actual,expected,description);
		
		//Assert.assertEquals(a>b, true, "a is less than b");
		//Assert.assertEquals(a>b, true,"a is less than b");
		
		String s1 = "abc";
		String s2 = "abc";
				
		//Assert.assertEquals(s1, s2,"String s1 is not equals to String s2");  // pass
		
		//Assert.assertNotEquals(s1, s2);  //fails
		
		
		if(false)
		{
			Assert.assertTrue(true);
		}
		else
		{
			//Assert.assertTrue(false);
			Assert.fail();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}

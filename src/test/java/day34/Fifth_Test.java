package day34;

import org.testng.annotations.Test;

public class Fifth_Test 
{
    @Test(priority = 1)
	void test1()
	{
		
		System.out.println("addition");
		
	}
	
    @Test(priority = 2)
	void test2()
	{
		
		System.out.println("substraction");
	}
	
    @Test(priority = 3)
	void test3()
	{
		
		System.out.println("Multiplication");
		
	}
	
	
	
}

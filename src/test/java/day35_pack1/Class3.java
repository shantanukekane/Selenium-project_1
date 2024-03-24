package day35_pack1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class3 {

	@Test()
	void shantanu()
	{
		System.out.println("This is shantanu");
	}
	
	@Test
	void parth()
	{
		System.out.println("This is parth");
		
	}
	
    @BeforeTest
	void name()
	{
		System.out.println("This is Before Test method");
	}
	
	
}

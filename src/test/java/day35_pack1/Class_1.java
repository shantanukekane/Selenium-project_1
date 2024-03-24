package day35_pack1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class_1 {

	@Test
	void abc()
	{
		System.out.println("This abc is from class 1");
	}
	
	@BeforeTest
	void m()
	{
		System.out.println("This is before test method");
	}
	
	
	
}

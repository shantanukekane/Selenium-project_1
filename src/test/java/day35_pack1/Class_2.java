package day35_pack1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class_2 {

	@Test
	void xyz()
	{
		System.out.println("This xyz is from class 2");
	}
	
	@AfterTest
	void n()
	{
		System.out.println("This is after test method");
	}
	
	
}

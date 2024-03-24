package day35_pack1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class4 {

	@Test
	void Dnyanada()
	{
		System.out.println("This is Dnyanada");
	}
	
	@AfterTest
	void Neeta()
	{
		System.out.println("This is after Test method");
	}
	

	@BeforeSuite
	void bs()
	{
		System.out.println("This is Before suite method");
	}
	
	@AfterSuite()
	void as()
	{
		System.out.println("This is after suite method");
	}
}

package day35;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {

	@BeforeSuite
	void bs()
	{
		System.out.println("This is before suite....");	
		
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This is after suite....");
	}
	
	@BeforeTest
	void bt()
	{
		
		System.out.println("This is Before test method...");
		
	}
	
	@AfterTest
    void at()
    {
		System.out.println("This is After test method...");
    }
	
	
	@BeforeClass
	void bc()
	{
		System.out.println("This is Before test class..");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("This is After test class...");
	}
	
	@BeforeMethod
	void bm() 
	{
		System.out.println("This is Before test method....");
	}
	
	@AfterMethod
	void am()
	{
		System.out.println("This is After test method....");
	}
	
	@Test(priority = 1)
	void tm1()
	{
		System.out.println("This is test Method1....");
	}
	
	@Test(priority = 2)
	void tm2()
	{
		System.out.println("This is Test Method2...");
	}
	
	
	
}

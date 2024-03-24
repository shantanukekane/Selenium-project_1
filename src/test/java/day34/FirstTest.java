package day34;

import org.testng.annotations.Test;

public class FirstTest {
 
	
	@Test(priority=1)
	void OpenApp()
	{
		System.out.println("Testing 1");
	}
	
	@Test(priority=2)
	void Login()
	{
		
		System.out.println("Testing 2");
	
	}
	
	@Test(priority=3)
	void Logout()
	{
		
		System.out.println("Testing 3");
		
	}
	
  
	
	
}

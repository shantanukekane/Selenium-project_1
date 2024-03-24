package day36;

import org.testng.annotations.Test;

/*

loginByEmail - sanity & regression
loginByfacebook - sanity
loginBytwitter - sanity


signupByEmail - sanity & regression
signupByFacebook - regression
signupByTwitter - regression


paymentinrupees - sanity & regression
paymentindoller - sanity
paymentReturnbyBank - regression

*/
public class Grouping_demo {

	
	@Test(priority = 1,groups = {"sanity","regression"})
	void loginByEmail()
	{
		System.out.println("This is login by email");
		
	}
	
	@Test(priority = 2,groups = {"sanity"})
	void loginbyfacebook()
	{
		System.out.println("This is login by facebook");
		
	}
	
	@Test(priority = 3,groups = {"sanity"})
	void loginByTwitter()
	{
		
		System.out.println("This is login by Twitter");
	}
	
	@Test(priority = 4,groups = {"sanity","regression"})
	void signupByEmail()
	{
		
		System.out.println("This is signup by Email");
		
	}
	
	@Test(priority = 5,groups = {"regression"})
	void signupByFacebook()
	{
		System.out.println("This is signup by Facebook");
		
	}
	
	@Test(priority = 6,groups = {"regression"})
	void signupByTwitter()
	{
		System.out.println("This is signup by Twitter");
		
	}
	
	@Test(priority = 7,groups = {"sanity","regression"})
	void paymentinrupees()
	{
		System.out.println("This is payment in rupees");
	}
	
	@Test(priority = 8,groups = {"sanity"})
	void paymentindoller()
	{
		System.out.println("This is payment in doller");
		
	}
	
	@Test(priority = 9,groups = {"regression"})
	void paymentReturnbyBank()
	{
		
		System.out.println("This is payment return by bank");
	
	}
	
	
	
	
}

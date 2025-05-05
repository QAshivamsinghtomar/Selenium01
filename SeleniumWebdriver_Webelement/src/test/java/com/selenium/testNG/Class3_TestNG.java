package com.selenium.testNG;

import org.testng.annotations.Test;

// expectedException

public class Class3_TestNG {

	/*
	// it will become pass test case
	@Test(expectedExceptions = ArithmeticException.class)
	public void m1() {
		
		int a = 10 , b = 0 ;
		System.out.println(a/b);

	}
	*/
	
	
	
	
	/*
	//it will become fail because of we are expecting ArithmeticException but it is throwing NullPointerException
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void m2() {
		
		String a = null ;
		
		System.out.println(a.length());
		
	}
	*/
	
	
	// it will become pass 
	@Test(expectedExceptions = NullPointerException.class)
	public void m3() {
		
		String b = null ;
		System.out.println(b.length());
	}
	
	
	
	
}

package com.selenium.testNG;

import org.testng.annotations.Test;

//invocationCount :- The number of times this @Test annotated method should be excuted.
//invocationTimeout -> The maximum  number of milliseconds this @Test method should take 
//						for the total time  of all the invocation count
// This attribute will be ignored when we dont specify the invocationCount.

public class Class10_TestNG {

	/*
	public int a = 10 ;
	
	@Test(invocationCount = 5, invocationTimeOut = 10000)
	public void m1() throws Exception {
		
		System.out.println("A = "+a);
		a ++ ;
		Thread.sleep(1000);
	}
	
	*/
	
	
	public String a = "APPLE" ;
	
	@Test(invocationCount = 10, invocationTimeOut = 20000)
	public void m2() throws Exception {
		System.out.println(a);
		Thread.sleep(1000);
	}
		
		
		public String b = "BANANA" ;
		
		@Test(invocationCount = 10, invocationTimeOut = 20000)
		public void m3() throws Exception {
			System.out.println(a);
			Thread.sleep(1000);
	}
	
}

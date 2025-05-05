package com.selenium.testNG;

// invocationCount and invocationTimeOut

import org.testng.annotations.Test;

public class Class4_TestNG {
	
	/*
	public int i = 1 ;
	 
	@Test(invocationCount = 5)
	public void m1() {
		
		i++;
		System.out.println("I = "+ i);
	}
	*/
	
	
	
	public int a = 5 ;
	@Test(invocationCount = 5 , invocationTimeOut = 10000)
	public void m2() {
		
		++a;
		System.out.println("A = "+a);
	}
	
	
	
	/*
	int b = 100 ;
	
	@Test(invocationCount = 10, invocationTimeOut = 1000)
	public void m3() {
		
		++ b ;
		
		System.out.println("B = "+b);
	}
	
	*/
	 
	
}

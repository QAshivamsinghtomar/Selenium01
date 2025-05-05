package com.selenium.testNG;

// successPercentage

import org.testng.Assert;
import org.testng.annotations.Test;


public class Class5_TestNG {
	
	
	/*
	public int a = 10 ;
	
	@Test(successPercentage = 60, invocationCount = 5)
	public void m1() {
		
		a++;
		System.out.println("A = "+a);
	}
	
	*/
	
	
	public int x = 10 ;
	
	@Test(successPercentage = 50 , invocationCount = 5)
	public void m2() {
		
		if(x%2==0) {
			
			x++ ;
			Assert.assertTrue(true);
		}
		else {
			x++;
			Assert.assertTrue(false);
		}
	}
	
	
	
}

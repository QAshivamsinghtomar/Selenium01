package com.selenium.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// Assertion - Hard assertion & Soft assertion

public class Class24_TestNG {

	// Hard Assertion -1
	@Test(priority = 1)
	public void hardAssertion1() {
		
		System.out.println("Hard Assertion - 1 - Java");
		Assert.assertTrue(false); // here instansnally failing the method- Hard Assertion - throw exception
		System.out.println("Hard Assertion - 1 - Selenium"); // here this line will not execute
		
	}
	
	// Hard Assertion -2
	@Test(priority = 2)
	public void hardAssertion2() {
		
		System.out.println("Hard Assertion - 2 - Manual");
		Assert.assertTrue(true); // here method is not failing - Hard Assertion
		System.out.println("Hard Assertion - 2 - Testing"); // here this line will execute
	}
	
	
	// Soft Assertion - 1
	@Test(priority = 3)
	public void softAssertion() {
		
		System.out.println("Soft Assertion - 1 - Java");
		SoftAssert assert1 = new SoftAssert();
		assert1.assertTrue(false); // here it will execute line line without throwing exception
		System.out.println("Soft Assertion - 1 - Selenium");
		
		assert1.assertAll();
	}
	
	// Soft Assertion - 2
	@Test(priority = 4)
	public void softAssertion2() {
		System.out.println("Soft Assertion - 2 - Manual");
		SoftAssert assert1 = new SoftAssert();
		assert1.assertTrue(true); // here assert is true, will execute lnext line smutelly
		System.out.println("Soft Assertion - 2 - Testing");
		
		assert1.assertAll();
	}
	
	
}

package com.selenium.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// Order of TestNG Execution

public class Class23_TestNG {

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method will execute before every @Test method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method will execute after every @Test method");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class will always execute prior to @Before method and @Test method");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("After class will always execute later to @After method and @Test method");
	}

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest will always execute prior to "
				+ "@Before class, @Before method and @Test method");
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test will always execute Later "
				+ "to @AfterMethod @AfterClass, and @Test method");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite will always execute prior to "
				+ "All annotation or test in the Suite");
	}

	@AfterSuite
	public void afterSuite()
	{
		System.out.println("AfterSuite will always execute at last to "
				+ "all annotation or test in the Suite");
	}


	@Test(priority = 1)
	public void testCase1()
	{
		System.out.println("This is my 1st test case");
	}

	
	@Test(priority = 2)
	public void testCase2()
	{
		System.out.println("This is my 2nd test case");
	}
	
	
}

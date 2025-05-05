package com.selenium.testNG;

// how to exclude one or more then 1 method from class -- xml 17 file

import org.testng.annotations.Test;

public class Class17_TestNG {

	@Test(priority = 1)
	public void test1() {
		System.out.println("This is Test1 Method..");
	}
	
	
	@Test(priority = 2, enabled = false)
	public void test2() {
		System.out.println("This is Test2 Method..");
	}
	
	
	@Test(priority = 3)
	public void test3() {
		System.out.println("This is Test3 Method..");
	}
	
	
	@Test(priority = 4)
	public void test4() {
		System.out.println("This is Test4 Method..");
	}
	
	
	
	@Test(priority = 5)
	public void test5() {
		System.out.println("This is Test5 Method..");
	}
	
}

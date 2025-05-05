package com.selenium.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// @DataProvider - This is a annotated method.
// DataProvider - this is a attribute.


// Data Driven Testing - 2 way 
// 1. By using @DataProvider Annotation , 2. By Reading data from Exce file

public class Class14_TestNG {

	/*
	@DataProvider(name = "testdata")
	public Object[][] m1(){
	
		Object[][] objects = new Object[][] {{10} , {20} , {30} , {40}};
		
		return objects ;
	}
	
	@Test(dataProvider = "testdata")
	public void m2(int a) {
		System.out.println(a);
	}
	
	*/
	
	//=============================================
	
	
	/*
	@DataProvider(name = "DemoData")
	public Object[][] m3() {
		
		Object[][] object = new Object[][] {{10, 20}, {10, 30}, {10, 40}, {10, 50}};
		
		return object ;
	}
	
	
	@Test(dataProvider = "DemoData")
	public void m4(int x , int y) {
		
		int a = x + y ;
		
		System.out.println("A = "+a);
	}
	*/
	
	
	//====================================================
	
	
	@DataProvider(name = "Test")
	public Object[][] m5() {
		Object[][] a = new Object[][] {{10, 20, "A"}, {30, 40, "B"}, {50, 60, "C"}, {70, 80, "D"}};
		
		return a ;
	}
	
	
	@Test(dataProvider = "Test")
	public void m6(int x, int y, String z) {
		
		System.out.println("A = " + x + "...B = " + y + "...C = " + z );
	}
	
	
}

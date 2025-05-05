package com.selenium.testNG;

import org.testng.annotations.Test;

public class Class16_TestNG {

	/*
	@Test(dataProvider = "Demodata", dataProviderClass = Class15_TestNG2.class)
	public void method1(int x, int y, String z) {
		System.out.println("X = "+x+"...Y = "+y+"... Z ="+z);
	}
	*/
	
	@Test(dataProvider = "Demodata", dataProviderClass = Class15_TestNG2.class)
	public void m10(int a, int b) {
		
		System.out.println("A = "+a+ "... B = "+b);
		
	}
	
}

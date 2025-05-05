package com.selenium.testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class21_TestNG {

	@Test(priority = 1)
	@Parameters({"fname", "lname", "age", "number"})
	public void method(String fname, String lname, String age, String number) {
	
		System.out.println(fname+"...."+lname+"...."+age+"...."+number);
		
	}
}

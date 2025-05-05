package com.selenium.testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// @Parameter annotation and optional attribute

public class Class20_TestNG {

	@Test(priority = 1)
	@Parameters( {"country","Ename", "number", "age"} )
	public void method1(String country, String Ename, String number, String age) {
		
		//System.out.println(Ename+"...."+age+"...."+country+"...."+number);
		System.out.println(country+"...."+Ename+"...."+number+"...."+age);
	}
	
}

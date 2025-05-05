package com.selenium.testNG;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class15_TestNG2 {
	
	@DataProvider(name = "Demodata")
	public Object[][] m1(Method m) {
		
		Object[][] object ;
		
		if(m.getName().equalsIgnoreCase("method1")) {
			object = new Object[][] {{10, 10, "AA"}, {20, 20, "BB"}, {30, 30, "CC"}, {40, 40, "DD"} };
		}
		else if (m.getName().equalsIgnoreCase("method2")) {
			object = new Object[][] {{"AA", "AA"}, {"BB", "BB"}, {"CC", "CC"}, {"DD", "DD"} };
		}
		else {
			object = new Object[][] {{10, 20}, {30, 40}, {50, 60}, {70, 80}};
		}
		
		return object ;
		
	}
	
	
	@Test(dataProvider = "Demodata")
	public void method4(int a, int b) {
		int c = a+b;
		System.out.println("C ="+c);
	}
	
	
	
	@Test(dataProvider = "Demodata")
	public void method1(int x, int y, String z) {
		System.out.println("X = "+x+"...Y = "+y+"...Z = "+z);
	}
	
	
	
	@Test(dataProvider = "Demodata")
	public void method2(String n, String m) {
		System.out.println("N = "+n+"...M = "+m);
	}
	
	

}

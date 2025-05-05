package com.selenium.testNG;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Return;

public class Class15_TestNG {

	@DataProvider(name = "DemoData")
	public Object[][] m1(Method  m) {
	
		Object[][] object ;
		
		if(m.getName().equalsIgnoreCase("m2")) {
			object = new Object[][] {{10, 20}, {30, 40}, {50, 60}, {70, 80}, {90, 100}};
			
			
		}
		else if(m.getName().equalsIgnoreCase("m3")) {
			
			object = new Object[][] {{1, "Java"}, {2, "Python"}, {3, "Ruby"}, {4, "C++"}, {5, "Javascript"}};
		}
		
		else {
			object = new Object[][] {{"Java", "Selenium"}, {"Phython", "Selenium"}, {"C", "Selenium"}, {"Ruby", "Selenium"}};
			
		}
		
		return object ;
	}
	
	@Test(dataProvider = "DemoData")
	public void m2(int a, int b) {
		
		int c = a + b ;
		System.out.println("C = "+ c );
	}
	
	
	@Test(dataProvider = "DemoData")
	public void m3(int x , String y) {
		System.out.println("X = " + x + "..Y = " + y );
	}
	
	
	@Test(dataProvider = "DemoData")
	public void m10(String a, String b) {
		System.out.println("A = " + a + "..B = " + b );
	}
	
	
	
	
}

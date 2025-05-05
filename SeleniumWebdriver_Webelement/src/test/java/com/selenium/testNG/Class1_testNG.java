package com.selenium.testNG;

// Basic Program

// @Test Annotation method
import org.testng.annotations.Test;

public class Class1_testNG {
	
	public static void main(String[] args) {
		
		System.out.println("This is main Method..");
	}
	
	
	@Test
	public void m1() {
		System.out.println("This is m1 Method...");
	}
	
	@Test
	public void m2() {
		System.out.println("This is m2 method..");
	}

}

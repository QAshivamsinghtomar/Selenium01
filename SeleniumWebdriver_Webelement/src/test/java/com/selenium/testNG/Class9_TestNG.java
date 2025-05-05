package com.selenium.testNG;

import org.testng.annotations.Test;

// Priority and dependsOnMethods 

public class Class9_TestNG {

	@Test(priority = 3, dependsOnMethods = "amount")
	public void account() {
		System.out.println("Hey..! This is Account Method..");
	}
	
	
	@Test(priority = 2, dependsOnMethods = "bank")
	public void amount() {
		System.out.println("Hey..! This is amount Method..");
	}
	
	
	@Test(priority = 5, dependsOnMethods = "withdraw")
	public void cash() {
		System.out.println("Hey..! This is cash Method..");
	}
	
	
	@Test(priority = 1)
	public void bank() {
		System.out.println("Hey..! This is bank Method..");
	}
	
	
	@Test(priority = 4,  dependsOnMethods = "account")
	public void withdraw() {
		System.out.println("Hey..! This is withdraw Method..");
	}
	
	
}

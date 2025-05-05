package com.selenium.testNG;

import org.testng.annotations.Test;

// with set priority - method will execute in the order of priority basic

public class Class7_TestNG {

	@Test(priority = 1)
	public void account() {
		System.out.println("Hey..! This is Account Method..");
	}
	
	@Test(priority = 2)
	public void amount() {
		System.out.println("Hey..! This is amount Method..");
	}
	
	@Test(priority = 3)
	public void cash() {
		System.out.println("Hey..! This is cash Method..");
	}
	
	@Test(priority = 4)
	public void bank() {
		System.out.println("Hey..! This is bank Method..");
	}
	
	
	@Test(priority = 5)
	public void withdraw() {
		System.out.println("Hey..! This is withdraw Method..");
	}
	
	
	@Test(priority = 6)
	public void checkBalance() {
		System.out.println("Hey..! This is checkBalance Method..");
	}
	
	
	@Test(priority = 7)
	public void pendingBalance() {
		System.out.println("Hey..! This is pendingBalance Method..");
	}
	
	
	@Test(priority = 8)
	public void ATM() {
		System.out.println("Hey..! This is ATM Method..");
	}
	
	
	@Test(priority = 9)
	public void passbook() {
		System.out.println("Hey..! This is passbook Method..");
	}
	
	
	@Test(priority = 10)
	public void checkbook() {
		System.out.println("Hey..! This is checkbook Method..");
	}
	
}

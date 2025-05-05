package com.selenium.testNG;

import org.testng.annotations.Test;

// dependsOnMethods - One method is depends on another one

public class Class8_TestNG {

	@Test
	public void account() {
		System.out.println("Hey..! This is Account Method..");
	}
	
	
	@Test(dependsOnMethods = "account")
	public void amount() {
		System.out.println("Hey..! This is amount Method..");
	}
	
	
	@Test(dependsOnMethods = "amount")
	public void cash() {
		System.out.println("Hey..! This is cash Method..");
	}
	
	
	@Test(dependsOnMethods = "cash")
	public void bank() {
		System.out.println("Hey..! This is bank Method..");
	}
	
	
	@Test(dependsOnMethods = "bank")
	public void withdraw() {
		System.out.println("Hey..! This is withdraw Method..");
	}
	
	
	@Test(dependsOnMethods = "withdraw")
	public void checkBalance() {
		System.out.println("Hey..! This is checkBalance Method..");
	}
	
	
	@Test(dependsOnMethods = "checkBalance")
	public void pendingBalance() {
		System.out.println("Hey..! This is pendingBalance Method..");
	}
	
	
	@Test(dependsOnMethods ="pendingBalance")
	public void ATM() {
		System.out.println("Hey..! This is ATM Method..");
	}
	
	
	@Test(dependsOnMethods = "ATM")
	public void passbook() {
		System.out.println("Hey..! This is passbook Method..");
	}
	
	
	@Test(dependsOnMethods = "passbook")
	public void checkbook() {
		System.out.println("Hey..! This is checkbook Method..");
	}
	
}

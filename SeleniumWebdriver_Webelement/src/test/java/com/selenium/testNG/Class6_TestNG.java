package com.selenium.testNG;

import org.testng.annotations.Test;

// without set priority - method will execute in alphabetical order

public class Class6_TestNG {

	@Test
	public void account() {
		System.out.println("Hey..! This is Account Method..");
	}
	
	@Test
	public void amount() {
		System.out.println("Hey..! This is amount Method..");
	}
	
	@Test
	public void cash() {
		System.out.println("Hey..! This is cash Method..");
	}
	
	@Test
	public void bank() {
		System.out.println("Hey..! This is bank Method..");
	}
	
	
	@Test
	public void withdraw() {
		System.out.println("Hey..! This is withdraw Method..");
	}
	
	
	@Test
	public void checkBalance() {
		System.out.println("Hey..! This is checkBalance Method..");
	}
	
	
	@Test
	public void pendingBalance() {
		System.out.println("Hey..! This is pendingBalance Method..");
	}
	
	
	@Test
	public void ATM() {
		System.out.println("Hey..! This is ATM Method..");
	}
	
	
	@Test
	public void passbook() {
		System.out.println("Hey..! This is passbook Method..");
	}
	
	
	@Test
	public void checkbook() {
		System.out.println("Hey..! This is checkbook Method..");
	}
	
}

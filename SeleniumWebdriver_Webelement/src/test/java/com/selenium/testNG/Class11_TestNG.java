package com.selenium.testNG;

import org.testng.annotations.Test;

public class Class11_TestNG {

	@Test(groups = "1" )
	public void home() {
		System.out.println("This is Home method...");
	}
	
	@Test(groups = "1", dependsOnMethods = "home")
	public void login() {
		System.out.println("This is login method...");
	}
	
	@Test(groups = "2", dependsOnMethods = "login")
	public void product() {
		System.out.println("This is product method...");
	}
	
	
	@Test(groups = "2", dependsOnMethods = "product")
	public void logout() {
		System.out.println("This is logout method...");
	}
	
	
	@Test(groups = "3", dependsOnMethods = "logout")
	public void article() {
		System.out.println("This is Article Method...");
	}
}

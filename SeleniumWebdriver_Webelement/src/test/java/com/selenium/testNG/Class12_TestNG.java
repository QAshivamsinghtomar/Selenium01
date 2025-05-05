package com.selenium.testNG;

import org.testng.annotations.Test;

// groups, dependsOnGroups , dependsOnMethods, Priority

public class Class12_TestNG {

	
	@Test(priority = 1, groups = {"SmokeTest"})
	public void login() {
		System.out.println("This is login Methods....!!");
	}
	
	
	@Test(priority = 2, dependsOnMethods = {"login"}, groups = {"SmokeTest"} )
	public void home() {
		System.out.println("This is home Methods....!!");
	}
	
	
	@Test(priority = 3, dependsOnMethods = {"home"}, groups = {"SanityTest"}, dependsOnGroups = {"SmokeTest"})
	public void product() {
		System.out.println("This is product Methods....!!");
	}
	
	
	@Test(priority = 4, dependsOnMethods = {"product"}, groups = {"SanityTest"}, dependsOnGroups = {"SmokeTest"})
	public void rate() {
		System.out.println("This is rate Methods....!!");
	}
	
	
	@Test(priority = 5, dependsOnMethods = {"rate"}, groups = {"Security"}, dependsOnGroups = {"SanityTest"})
	public void addToCart() {
		System.out.println("This is addToCart Methods....!!");
	}
	
	
	@Test(priority = 6, dependsOnMethods = {"addToCart"}, groups = {"Functional"}, dependsOnGroups = {"Security"})
	public void payment() {
		System.out.println("This is payment Methods....!!");
	}
	
	
	@Test(priority = 7, dependsOnMethods = {"payment"}, dependsOnGroups = "Functional")
	public void deleviryDone() {
		System.out.println("This is deleviryDone Methods....!!");
	}
	
	
}

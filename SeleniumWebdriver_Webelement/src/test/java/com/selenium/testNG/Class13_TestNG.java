package com.selenium.testNG;

import org.testng.annotations.Test;

// groups, dependsOnMethods, dependsOnGroups

public class Class13_TestNG {

	@Test(groups = "A")
	public void AA() {
		System.out.println("AA Methods..");
	}
	
	@Test(dependsOnMethods = "AA", groups = "A", dependsOnGroups = "A")
	public void BB() {
		System.out.println("BB Methods..");
	}
	
	@Test(dependsOnMethods = "BB", groups = "B", dependsOnGroups = "A" )
	public void CC() {
		System.out.println("CC Methods..");
	}
	
	@Test(dependsOnMethods = "CC", groups = "B", dependsOnGroups = "A")
	public void DD() {
		System.out.println("DD Methods..");
	}
	
	@Test(dependsOnMethods = "DD", groups = "C", dependsOnGroups = "B")
	public void EE() {
		System.out.println("EE Methods..");
	}
	
	
}

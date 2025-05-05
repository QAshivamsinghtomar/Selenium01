package com.selenium.testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// optional

public class Class22_TestNG {

	@Test
	@Parameters({"name", "age","gender" })
	public void optional(
			@Optional("Shivam") String name,
			@Optional("30") String age,
			@Optional("Male") String gender) {
		
		System.out.println(name+"...."+age+"...."+gender);
		
	}
	
}

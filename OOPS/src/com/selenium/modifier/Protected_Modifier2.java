package com.selenium.modifier;

public class Protected_Modifier2 extends Protected_Modifier1 {

	public static void main(String[] args) {
		
		// Accessing protected modifier data from Protected_Modifier1 class by using extends keyword.
		Protected_Modifier1 modifier1 = new Protected_Modifier1();

		System.out.println(modifier1.empId);
		System.out.println(modifier1.empName);
		System.out.println(modifier1.empNumber);
		System.out.println(modifier1.empRollNumber);
		System.out.println(modifier1.empStatus);
		
		
		
	
		
	// Accessing Private modifier data from Private_Modifier class by using extends keyword.
		/*
		Private_Modifier modifier = new Private_Modifier();
		System.out.println(modifier.getempId());
		System.out.println(modifier.getEmpName());
		System.out.println(modifier.getEmpResult());
		System.out.println(modifier.getEmpRollNumber());
		*/
	}
	
}

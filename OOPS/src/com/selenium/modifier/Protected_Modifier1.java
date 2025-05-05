package com.selenium.modifier;

/*
=> Protected Modifier data can be access in same class 
=> Protected Modifier data can be access in another class of same package by using extends keyword.
=> Protected Modifier data also can be access in another package by using extends keyword.
*/

public class Protected_Modifier1 {	
	
	protected int empId = 101 ;
	protected String empName = "Anand" ;
	protected String empStatus = "Pass" ;
	protected long empNumber = 9878521040L ;
	protected int empRollNumber = 1052 ;
	
	
	public static void main(String[] args) {
		
		// Accessing protected modifier data in same class
		
		Protected_Modifier1 modifier1 = new Protected_Modifier1();
		System.out.println(modifier1.empId);
		System.out.println(modifier1.empName);
		System.out.println(modifier1.empNumber);
		System.out.println(modifier1.empRollNumber);
		System.out.println(modifier1.empStatus);
	}
}

package com.selenium.modifier;

/*
=> Private modifier data can be access in same package,
=> Private modifier data can be access in another class of same package by using extends keyword.
*/ 

public class Private_Modifier_1 extends Private_Modifier {

	public static void main(String[] args) {
		
		Private_Modifier_1 modifier_1 = new Private_Modifier_1();
		System.out.println(modifier_1.getempId());
		System.out.println(modifier_1.getEmpName());
		System.out.println(modifier_1.getEmpResult());
		System.out.println(modifier_1.getEmpRollNumber());
		
		
	}
}

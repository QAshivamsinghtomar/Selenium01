package com.selenium.methodoverloadind_overriding;

class Employee {
	
	void number(int i, double d) {
		System.out.println("Int-Double Argument");
	}
	
	void number(double d1, int a) {
		System.out.println("Double - Int Argument");
	}
	
	
}

public class Method_Overloading3 {

	public static void main(String[] args) {
	
		Employee employee = new Employee();
		// employee.number(10, 20); 
		
		// This will give ambiguous error because of 10 and 20 value is 
		 // accepting first method parameter and also accpeting second method parameter, So it will
		// gives error.
		
		// given value is accepting in both method parameter, So it will gives an error.
	}
}

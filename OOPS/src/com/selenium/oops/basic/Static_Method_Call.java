package com.selenium.oops.basic;

/*
-> We can call Static Method in 4 way - 
    1. If Method is static, we can call directly in Main Method.
    2. If Method is Static, we can call with Class Name - class_name.methodname
    3. If Method is Static, we can call by creating an object.
    4. If Method is Static, we can call by Null Reference Variable.
*/
public class Static_Method_Call {

	static  void m1() { 
		System.out.println("M1 Method");
	}
	
	static void m2() {
		System.out.println("M2 Method");
	}
	
	
	public static void main(String[] args) {
		
		// First Way to call Static Method
		m1();
		m2();
		
		System.out.println();
		
		// Second Way to call Static Method
		Static_Method_Call.m1();
		Static_Method_Call.m2();
		
		System.out.println();
		
		// Third Way to call Static Method
		Static_Method_Call call = new Static_Method_Call();
		call.m1();
		call.m2();
		
		System.out.println();
		
		// Fourth Way to call Static Method
		Static_Method_Call method_Call = null;
		method_Call.m1();
		method_Call.m2();

	}
	
}

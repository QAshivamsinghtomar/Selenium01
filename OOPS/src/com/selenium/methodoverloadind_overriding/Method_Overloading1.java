package com.selenium.methodoverloadind_overriding;
/*
-> Method Overloading - Compile Time Polymorphism

-> In Method overloading methods name will be same but methods parameter will be different in all 
   methods. It is called Method Overloading.
-> Method Overloading always goes to small data type to large data type. (byte-short-int). Is it called
   Automatic Type casting.
-> In Method Overloading we can change the methods parameter and also can change the position 
   of parameter.

*/


class methodOverloading{
	// Here all methods name are same but methods parameter are different in all methods.
	void m1() {
		System.out.println("No Argument Methods");
	}
	
	void m1(int i) {
		System.out.println("Single Argument Methods - Int");
	}
	
	void m1(int i, float f) {
		System.out.println("Double Argument Methods - Int and Float");
	}
	
	void m1(String s) {
		System.out.println("String Argument Methods");
	}
	
	void m1(int i, double d) {
		System.out.println("Double Argument Methods - Int and Double");
	}
}

public class Method_Overloading1 {

	public static void main(String[] args) {
		
		methodOverloading overloading = new methodOverloading();
		overloading.m1();
		overloading.m1(10, 20);
		overloading.m1(10, 30d);
	}
}

package com.selenium.oops.basic;
/*
 * Non Static Member 
 * -> Non Static Variable
 * -> Non Static Block
 * -> Non Static Method
 * -> Constructor
 
-> Non Static member will be execute at the time of object creation.
-> Non Static Member will be execute in the order of in which order they are written.
-> Object creation done in Heap Area
-> first will execute Non Static Variable and Non Static Block.
-> Method will be execute only when anyone will call that method.
-> Main method will be call automatically by JVM.
*/


public class Non_Static_Members {
	
	int i = m1() ; // Non Static Variable
	
	int m1() { // Non Static Method
		System.out.println("M1 - Method ");
		return i;	
	}
	
	
	{
		System.out.println("Non - Static Block "); // Non Static Block
	}
	
	public Non_Static_Members() { // Non Static Constructor
		System.out.println("This is Constructor");
	}
	
	
	public static void main(String[] args) {
		Non_Static_Members members = new Non_Static_Members();
		members.m1();
		System.out.println(members.i);
	}
	
	
	int m5 = m5();
	
	int m5() {
		System.out.println("M5 Method");
		return 10;
	
	}
	
}

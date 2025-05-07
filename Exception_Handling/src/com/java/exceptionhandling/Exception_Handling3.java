package com.java.exceptionhandling;

// Null Pointer Exception

public class Exception_Handling3 {

	public static void m1() {
		String a = "AAA";
		String b = null ;
		String c = "CCC";
		
		System.out.println(a.length());
		try {
			System.out.println(b.length());
		}
		catch(NullPointerException exception) {
			System.out.println("Invalid value ");
		}
		
		System.out.println(c.length());	
	}
	
	
	
	public static void m2() {
		String a = "Suraj";
		String b = null ;
		String c = "Shivam";
		
		System.out.println(a.charAt(2));
		try {
			System.out.println(b.charAt(2));
		}
		catch(NullPointerException exception) {
			System.out.println("Wrong Value.. Please Enter Correct Value");
		}
		System.out.println(c.charAt(2));
	}
	
	
	
	
	public static void main(String[] args) {
		m2();
	}
	
}

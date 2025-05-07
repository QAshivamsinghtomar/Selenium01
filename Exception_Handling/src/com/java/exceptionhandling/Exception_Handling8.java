package com.java.exceptionhandling;

/*
-> Throw Keyword - It is used to throw an Exception intensnaly
-> Syntex - throw new exceptionName("Message") ;
*/

public class Exception_Handling8 {
	
	public static void m1() {
		
		int a = 10, b = 0 ;
		try {
			System.out.println(a/b);
			throw new NullPointerException("Throw Null Pointer Exception");
		}
		catch(NullPointerException exception) {
			System.out.println("Wrong Exception ... Null Pointer Exception");
			//throw exception ;
		}
	}
	
	
	public static void m2() {
		try {
			throw new ArithmeticException("Numeric Exception");
		}
		catch(Exception exception) {
			System.out.println("Handeled");
			throw exception;
		}
	}
	
	
	public static void main(String[] args) {
		m2();
	}
	
}

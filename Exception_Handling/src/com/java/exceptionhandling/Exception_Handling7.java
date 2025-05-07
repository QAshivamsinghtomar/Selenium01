package com.java.exceptionhandling;
/* 
-> Finally Block
-> finally block always executed. 
-> finally block will be executed always weather excetion handled or not.
-> finally block is like a closing statment.
*/
public class Exception_Handling7 {

	// Without Exception case with finally block
	public static void m1() {
		int a = 20, b = 2 ;
		try {
			System.out.println(a/b);
		}
		catch(NullPointerException nullPointerException) {
			System.out.println("NullPointerException - Message");
		}
		finally {
			System.out.println("Finally block always executed- M1");
		}
	}
	
	
		
	public static void m2() {
	// Exception with not match catch block and finally block
		
		int a = 20, b = 0 ;
		try {
			System.out.println(a/b);
		}
		catch(IndexOutOfBoundsException exception) {
			System.out.println("IndexOutOfBoundsException - Invalid Exception");
		}
		finally {
			System.out.println("Finally block always executed - M2");
		}
	}
	

	
	public static void m3() {
		// Exception with correct catch block with finally block
		
		String a = "Shivam";
		try {
			System.out.println(a.charAt(9));
		}
		catch(StringIndexOutOfBoundsException boundsException) {
			System.out.println("StringIndexOutOfBoundsException - Invalid String value");
		}
		finally {
			System.out.println("Finally block always executed - M3");
		}
	}
	
	
	public static void main(String[] args) {
		m3();
	}
	
}

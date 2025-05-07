package com.java.exceptionhandling;

// Throws Keyword
// We can handle an exception in same method and we can also handle in another method and also main method.
public class Exception_Handling10 {
	
	public static void m1() throws ArithmeticException {
		
		System.out.println(10/0); // Here an Exception will come, Now we are delegating this exception
		                          // by using throws keyword.	
	}
	
	
	public static void m2() {
		
		try {
			m1(); // Here we know an exception will come, Now we are handling m1() exception in m2() method.
		}
		catch(ArithmeticException arithmeticException) {
			System.out.println("Wrong Value Entered ....Enter the Correct Value...!!");
		}
	}
	
	
	public static void main(String[] args) {
		m2(); // Here we can also delegate exception from m2 method by using throws keyword and 
		     // hendle in main method.
	}
	
}

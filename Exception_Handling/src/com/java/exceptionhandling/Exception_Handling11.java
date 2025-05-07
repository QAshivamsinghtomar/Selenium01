package com.java.exceptionhandling;

// Throw Keyword
// Syntax === throw new ExceptionName("Message"); 

public class Exception_Handling11 {
	
	public static void m1() throws Exception {
		throw new Exception("Exception is coming");
	}
	
	public static void m2() throws Exception {
		m1(); 
	}
	
	public static void main(String[] args) {
		try {
			m2();
		}
		catch(Exception exception) {
			System.out.println("We are Handeling Exception in Main Method...");
		}
	}
	
}
	

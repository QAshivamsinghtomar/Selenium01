package com.java.exceptionhandling;

import java.io.IOException;

/*
-> Throws Keyword ==> it is used for by passing excetion from parent method to caller method. 

-> Throws keyword used for by passing exception from which method that is containing exception 
   to caller method 
-> Throws keyword always written wtih method decleration 
   Example => public static void m1() throws Exception {}

Two way to handle an Exception ==> 1==> by passing exception by using throws keyword. 
                                   2==> handle exception by using try catch block.
*/

public class Exception_Handling9 {
	
	public static void m1() throws IOException  {
		
		// Here we are thowing an exception instensnaly - 
		//we can handle this exception or we can delegate this exception to caller method.
		throw new IOException("This is Checked Exception ...Throwing instensnaly");	 
	}
	
	
	public static void m2() {
		// here we are handling this exception - 1st way
		try {
			m1();
		}
		catch(IOException exception) {
			System.out.println("Here We handeled IO Exception");
		}
	}
	
	
	
	public static void m3() throws IOException { // Here we are delegate IO exception from this method
		
		m1();
	}
	
	
	public static void main(String[] args) throws IOException {
		m2();
		
		m3();
	}
}

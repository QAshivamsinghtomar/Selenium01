package com.java.exceptionhandling;
/*
-> Exception - Exception is an Object, these object will be created when any intrruption
			   occur in program at runtime.
-> In order to handle this exception we need to some mechanism. That Mechanism is a keyword
   try / catch / finally => with these keyword we can achieve ExceptionHandling.

-> In Exception Hierarchy - only 2 classes are partially checked Exception
   -> Throwable
   -> Exception

-> Q) Which Exception class is called as partially checked Exception and Fully checked Exception

-> Partially Checked Exception - Throwable and Exception, it is because these 2 classes
   contains CheckedException and UncheckedException.

-> Fully Checked Exception - Direct Subclasses of Exception class and its subclasses
   called as Fully CheckedException... (or)
-> Direct sub classes of CheckedException is called Fully CheckedException.

-> UncheckedException -> Direct Subclasses of RuntimeException(C) and Direct Subclasses of 
						 Error class is called UncheckedException.
-> The exception which are not checked by compilers called as UncheckedException

-> CheckedException ->   Direct Subclasses of Exception class called as CheckedException
-> The exception which are checked by compilers called as CheckedException.

*/

public class Exception_Handling1 {
	
	public static void m1() {
		// Code without Exception Handling
		
		System.out.println(10/2);
		System.out.println(20/2); // Till this line programe is executing properly, in next line an
		// exception is occured, to handle this occur we need some keyword.that is exception handling.
		System.out.println(30/0); // Exception Occur
		
		System.out.println(40/2); // This line will not execute
		System.out.println(50/2); // This line will not execute			
	}
	
	
	public static void m2() {
		// Same code with Exception Handling - try and catch block.
		
		System.out.println(10/2);
		System.out.println(20/2);
		
		try{ 
			 System.out.println(30/0);
			}
		    catch (ArithmeticException arithmeticException){
			System.out.println("Invalid Input, Please Enter Correct Value..!!");
		}
		
		System.out.println(40/2);
		System.out.println(50/2);
	
	}
	
	public static void main(String[] args) {
		m2();
	}	

}

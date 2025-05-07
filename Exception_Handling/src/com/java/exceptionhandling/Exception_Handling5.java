package com.java.exceptionhandling;



public class Exception_Handling5 {

	// Exception related catch block not match then abnormal termination - No Super Excetion
	public static void m1() {
		
		int a = 10, b = 0 ; // Here Arithmetic Exception will come but related catch block is 
		                    //   not available
		
		try {
			System.out.println(a/b);
		}
		catch(NullPointerException nullPointerException) {
			System.out.println("NullPointerException Message");
		}
		catch(StringIndexOutOfBoundsException boundsException) {
			System.out.println("StringIndexOutOfBoundsException Message");
		}
	}
	
	
	
	
	// Exception related correct catch block not available but super exception available - Normal Termination
	public static void m2() {
		int a = 10, b = 0 ; // Here Arithmetic Exception will come but related catch block is 
        //   not available but supper exception catch block available - Normal termination

		try {
			System.out.println(a/b);
		}
		catch (StringIndexOutOfBoundsException boundsException) {
			System.out.println("StringIndexOutOfBoundsException Message");
		}
		catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println("ArrayIndexOutOfBoundsException Message");
		}
		catch(Exception exception) {
			System.out.println("Exception Message - Supper");
		}
		
        
	}
	
	
	public static void main(String[] args) {
		m2();
	}
}

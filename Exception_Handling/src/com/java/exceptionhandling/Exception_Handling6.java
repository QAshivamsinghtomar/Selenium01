package com.java.exceptionhandling;

// We can also write n number of try catch block inside a try block.

// try and catch block inside a try block 

public class Exception_Handling6 {

	public static void m1() {
		
		
		try {
			// 1st Try block
			try {
				String a = "Ram";
				System.out.println(a.charAt(5));
			}
			catch(StringIndexOutOfBoundsException boundsException) {
				System.out.println("StringIndexOutOfBoundsException - Invalid Value");
			}
			
			
			// 2nd try block
			try {
				int a = 10 , b = 0 ;
				System.out.println(a/b);
			}
			catch(ArithmeticException arithmeticException) {
				System.out.println("ArithmeticException - Invalid value");
			}
			
			
			// 3rd Try block
			try {
				int array[] = {10, 20, 30, 40};
				System.out.println(array[5]);
			}
			catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
				System.out.println("ArrayIndexOutOfBoundsException - Invalid value");
			}
		}
		catch(Exception exception) {
			System.out.println("Exception - Super Exception Message");
		}
	}

	public static void main(String[] args) {
		m1();
	}
}

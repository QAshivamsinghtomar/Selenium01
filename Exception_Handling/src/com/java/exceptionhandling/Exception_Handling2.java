package com.java.exceptionhandling;

import java.util.Scanner;

/*
Arithmetic Exception - when any exception is came in numerical value calculation, then Arithmetic
                       exception will come.
*/

public class Exception_Handling2 {

	public static void m1() {
		
		while(true) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 Number = ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a/b); // Without Exception Handling code
		}
	}
	
	public static void m2() {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter 2 Number = ");
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			
			try {
				System.out.println(a/b); // With Exception Handling code
			}
			catch (ArithmeticException arithmeticException) {
				System.out.println("Invalid input... Please Enter correct value");
			}
			
			}
	}
	
	public static void main(String[] args) {
		m2();
	}
	
}

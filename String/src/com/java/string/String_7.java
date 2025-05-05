package com.java.string;

import java.util.Scanner;

// StringBuffer 

public class String_7 {	

	public static void m1() {
	
		// How to reverse a String value by using StringBuffer -- Important - 1st way
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Value =");
		String value = scanner.nextLine();
		
		StringBuffer buffer = new StringBuffer(value);
		buffer.reverse();
		System.out.println(buffer);
		
		scanner.close();
		
	}
	
	public  static void m2() {
		// How to reverse a String value by using for loop -- Important - 2nd way
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Value =");
		String value = scanner.nextLine();
		
		String reverseValue = "" ;
		
		// value length
		int valueLength = value.length();
		for(int i=valueLength-1; i >=0; i--) { // Main logic
			
			reverseValue = reverseValue + value.charAt(i); // Main logic
		}
		System.out.println("Main Value = "+value);
		System.out.println("Reverse Value = "+reverseValue);

		
	}
	
	
	
	public static void m3() {
		
		String value = "RAM"; 
		
		String reverseValue = "" ;
		
		int length =  value.length();
		
		for(int i=length-1; i>=0; i--) {
			reverseValue = reverseValue+value.charAt(i) ;
		}
		
		System.out.println("Orginal value ="+value);
		System.out.println("Reverse  value ="+reverseValue);
	}
	
	public static void main(String[] args) {
	 
		m3();
	
	}

}
	
	
	
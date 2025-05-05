package com.java.string;

import java.util.Scanner;

public class String_4 {	
	
	public static void m1() {
		
		// Checking Character and Index value in a String
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String Value : ");
		String value = scanner.nextLine();
		
		int valueLength = value.length(); // Checking length of String value
		
		for(int i = 0 ; i < valueLength ; i++) {
			System.out.println("String Value Index = "+ i+ " String value character = "+value.charAt(i));
			
		}
		
	}
	
	
	public static void m2() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String Value = ");
		String value =  scanner.nextLine();
		
		// Checking Length of Value
		int length = value.length();
		
		for(int i=0 ; i<length ; i++ ) { // For Loop
			if(i%2 == 0) // Even value will be include only
			
				System.out.println("String Value Index = "+ i+ " String value character = "+value.charAt(i));	
		}
		
	}
				
	
	
	
	
	public static void main(String[] args) {
		m2();
	}
}

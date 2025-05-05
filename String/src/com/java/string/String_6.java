package com.java.string;

import java.util.Scanner;

// Checking how many Special character available in a String

public class String_6 {	

	public static void m1() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String Value =");
		String value = scanner.nextLine();
		
		// Value Length
		int valueLength = value.length();
		
		int specialchar = 0 ;
		for(int i=0; i<valueLength; i++) {
			
			// converting value in character sequence
			 char ch = value.charAt(i);
			 
			 if(!((ch>='a' && ch<='z') || (ch>='A' && ch <='Z') || (ch>='0' && ch <='9')  && (ch==' '))) {
				specialchar++ ; 
			 }
		}
		System.out.println("Special Character in a String = "+specialchar);	
	}
	
	public static void main(String[] args) {
		m1();
	}
	
}
	
	
	
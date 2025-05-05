package com.java.string;

// first Program - Check vowel and consonent count in a String value
//second Program - Check A to Z capital count from a String
// third Program - Check numeric value from the string


import java.util.Scanner;

public class String_5 {	

	public static void m1() {
		// Checking Vowel and Consonants count from a String value
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value: ");
		String value = scanner.nextLine();
		
		int vowelCount = 0;
		int consonant = 0;
		
		int length = value.length(); // Length of String value
		
		for(int i=0; i<length; i++) {
			char ch = value.charAt(i); // Converting value in character sequence
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++ ;
			}
			else {
				consonant ++ ;
			}
				
		}
		System.out.println("Vowel Count = "+vowelCount);
		System.out.println("Consonant Count = "+consonant);
				
	}
	
	
	
	public static void m2() {
		// Checking How many capital latter in the String value
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String Value =");
		String value = scanner.nextLine();
		
		int count = 0 ;
		//Length of Value
		int length = value.length();
		
		for(int i=0; i<length ; i++) {
			// Checking how many capital latter available in the value
			if(value.charAt(i) >= 'A' && value.charAt(i) <= 'Z') {
				count++ ;
			}
		}
		System.out.println("A to Z Count = "+count);	
	}
	
	
	public static void m3() {
		
		// Checking How many numberic value in the String 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a int Value =");
		String value = scanner.nextLine();
		
		int intCount = 0 ;
		int valueLength =  value.length(); // String Value length
		
		for(int i=0; i<valueLength ; i++) {
			if(value.charAt(i) >= '1' && value.charAt(i) <= '9') {
				intCount++ ;
			}
			
		}
		System.out.println("Int Count from the String Value ="+intCount);
		
	}
	
	
	
	public static void main(String[] args) {
		m3();
	}
}
	
	
	
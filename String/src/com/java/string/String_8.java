package com.java.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class String_8 {	
	
	public static void m1() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String = ");
		String value = scanner.nextLine();
		
		StringBuffer buffer1 = new StringBuffer();
		
		StringTokenizer tokenizer = new StringTokenizer(value);
		
		while(tokenizer.hasMoreTokens()) {
			String toakeValue =  tokenizer.nextToken();
			StringBuffer buffer2 = new StringBuffer(toakeValue);
			
			buffer2.reverse();
			buffer1.append(buffer2);
			buffer1.append(" ");
			
		}
		System.out.println(buffer1);
		
	}
	
	public static void main(String[] args) {
		m1();
	}
	
	
}
	
	
	
	
	
	
package com.selenium.oops.basic;
/*
=> Static Member control flow
=> When class is loaded in method Area then Static Block and Static Variable will be execute first.

=> Non static member will be execute when object is creating and object creation done in heap area
   and non static member will be execute in heap area and memory allocation is also done in heap area. 
   
=> Method calling is done in Stack Area.   
*/
public class Static_Member {

	static { // First Static Block
		System.out.println("Static - Block - 1");
		System.out.println(Static_Member.i);
	}
	

	static int i = m1() ; // Static Variable
	
	static { // Second Static Block
		System.out.println("Static-Block - 2");
		System.out.println(Static_Member.i);
	}
	
	
	static int m1() { // Static Method
		System.out.println("Static Method");
		return 10 ; 
	}
	
	
	public static void main(String[] args) {
		
		
	}


	
}

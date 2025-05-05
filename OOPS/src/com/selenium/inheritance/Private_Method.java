package com.selenium.inheritance;

/*
-> In java private method can not be inherit in inheritance.
-> private method can not be extends in inheritance.
 */


class A {
	
	void m1() {
		System.out.println("M1 Method from A class");
	}
	private void m2() {
		System.out.println("M2 Method from A class");
	}
}



class B extends A {
	void m3() {
	System.out.println("M3 Method from B class");	
	}
	
}



public class Private_Method {

	public static void main(String[] args) {
	B b = new B();
	b.m1();
	b.m3();
	 //b.m2(); // This will show an error because of m2 method is private
	  
		
	}
	
}

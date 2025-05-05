package com.selenium.finalkeyword;

//final class

//final class can not be extends 
//but final class can be extended other non final class


 class A{  // here if we use final class then this class can not be extended 
	void m1() {
		System.out.println("m1 from A class");
	}
}

final class B extends A { // here it will show an error
	void m1() {
		System.out.println("m1 from B class");
	}
}


public class Final_Class {
public static void main(String[] args) {
	//A a = new B();
	//a.m1();
	
	B b = new B();
	b.m1();
}
	
}

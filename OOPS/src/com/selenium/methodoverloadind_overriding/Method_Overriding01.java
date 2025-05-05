package com.selenium.methodoverloadind_overriding;

/*
-> Method Overridding - Run Time Polymorphism
-> In Method Overriding method name will be same in both class (parant and child). IN Method overriding
   IS-A-Relationship (extends) is mandatory and MethodOverriding is possible only in 2 classes.

-> private, final and static method can not be override.

-> Reference of Parent class = Object of child class.
-> Ex. m1() method is available in both class(parant and child), first it will execute from child class,
   if not available in child then only it will execute from parant class.
*/

class Parent {
	
	void m1() {
		System.out.println("M1 Method From Parent Class");
	}
}

class Child extends Parent {
	void m1() {
		System.out.println("M1 Method From Child Class");	
	}
}


public class Method_Overriding01 {

	public static void main(String[] args) {
		 
	//	Parent parent = new Parent();
	//	 parent.m1(); // execute from Parent class
		
		
	//	Child child = new Child();
	//	child.m1(); // Execute from Child Class
	
	
	// Polymorphism 
		
		
		Parent parent1 = new Child();
		parent1.m1(); // Execute from Child class
	
	}
}

package com.selenium.inheritance;
/*
=> In Multilevel Inheritance, One class inherit another class and that class inherit another one class.
   it is called multilevel inheritance.
=> In this inheritance child class inherit parent class properties and parent class inherit 
   grandparent class properties, It is like a chain type inheritance, child class extending 
   Parent class and Parent class extending GrandParent class properties. it is called 
   Multilevel inheritance.
*/

class Grandparant {

	int a = 10; 
	void g1() {
	System.out.println("G1 Method from Grandparent class");
	System.out.println(a);
	}
	
	void g2() {
		System.out.println("G2 Method from Grandparent class");
	}
	
}

class Parent extends Grandparant {
	int b = 20 ;
	void p1() {
		System.out.println("P1 Method from Parent class");
		System.out.println(b);
	}
	
	
	void p2() {
		System.out.println("P2 Method from Parent class");
	}
}


class Child extends Parent {
	
	int c = 30 ;
	void c1() {
		System.out.println("C1 Method from Child class");
		System.out.println(c);
	}
	
	void c2() {
		System.out.println("C2 Method from Child class");
	}
}

public class Multilevel_Inheritance {
	
	public static void main(String[] args) {
		
		// Child class Object - All Methods (Grandparent, parent and child) available in child class.
		Child child = new Child();
		child.c1();
		child.c2();
		child.p1();
		child.p2();
		child.g1();
		child.g2();
		
		
		// Parent class Object - Only Parent and Grand parent class methods are available here.
		Parent parent = new Parent();
		parent.p1();
		parent.p2();
		parent.g1();
		parent.g2();
		
		
		// Grandparent Class Object - Only Grandparent class methods are available here.
		Grandparant grandparant = new Grandparant();
		grandparant.g1();
		grandparant.g2();
	}
	

}

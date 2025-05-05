package com.selenium.polymorphism;

/*
-> Polymorphism in Java is a fundamental concept in object-oriented programming (OOP) 
   that allows objects to take on many forms.
-> There are 2 type of polymorphism in java
   => Compile Time polymorphism (Method Overloading)
   => Runtime Polymorphism (Method Overriding)
-> Method Overloading - In Method Overloading methods will be same but methods parameter will be 
   different in all methods.
-> Method Overriding - In this process method should be same in both class ( Parent and Child Class),
   IS-A relationship should be there (extends keyword).
-> Refrance of Parent class = object of Child class

*/

class Poly_grand {
	
	void pg() {
		System.out.println("PG Method from Poly Grand class");
	}
	
	void m1() {
		System.out.println("M1 Method from Poly Grand Class");
	}
}


class Poly_Parent extends Poly_grand {
	void pp() {
		System.out.println("PP Method from Poly Parent Class");
	}
	
	void m1() {
		System.out.println("M1 Method from Poly Parent Class");
	}
}



class Poly_child extends Poly_Parent{
	void pc() {
		System.out.println("PC Method from Poly Child Class");
	}
	
	void m1() {
		System.out.println("M1 Method from Poly Child Class");
	}
}



public class Polymorphism1 {

public static void main(String[] args) {
	
	
	//Poly_grand grand = new Poly_grand();
	//grand.m1();
	//grand.pg();
	
	//Poly_Parent parent = new Poly_Parent();
	//parent.pg();
	//parent.pp();
    //parent.m1();
	
	
	//Poly_child child = new Poly_child();
	//child.pc();
	//child.pp();
	//child.pg();
	//child.m1();
	
	
	
	/*
	Poly_grand grand1 = new Poly_Parent(); // It is correct 
	//Poly_Parent parent1 = new Poly_grand(); // /It is wrong
	
	grand1.m1(); // Here it will execute from Poly_Parent class, if not available then it will execute
	                // from Poly_grand class.
	grand1.pg();
	//grand1.pp(); // it will not execute because of pp method is available in Poly_parent class and 
	// this object is created of Poly_grand class.
	*/
	
	
	
	/*
	Poly_grand grand2 = new Poly_child();
	grand2.m1(); // it will execute from Poly_child class, if not available then execute from Poly_grand.
	grand2.pg();
	// grand2.pc(); - it will not execute, it is available in Poly_child class.
	*/
	
	
	 // Poly_Parent parent2 = new Poly_grand(); // It is wrong 
     // Poly_child child = new Poly_grand(); // It is wrong
	// Poly_child child2 = new Poly_Parent(); // It is wrong
	
	
	
	Poly_Parent parent3 = new Poly_child();
	parent3.m1();
	parent3.pg();
	parent3.pp();
    // parent3.pc(); // It will not execute, because of it is available in Poly_child class.
	
}
}

package com.selenium.oops.basic;

/*
-> It is also a special type of method which does not have any return type.
-> Constructor name same as java class name.
-> Constructor will execute automatically when object is created.  

-> Constructor are 3 Type.
    1. Default Constructor 
    2. Parameterized Constructor
    3. Copy Constructor
 */


public class Constructor {

	 Constructor() {  // Default Constructor
		this(10); // Calling another Constructor From a Constructor
		System.out.println("Default Constructor");
	}
	
	 Constructor(int a) { // Single Value Constructor
		this(20, 'B');
		System.out.println("Single Value - Parameterized Constructor");	
	}
	
	 Constructor(int a, char b) { // Double Value Constructor
		System.out.println("Double Value - Parameterized Constructor");
	}
	
	 Constructor(int a, float f) { // Double Value Constructor
		System.out.println("Int-Float  - Parameterized Constructor");
	}
	
	 Constructor(int a, String s) { // Double Value Constructor
		System.out.println("Int-String  - Parameterized Constructor");
	}
	
	
	
	// Copy Constructor
	Constructor(Constructor constructor){
		System.out.println("This is Copy Constructor");
	}
	
	
	
	
	
	public static void main(String[] args) { // Main Method
		Constructor constructor = new Constructor(); // Default Constructor Calling
		//Constructor constructor1 = new Constructor(10); // Single Value Constructor
		//Constructor constructor2 = new Constructor(20, 'A'); // Int-Char Constructor Calling
		//Constructor constructor3 = new Constructor(30, 40.0F); // Int-Float Constructor Calling
		//Constructor constructor4 = new Constructor(50, "Shivam"); // Int-String Constructor Calling
		
		// Copy Constructor Calling
		
		//Constructor constructor5 = new Constructor(constructor1);
		
	}
	
}

package com.selenium.polymorphism;

class Dog {
	void animal() {
		System.out.println("Dog - Animal ");
	}
	
	void dogcolor() {
		System.out.println("Dog color is Black");
	}
}


class Cat extends Dog {
	void animal() {
		System.out.println("Cat - Animal");
	}
	
	void catColor() {
		System.out.println("Cat color is White");
	}
}


public class Polymorphism2 {

	public static void main(String[] args) {
		
		Dog dog = new Cat(); // Correct Way 
		dog.animal(); // Here animal will execute from Cat class, if not available in Cat class 
		              // then only execute from Dog class
		dog.dogcolor();
	//	dog.catColor(); // It will not execute, object create of Dog class.
	
		
	//	Cat cat = new Dog(); // Wrong Way 
		
	}
}

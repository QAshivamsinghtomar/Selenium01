package com.selenium.inheritance;

/*
-> In Hierarchical Inheritance one parent class is share its to multiple child classes, it is called 
   Hierarchical inheritance.
   
-> In Hierarchical Inheritance multiple child classes inherit one parent class properties, It is 
   called Hierarchical Inheritance. 
*/

class Hierarchical_Parent {
	
	void hp1() {
		System.out.println("HP1 Method from Hierarchical_Parent ");
	}
	
	void hp2() {
		System.out.println("HP2 Method from Hierarchical_Parent ");
	}
	
}

class Hierarchical_Child1 extends Hierarchical_Parent {
	
	void hc1() {
		System.out.println("HC1 Method from Hierarchical_Child1");
	}
	
	void hc2() {
		System.out.println("HC2 Method from Hierarchical_Child1");
	}
}


class Hierarchical_Child2 extends Hierarchical_Parent {
	
	void hc01() {
		System.out.println("HC01 Method from Hierarchical_Child2");
	}
	
	void hc02() {
		System.out.println("HC02 Method from Hierarchical_Child2");
	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		// Hierarchical_Child2 class Object and methods available in Hierarchical_Child2 class.
		Hierarchical_Child2 child2 = new Hierarchical_Child2();
		child2.hc01();
		child2.hc02();
		child2.hp1();
		child2.hp2();
		
		
		// Hierarchical_Child1 class Object and methods available in Hierarchical_Child1 class.
		Hierarchical_Child1 child1 = new Hierarchical_Child1();
		child1.hc1();
		child1.hc2();
		child1.hp1();
		child1.hp2();
		
		
		// Hierarchical_Parent class Object and methods available in Hierarchical_Parent class.
		Hierarchical_Parent parent = new Hierarchical_Parent();
		parent.hp1();
		parent.hp2();
	}
	
	
}

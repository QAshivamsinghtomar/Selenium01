package com.selenium.inheritance;

/*
=> In single inheritance one class is sending their properties to another single class. 
   it is called single inheritance.
=> In Single inheritance, child class inherit the features of one Parent class, it is called 
   single inheritance.(Child class inherit the properties of Parent class)
 
-> Hybrid Inheritance - combination of any 2 inheritance is called hybrid inheritance. java does not
    support it.
-> Cyclic Inheritance - Extending the properties of same class, it is meaningless. It is called 
   Cyclic inheritance. Java does not support it. 
*/

class Student{
	
	int a = 100 ;
	void s1() {
		int s2 = 10 ;
		System.out.println("S2 Value = "+s2);
		System.out.println("S1 Method from Student Class");
	}
}

class Employee extends Student { // Here Employee Class is extending the properties of Student class.
	
	int b = 200 ;
	void e1() {
		int e2 = 20 ;
		System.out.println("E2 Value = "+e2);
		System.out.println("E2 Method from Employee Class");
	}
}




public class Single_Inheritance {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.s1();
		employee.e1();
		System.out.println(employee.a); 
		System.out.println(employee.b);
	}
}

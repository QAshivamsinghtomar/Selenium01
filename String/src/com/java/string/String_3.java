package com.java.string;
// ==(Equality Operator) and .equals() Method compression Programe

class Demo{
	
	int id ;
	String name ;
	
	public Demo(int id, String name) { // Constructor
		this.id = id ;
		this.name = name ;
	}
	
	public boolean equals(Demo d) {
		return (d.name).equals(this.name) && d.id == this.id ;
		
	}
	
	/*
	public boolean equals(Demo d) {
		return (d.name).equals(this.name) &&  d.id == this.id ;
	}
	*/	
}
	

public class String_3 {

	public static void main(String[] args) {
		Demo demo1 = new Demo(1, "Raj");
		Demo demo2 = new Demo(2, "Ram");
		Demo demo3 = new Demo(3, "Ved");
		Demo demo4 = new Demo(2, "Ram");
		
		
		
		System.out.println(demo1 == demo2); // False
		System.out.println(demo1 == demo3); // False
		System.out.println(demo1 == demo4); // False
		System.out.println(demo2 == demo3); // False
		System.out.println(demo2 == demo4); // False
		System.out.println(demo3 == demo4); // False
		
		System.out.println();
		System.out.println();
		
		
		System.out.println(demo1.equals(demo2)); // False
		System.out.println(demo1.equals(demo3)); // False
		System.out.println(demo1.equals(demo4)); // False
		System.out.println(demo2.equals(demo3)); // False
		System.out.println(demo2.equals(demo4)); // True
		System.out.println(demo3.equals(demo4)); // False
		
	}
	
	
}

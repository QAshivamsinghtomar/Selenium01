package com.selenium.methodoverloadind_overriding;

/*
-> In Method Overriding Static method can no be override.
-> Static method can not be override.
*/

class Pstatic {
	
	static void m1() {
		System.out.println("M1 Method from Pstatic class");
	}
}


class Cstatic extends Pstatic {
	static void m1() {
		System.out.println("M1 Method from Cstatic class");
	}
}

public class Method_Overriding2 {

	public static void main(String[] args) {
		Pstatic pstatic = new Cstatic();
		pstatic.m1(); // It will execute from Pstatic class, because of Static method can not be 
		// override. if method was not static then it will execute from Cstatic class.
		
	}
}

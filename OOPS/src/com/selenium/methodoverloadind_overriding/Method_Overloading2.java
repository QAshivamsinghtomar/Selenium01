package com.selenium.methodoverloadind_overriding;

class Demo{
	
	int sum() {
		return 0 ;
	}
	
	int sum(int i) {
		return i ;
	}
	
	
	
	int sum(int i, int j) {
		return i + j ;
	}
	
	
	int sum(int i, int j, int k) {
		return i + j + k ;
	}
	
	
	int sum(int i, int j, int k, int l) {
		return i + j + k + l ;
	}
	
	
	int sum(int i, int j, int k, int l , int m) {
		return i + j + k + l + m ;
	}
	
}


public class Method_Overloading2 {

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.sum());                         // No Argument
		System.out.println(demo.sum(10));                       // Single Argument
		System.out.println(demo.sum(20, 30));                   // Double Argument
		System.out.println(demo.sum(40, 50, 60));               // Triple Argument
		System.out.println(demo.sum(70, 80, 90, 100));          // Four Argument
		System.out.println(demo.sum(110, 120, 130, 140, 150));  // Five Argument
		
	}
}

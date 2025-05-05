package com.selenium.inheritance;

/*
-> In java Protected Method can be inherit in inheritance
-> Protected Method will be extends in inheritance.

*/



class AA {
	
	void m1() {
		System.out.println("M1 from A class ");
	}
	
	protected void m2() {
		System.out.println("M2 from A class - protected");
	}
} 

class BB extends AA {
	
	void m3() {
		System.out.println("M3 from B class ");
	}
	
	protected void m4() {
		System.out.println("M2 from B class - protected");
	}
} 



public class Protected_Method {

	public static void main(String[] args) {
	 BB bb = new BB();
	 bb.m1();
	 bb.m2();
	 bb.m3();
	 bb.m4();

	}

}

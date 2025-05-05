package com.selenium.inheritance;

class p{
	void m1() {
		System.out.println("M1 from P");
	}
}
class q extends p {
	void m1() {
		System.out.println("M1 from q");
	}
}

class r extends q {
	void m1() {
		System.out.println("M1 from r");
	}
}



public class Test {

	public static void main(String[] args) {
	  q q1 = new r();
	  q1.m1();	  

	}

}

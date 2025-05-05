package com.selenium.finalkeyword;

//Final Method

//final method can not be override.
//but final method can override non final method.



class Sample {
	//final void m1()  // here if we use final method, then this method can not be override.
	{
		System.out.println("m1 method from Sample class");
	}
}

class Demo extends Sample{
	final void m1() // here it will show an error, because of in sample class m1 method is final.
	{
		System.out.println("m1 method from Demo class");
	}
	
}


public class Final_Method {

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.m1();
	}
	
}

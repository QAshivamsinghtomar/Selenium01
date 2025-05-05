package com.selenium.factorymethod;

/*
-> Factory Method - A Method witch is returning its own class, It is called Factory Method.
-> Factory Method are 2 Type - 
                             -> Static Factory Method
                             -> Instance Factory Method
*/

class Sample{
	
	public Sample() {
		System.out.println("This is constructor");
	}
	
	
	void sampleMethod() {
		System.out.println("sampleMethod - From Sample Class");
	}
	
	// Factory Method
	static Sample factoryMethod() { 
		Sample sample = new Sample();
		return sample;
		
	}		
}




class Demo{
	
	private Demo() {
		System.out.println("Constructor");
	}
	
	void m1() {
		System.out.println("M1 From Demo");
	}
	
	static Demo demoFactory(){
		Demo demo = new Demo();
		return demo;}
	
}



public class Factory_Method {

	public static void main(String[] args) {
		
		Sample sample1 = Sample.factoryMethod();
		sample1.sampleMethod();
		
		
		Demo demo = Demo.demoFactory();
		demo.m1();
		
	}
}

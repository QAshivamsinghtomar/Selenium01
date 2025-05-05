package com.selenium.abstract_interface;

public class Test2 extends Adapter_Class {
	@Override
	public void changePin() {
		System.out.println("changePin Method From Interface1_ATM Interface");	
	}

	@Override
	public void color() {
		System.out.println("color Method From Interface2_Bike Interface");
		
	}
	
	
	public void bikeType() {
		System.out.println("bikeType Method From Interface2_Bike Interface");
		
	}
	
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.changePin();
		test2.color();
		test2.bikeType();
		
	}

}

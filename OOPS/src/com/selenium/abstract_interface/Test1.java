package com.selenium.abstract_interface;

public class Test1 extends Adapter_Class {
	@Override
	public void insertCard() {
		System.out.println("insertCard Method From Interface1_ATM Interface");	
	}

	@Override
	public void cardType() {
		System.out.println("cardType Method From Interface1_ATM Interface");	
	}

	@Override
	public void cardHolderName() {
		System.out.println("cardHolderName Method From Interface1_ATM Interface");	
	}
	
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.insertCard();
		test1.cardType();
		test1.cardHolderName();
		
	}

}

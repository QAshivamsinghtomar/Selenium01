package com.selenium.abstract_interface;
/*
-> Here class implement interface
-> If we are writing method without body in a class then that class should be abstract( it is mandatory)
   and that method called abstract method.

-> And abastract class can heave abstract and non abstract methods.
*/

public abstract class Implementation_Data implements Interface1_ATM, Interface2_Bike {

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

	@Override
	public void enterPin() {
		System.out.println("enterPin Method From Interface1_ATM Interface");		
	}

	@Override
	public void enterAmount() {
		System.out.println("enterAmount Method From Interface1_ATM Interface");	
	}

	@Override
	public void invalidPin() {
		System.out.println("invalidPin Method From Interface1_ATM Interface");	
	}

	@Override
	public void invalidAmount() {
		System.out.println("invalidAmount Method From Interface1_ATM Interface");	
	}

	@Override
	public void changePin() {
		System.out.println("changePin Method From Interface1_ATM Interface");	
	}

	@Override
	public void color() {
		System.out.println("color Method From Interface2_Bike Interface");
		
	}

	@Override
	public void model() {
		System.out.println("model Method From Interface2_Bike Interface");
		
	}

	@Override
	public void speed() {
		System.out.println("speed Method From Interface2_Bike Interface");
		
	}

	@Override
	public abstract void bikeType();

	@Override
	public abstract void gear();

	@Override
	public abstract void fuelTank();

}

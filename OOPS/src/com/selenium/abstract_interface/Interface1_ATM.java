package com.selenium.abstract_interface;

public interface Interface1_ATM {
	
	public abstract void insertCard(); // Here abstract is defaultly added, we can write or no need to 
	public void cardType();            // write defaultly it is added, it means abstract methods   
	public void cardHolderName();
	public void enterPin();
	public void enterAmount();
	public void invalidPin();
	public void invalidAmount();
	public void changePin();
	
}

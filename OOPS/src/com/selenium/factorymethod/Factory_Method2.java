package com.selenium.factorymethod;

/*
-> Factory Method - A Method witch is returning its own class, It is called Factory Method.
-> Factory Method are 2 Type - 
                             -> Static Factory Method
                             -> Instance Factory Method
*/



public class Factory_Method2 {

	public static void main(String[] args) {
		
	/*	
		Static Factory Method - Where we use 
		======================================================
	  
	      Class c = Class.forName("A");
	      NumberFormat numberFormat = NumberFormat.getInstance();
	      ResourceBundle rb = ResurceBundle.getInstance()
	      
	      
	 Instance Factory Method
	 =============================================
	 String s1 = new String("Java Selenium");
	
	 String s2 = s1.concat("Pune");
	 
	*/
		
	String s1 = new String("Java Selenium");
	
	String s2 = s1.concat("Pune");
	      
	}

}

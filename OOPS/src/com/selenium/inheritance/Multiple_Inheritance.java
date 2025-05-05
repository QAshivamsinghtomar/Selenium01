package com.selenium.inheritance;

/*
-> Multiple Inheritance is not supported in java.

-> In Multiple Inheritance, Multiple Parent classes is sending their properties to single Child 
   classes. It is called Multiple Inheritance. But in Java Multiple Inheritance is not supported.
*/


/*
class Parent_Inheritance1{}

class Parent_Inheritance2{}

class Parent_Inheritance3{}



class Child_Inheritance1 extends Parent_Inheritance1,
                                 Parent_Inheritance2,
                                 Parent_Inheritance3 {
	
}
*/

/*
-> It is look like a inheritance but it is not, 
   It is look like a inheritance but it is not inheritace.
   Becasue of we can not create object of interface.
*/

interface Parent_Inheritance1{}

interface Parent_Inheritance2{}

interface Parent_Inheritance3{}


interface Child_Inheritance1 extends  Parent_Inheritance1,
                                         Parent_Inheritance2,
                                         Parent_Inheritance3 {
	
}







public class Multiple_Inheritance {

	public static void main(String[] args) {
		
		
		
	}
	
	
	
}

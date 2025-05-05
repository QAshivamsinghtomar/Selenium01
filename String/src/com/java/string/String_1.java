package com.java.string;

/*
String
==========
-> It is like a collection of character, It is a sequence of character.
-> String data is immutable, can not do modification in same object and if will try to do modification
   new object will be created.( We can not do modification is same object in String)

-> String are 4 Type.   
   => String 
   => StringBuffer
   => StringBuilder
   => StringTokenizer
   
-> StringBuffer, StringBuilder and StringTokenizer are mutable (Modification can be done in same object).  
*/

public class String_1 {

	public static void m1() {
		
		// 1st way to write String Data
		String string = new String("API Testing");
		System.out.println(string);
		
		//2nd way to write String data
		String s1 = "Java Selenium" ;
		System.out.println(s1);
		
	}
	
	public static void m2() {
		
		String string1 = new String(" JAVA SELENIUM ");
		System.out.println(string1); // JAVA SELENIUM
		string1.concat(" TESTING ");
		System.out.println(string1); // JAVA SELENIUM - Here answer is also same, because of String is
		                                               // immutable in same object.
		
		String string2 = new String(" PYTHON SELENIUM ");
		System.out.println(string2); // PYTHON SELENIUM
		
		string2 =  string2.concat(" TESTING ");
		System.out.println(string2); //PYTHON SELENIUM TESTING - Here answer will be change, because of
		                                    // we are holding data by string2
		
	}
	
	public static void m3() {
		// We can do modification in same object in StringBuffer
		
		StringBuffer buffer = new StringBuffer(" MOBILE TESTING ");
		System.out.println(buffer); // MOBILE TESTING
		buffer.append("APPIUM ");
		System.out.println(buffer); // MOBILE TESTING APPIUM - Here modification done in same object.
		
	}
	
	
	public static void main(String[] args) {
		m2();
	}
	
	
}

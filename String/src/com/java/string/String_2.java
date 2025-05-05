package com.java.string;

// .equals() Method is used for value compression. (.equals() method present in object class).
// == (Operator) is used for reference compression. (operator override is not possible in java).


public class String_2 {

	public static void m1() {
		
		String s1 = new String("JAVA SELENIUM");
		String s2 = s1.toString(); // JAVA SELENIUM
		String s3 = s2.toUpperCase(); // JAVA SELENIUM
		String s4 = s3.toLowerCase(); // java selenium
		String s5 = s1.toUpperCase(); // JAVA SELENIUM
		String s6 = s2.toLowerCase(); // java selenium
		
		
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); //
		System.out.println(s1 == s4); 
		System.out.println(s1 == s5); 
		System.out.println(s1 == s6); 
		System.out.println(s2 == s3); 
		System.out.println(s2 == s4); 
		System.out.println(s2 == s5); 
		System.out.println(s2 == s6); 
		System.out.println(s3 == s4); 
		System.out.println(s3 == s5); 
		System.out.println(s3 == s6); 
		System.out.println(s4 == s5); 
		System.out.println(s4 == s6); 
		System.out.println(s5 == s6); 
		
	}
	
	
	public static void m2() {
		Integer i1 = new Integer(120);
		Integer i2 = new Integer(120);
		
		System.out.println(i1 == i2); // false
		System.out.println(i1.equals(i2)); // true
			
	}

	public static void m3() {
		
		String s1 = new String("Java Selenium");
		String s2 = new String("Java Selenium");
		
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
	}
	
	
	public static void main(String[] args) {
		
		m3();
	}
	
	
}

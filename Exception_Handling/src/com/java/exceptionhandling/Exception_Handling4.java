package com.java.exceptionhandling;
/*
-> We can write n number of catch block with different -2 type of exception 
   => If exception related catch block matched then catch block will be executed and programe 
       will terminate with normal turmination.
   => If exception related catch block not matched then programe with terminate with abnomal 
      turmination.
      
-> We can also write with super class "Exceprion" in catch block, if exception related catch 
   block not matched then super class exception execute.   

-> We cannot write any Exception after write the super exception, error will show 

-> At a time only ony catch block will execute.
-> At a time only one exception will execute
-> We can write multiple try and catch block insdie a try block.
*/

public class Exception_Handling4 {

	// String out of Bond Exception Example
	
	public static void m1() {
		
		String a = "Ram";
		
		try {
			System.out.println(a.charAt(4));
		}
		catch(ArithmeticException arithmeticException) {
			System.out.println("ArithmeticException");
		}
		catch(NullPointerException nullPointerException) {
			System.out.println("NullPointerException");
		}
		catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(StringIndexOutOfBoundsException indexOutOfBoundsException) { // Matched Excetion 
			System.out.println("StringIndexOutOfBoundsException");
		}
		catch(Exception exception) { 
			System.out.println("Exception");
		}

	}
	
	
	public static void m2() {
		// Array out of bond Exception - Example
		
		
		int a[] = {10, 20, 30, 40, 50};
		
		try {
			System.out.println(a[8]);
		}
		catch(ArithmeticException arithmeticException) {
			System.out.println("ArithmeticException");
		}
		catch(NullPointerException nullPointerException) {
			System.out.println("NullPointerException");
		}
		catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) { // Matched Excetion
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(StringIndexOutOfBoundsException indexOutOfBoundsException) {  
			System.out.println("StringIndexOutOfBoundsException");
		}
		catch(Exception exception) { 
			System.out.println("Exception");
		}
	}
	
	
	public static void main(String[] args) {
		m2();
	}
}

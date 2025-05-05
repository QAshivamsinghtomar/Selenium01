package com.selenium.modifier1;

import com.selenium.modifier.Protected_Modifier1;


public class Protected_Modifer3 extends Protected_Modifier1 {

	public static void main(String[] args) {
/*		
=> Accessing Protected_Modifer data from one package to another package by using extends keyword.

=> Here data is available in (Private_Modifier_1) class which in (com.selenium.modifier1) 
   package and we are accessing in (Protected_Modifer3) class which is available in 
   (com.selenium.modifier1) package.
   
 
*/	
		Protected_Modifer3 modifer3 = new Protected_Modifer3();
		System.out.println(modifer3.empId);
		System.out.println(modifer3.empName);
		System.out.println(modifer3.empNumber);
		System.out.println(modifer3.empRollNumber);
		System.out.println(modifer3.empStatus);
		
		
		
	}
	
}

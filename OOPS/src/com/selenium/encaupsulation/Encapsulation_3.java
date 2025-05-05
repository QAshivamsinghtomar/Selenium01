package com.selenium.encaupsulation;

public class Encapsulation_3 {

	public static void main(String[] args) {

/*		
=> First way to reading Encapsulation_2 class data
   By creating an object of Encapsulation_2 and passing value in object creation		
*/				
	Encapsulation_2 encapsulation_2 = new Encapsulation_2(100, "Saving", 5000, "Shivam Singh", "ICICI Bank");
	System.out.println("Account Number = "+encapsulation_2.getAccountNo());
	System.out.println("Account Name = "+encapsulation_2.getAccountName());
	System.out.println("Account Balance = "+encapsulation_2.getAccountBalance());
	System.out.println("Account Holder Name = "+encapsulation_2.getAccountHolder());
	System.out.println("Account Type = "+encapsulation_2.getAccountType());
	
	
	System.out.println();
	System.out.println();	
/*	
=> Second way to access Encapsulation_2 class data 
=> First we need to set data by using setter method (set)
=> After set data, we can get data by using getter method (get)	
=> Here we have a 2 way - first we can create new object and then set data and another one is using old 
   created object set the data. (here we are using old object for set the data)
*/	
	
	// Set the value
	 encapsulation_2.setAccountNo(101);
	 encapsulation_2.setAccountName("KOTAK Bank");
	 encapsulation_2.setAccountBalance(2000);
	 encapsulation_2.setAccountHolder("Suraj");
	 encapsulation_2.setAccountType("Current");
	
	 // Getting the value
	 System.out.println("Account No = "+encapsulation_2.getAccountNo());
	 System.out.println("Account Name = "+encapsulation_2.getAccountName());
	 System.out.println("Account Balance = "+encapsulation_2.getAccountBalance());
	 System.out.println("Account Holder = "+encapsulation_2.getAccountHolder());
	 System.out.println("Account Type = "+encapsulation_2.getAccountType());	
	
	
	 System.out.println();
	 System.out.println();
	 

	 /*
	  By creating new object than accessing the value
	  Encapsulation_2 encapsulation_22 = new Encapsulation_2(0, null, 0, null, null);
	  Here first we need to set value and then we can access the value.
	 */

	 
/*
 * Third way to access Encapsulation_2 class data with Encapsulation_1
 * Here we are creating the object of Encapsulation_1 class and then we are setting Encapsulation_2
 * class data (By using copy Constructor)
*/	 
	
	 //create object and set value
	Encapsulation_1 encapsulation_1 = new Encapsulation_1();
	encapsulation_1.setEmpid(50);
	encapsulation_1.setEmpName("Raja");
	encapsulation_1.setEmpMarks(90);
	encapsulation_1.setEmpRollNo(180);
	encapsulation_1.setEmpStatus("Pass");
	encapsulation_1.setEncapsulation_2(encapsulation_2); // Encapsulation_2 data will be here.
	
	// Getting the value
	System.out.println("Emp Id = "+encapsulation_1.getEmpid());
	System.out.println("Emp Name = "+encapsulation_1.getEmpName());
	System.out.println("Emp Marks = "+encapsulation_1.getEmpMarks());
	System.out.println("Emp Roll No = "+encapsulation_1.getEmpRollNo());
	System.out.println("Emp Status = "+encapsulation_1.getEmpStatus()); 
	
	
	Encapsulation_2 encapsulation = encapsulation_1.getEncapsulation_2();
	System.out.println("Account No. = "+encapsulation.getAccountNo());
	System.out.println("Account Name = "+encapsulation.getAccountName()); 
	System.out.println("Account Balance = "+encapsulation.getAccountBalance()); 
	System.out.println("Account Holder = "+encapsulation.getAccountHolder());
	System.out.println("Account Type = "+encapsulation.getAccountType());
	}
}


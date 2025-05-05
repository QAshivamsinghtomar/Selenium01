package com.selenium.modifier;
/*
=> Private Modifier can be access only in same package.
=> Private Modifier data can be access in same package only, and we also access the data in another 
   class of same package.
*/
public class Private_Modifier {

	private int empId = 100 ;
	private String empName = "Anand" ;
	private int empRollNumber = 1052 ;
	private String empResult = "Pass" ;
	
	
	// Getter and Setter Method - It is used for convert Private modifier data into public.
	 // Right click on mouse - source - generate getter and setter
	
	
	public int getempId() {
		return empId ;
	}
	public void setempId(int empId) {
		this.empId = empId ;
	}
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	public int getEmpRollNumber() {
		return empRollNumber;
	}
	public void setEmpRollNumber(int empRollNumber) {
		this.empRollNumber = empRollNumber;
	}
	
	
	public String getEmpResult() {
		return empResult;
	}
	public void setEmpResult(String empResult) {
		this.empResult = empResult;
	}
	
	
	public static void main(String[] args) {
		
		// Accessing Private Modifier data within same class.
		
		Private_Modifier modifier_1 = new Private_Modifier();
		System.out.println(modifier_1.empId); 
		System.out.println(modifier_1.empName);
		System.out.println(modifier_1.empRollNumber);
		System.out.println(modifier_1.empResult);
	}
	
}

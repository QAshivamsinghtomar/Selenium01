package com.selenium.encaupsulation;
/*
=> Encapsulation
*/
public class Encapsulation_1 {

	private int empid ;
	private int empRollNo ;
	private int empMarks ;
	private String empName ;
	private String empStatus ;
	private Encapsulation_2 encapsulation_2 ;
	
	// Getter and Setter Method - Convert private modifier data into public modifier
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getEmpRollNo() {
		return empRollNo;
	}
	public void setEmpRollNo(int empRollNo) {
		this.empRollNo = empRollNo;
	}
	public int getEmpMarks() {
		return empMarks;
	}
	public void setEmpMarks(int empMarks) {
		this.empMarks = empMarks;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpStatus() {
		return empStatus;
	}
	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}
	public Encapsulation_2 getEncapsulation_2() {
		return encapsulation_2;
	}
	public void setEncapsulation_2(Encapsulation_2 encapsulation_2) {
		this.encapsulation_2 = encapsulation_2;
	}
	
	

	
	
}

package com.selenium.encaupsulation;
/*
=> First way - By Constructor passing value in object creation and get the value
=> Second way  - After object creation set value and then get the value.


*/

class Student{
	
	private int no ;
	private String name ;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Student(int no, String name) {
		this.no = no ;
		this.name = name;
	}
	
	
}



public class Encap_4 {

	public static void main(String[] args) {
		
		/*
		// First way - By using set value and then get the value
		Student student = new Student();
		student.setNo(10);
		student.setName("AAA");
		
		//System.out.println(student.getNo());
		//System.out.println(student.getName());
		*/
		
		
		
		// Second way - sending value when we are creating the object.
		Student student2 = new Student(20, "ZZZ");
		System.out.println(student2.getNo());
		System.out.println(student2.getName());
		
	}
	
}

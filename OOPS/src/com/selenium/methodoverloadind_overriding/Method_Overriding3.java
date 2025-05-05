package com.selenium.methodoverloadind_overriding;


class Admin {
	int salary() {
		return 20000;
	}
}


class TeamLead extends Admin {
	int salary() {
		return 40000 ;
	}
}


class ProductManager extends TeamLead {
	int salary() {
		return 60000 ;
	}
}


public class Method_Overriding3 {

	public static void main(String[] args) {
		
	//	Admin admin = new Admin();
	//	System.out.println(admin.salary()); // It will execute from Admin
		
		
	//	TeamLead lead = new TeamLead();
	//	System.out.println(lead.salary()); // It will execute from Teamlead class
		
		
	//	ProductManager manager = new ProductManager();
	//	System.out.println(manager.salary()); // It will execute from ProductManager class
		
		
		
	//	Admin admin1 = new TeamLead(); // Polymorphism
	//	System.out.println(admin1.salary()); // It will execute from Teamlead class.
		
	
		
	//	Admin admin2 = new ProductManager();
	//	System.out.println(admin2.salary()); // It will execute from ProductManager class.
	
		
		
		TeamLead lead = new ProductManager(); // Polymorphism
		System.out.println(lead.salary()); // It will execute from ProductManager class.
		
	}
}

package Abstraction;

// Abstract class can have abstract and non abstract methods

public abstract class Employee {
	
	// Non abstract methods or concrete methods
	public void Ename() {
		
		System.out.println("Employee Name is Anup");
	}
	
	// Non abstract methods or concrete methods
	public void Eprofile() {
		
		System.out.println("Employee Profile is Associate QA Engineer");
	}
	
	public void Eaddress() {
		
		System.out.println("MG Road");
	}
	
	// Abstract method
	public abstract void Salary();
	

}

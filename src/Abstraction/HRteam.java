package Abstraction;

public class HRteam extends Employee {
	
	public void Salary() {
		
		System.out.println("Salary is 28LPA");
	}
	
	public void Eaddress() {
		System.out.println("Brigade Road");
	}

	public static void main(String[] args) {
		
		HRteam hr = new HRteam();
		
		hr.Ename();
		
		hr.Salary();
		
		hr.Eaddress();

	}

}

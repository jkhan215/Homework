package Polymorphism;

public abstract class TestSalary {

	public static void main(String[] args) {
		
		Salary salary = new Salary();
		int EmployeesSalary = salary.Salary(10, 12, 30);
		System.out.println(EmployeesSalary);
		int DepermantSalary = salary.Salary(12, 39, 30, 60);
		System.out.println(DepermantSalary);
		
		SuperSalary supersalary = new SuperSalary();
		int bonussalary = supersalary.SuperSalary(12, 23, 50);
		System.out.println(bonussalary);
				
				
	
		
		
				
				
		

	}

}

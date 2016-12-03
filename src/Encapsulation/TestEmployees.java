package Encapsulation;

public class TestEmployees {

	public static void main(String[] args) {
		Employees emp1 = new Employees ();
		emp1.setEmployeesID(365);
		emp1.setEmployeesName("bob");
		emp1.setEmployeesSalary("3000");
		
		System.out.println(emp1.getEmployeesID()+" "+emp1.getEmployeesName()+" "+emp1.getEmployeesSalary());
		
		
		
		
		
	}

}

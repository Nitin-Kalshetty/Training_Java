package singleObject5Times;

public class Employee {

	int empId;
	String name;
	static int count;
	
	public Employee(int empId, String name) {
		super();
		if(Employee.count==4) {
			System.out.println("Created 5 times");
		}
		this.empId = empId;
		this.name = name;
		Employee.count++;
	}
	public Employee() {
		super();
		if(count==4) {
			System.out.println("Created 5 times");
		}
		count++;
	}
	
}

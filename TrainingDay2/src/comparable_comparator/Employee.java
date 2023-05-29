package comparable_comparator;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

	private int empId;
	private String empName;
	private int age;
	private int salary;
	private String address;
	public Employee(int empId, String empName, int age, int salary, String address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", salary=" + salary
				+ ", address=" + address + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.empId==o.getEmpId() ? 
				this.age==o.getAge() ? 
						this.empName.compareTo(o.getEmpName()) : this.age>o.getAge() ? 1 : -1 : this.empId>o.getEmpId() ? 1 : -1;
	}
	
	
}

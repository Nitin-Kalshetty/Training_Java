package may22.comparableTreeSet;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

	private Integer empId;
	private String name;
	private Integer salary;
	public Employee(Integer empId, String name, Integer salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(empId, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empId, other.empId) && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

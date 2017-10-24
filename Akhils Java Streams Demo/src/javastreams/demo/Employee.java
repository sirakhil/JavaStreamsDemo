package javastreams.demo;


/**
 * @author Akhil
 *
 */
public class Employee {

	String employeeName;
	
	Integer employeeSalary;

	public Employee(String employeeName, int employeeSalary) {
		
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		
	}

	public Employee() {
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Integer employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	
	@Override
	public String toString() {
		return "\nEmployee Name: "+ this.employeeName + "\nEmployee Salary: "+ this.employeeSalary;
	}
	
}

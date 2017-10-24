package javastreams.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	
	/**
	 * @param args
	 * 
	 * This function demonstrates object comparison operations
	 * using Java 7 
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("Alice",100000);
		Employee emp2 = new Employee("Bob",110000);
		Employee emp3 = new Employee("Cathy",125000);
		
		Employee maxSalaried = new Employee();
		Employee minSalaried = new Employee();
		
		Integer maxSalary = 0;
		Integer minSalary = 0;
				
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		//Find Max Salaried Employee
		for (Employee emp : empList) {
			
			if (maxSalary < emp.getEmployeeSalary())
			{
				maxSalaried = emp;
				maxSalary = emp.getEmployeeSalary();
			}
		}
		
		//Find Min Salaried Employee
		for (Employee emp : empList) {
			
			if(minSalary == 0) {
				minSalaried = emp;
				minSalary = emp.getEmployeeSalary();
			}
			
			if (minSalary > emp.getEmployeeSalary())
			{
				minSalaried = emp;
				minSalary = emp.getEmployeeSalary();
			}
		}
			
		
		System.out.println("Max Salaried is: " + maxSalaried.toString());
		System.out.println("Min Salaried is: " + minSalaried.toString());
		
		
	  //  Employee minSalaried1 = empList.stream().min(comp).get();
	    		
		
	}

}

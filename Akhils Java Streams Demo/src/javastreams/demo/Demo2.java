package javastreams.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo2 {

	/**
	 * @param args
	 * 
	 * This function demonstrates object comparison operations
	 * using Java 8 & Streams API
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("Alice",100000);
		Employee emp2 = new Employee("Bob",110000);
		Employee emp3 = new Employee("Cathy",125000);
				
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		//Defined Comparator for object Employee
	    final Comparator<Employee> comp = (e1, e2) -> Integer.compare( e1.getEmployeeSalary(), e2.getEmployeeSalary());
	   
	    //Find Max Salaried Employee
	    System.out.println("Max Salaried is: "+empList.stream().max(comp).get().toString());
	    
	    //Find Min Salaried Employee
	    System.out.println("Min Salaried is: "+empList.stream().min(comp).get().toString());
	    
		
	}

}

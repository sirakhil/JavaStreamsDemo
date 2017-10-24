package javastreams.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo3 {

	/**
	 * @param args
	 * 
	 * This function demonstrates iterating through a collection
	 * using Java8 & Streams API
	 */
	public static void main (String[] args) {
		
		Employee emp1 = new Employee("Alice",100000);
		Employee emp2 = new Employee("Bob",110000);
		Employee emp3 = new Employee("Cathy",125000);
				
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		//ForEach example
		Arrays.stream(new Employee[] {emp1,emp2,emp3}).forEach(emp -> System.out.println(emp.toString()));
		
	}
    
}

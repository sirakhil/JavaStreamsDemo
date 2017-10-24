package javastreams.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo4 {

	public static void main(String[] args) {
		
		Long startTime;
		Long endTime;
		Long executionTime;
		
		List<String> filtered = new ArrayList<String>();
		
		startTime =  System.currentTimeMillis();
		
		//Filter and Limit Operation examples
		filtered = Arrays.asList("abc", "", "def", "", "efg", "ghi","", "jkl","","mno","","pqr","","stu","","vwx","","yzz")
						 .stream().filter(string -> !string.isEmpty()).limit(10).collect(Collectors.toList());
		
		System.out.println("Filtered List: " + filtered);
		
		endTime =  System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Sequential Execution Time is " + executionTime);
		
		/*
		//ParallelStream - Filter and Limit Operation examples
		startTime =  System.currentTimeMillis();
		
		
		filtered = Arrays.asList("abc", "", "def", "", "efg", "ghi","", "jkl","","mno","","pqr","","stu","","vwx","","yzz")
						 .parallelStream().filter(string -> !string.isEmpty()).limit(10).collect(Collectors.toList());
		System.out.println("Filtered List: " + filtered);
		
		endTime =  System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Parallel Execution Time is " + executionTime);
		*/
		
		
	}

}

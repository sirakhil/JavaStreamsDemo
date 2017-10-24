package javastreams.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo5 {

	public static void main(String[] args) {
		
		Long startTime;
		Long endTime;
		Long executionTime;
		
		String mergedString = "";
		
		//Java 8 List of Strings to string conversion
		
		startTime =  System.currentTimeMillis();
		
		mergedString = Arrays.asList("abc", "", "def", "", "efg", "ghi","", "jkl","","mno","","pqr","","stu","","vwx","","yzz")
							 .parallelStream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		
		endTime =  System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Merged String: " + mergedString);
		System.out.println("Parallel Stream Execution Time is " + executionTime);
		
		//Java 7 List of Strings to string conversion
		
		startTime =  System.currentTimeMillis();
		
		List<String> stringList = new ArrayList<String>();
		List<String> emptyList = new ArrayList<String>();
		stringList.add("abc");
		stringList.add("");
		stringList.add("def");
		stringList.add("");
		stringList.add("efg");
		stringList.add("");
		stringList.add("ghi");
		stringList.add("");
		stringList.add("jkl");
		stringList.add("");
		stringList.add("mno");
		stringList.add("");
		stringList.add("pqr");
		stringList.add("");
		stringList.add("stu");
		stringList.add("");
		stringList.add("vwx");
		stringList.add("");
		stringList.add("yzz");
		
		for (String string : stringList)
		{
			if (string.equalsIgnoreCase(""))
				emptyList.add(string);
		}
		
		stringList.removeAll(emptyList);
		
		mergedString = stringList.toString();
		mergedString = mergedString.substring(1, mergedString.length()-1);
		
		endTime =  System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Merged String: " + mergedString);
		System.out.println("For Loop Execution Time is " + executionTime);
		
	}

}

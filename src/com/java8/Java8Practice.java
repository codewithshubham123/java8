package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Practice {

	
	public static void main(String[] args) {
		
		List<EmployeeDemo>list = new ArrayList<>();
		
		list.add(new EmployeeDemo(1,"shubham","shubham@gmail.com",40000l));
		list.add(new EmployeeDemo(2,"ram","ram@gmail.com",30000l));
		list.add(new EmployeeDemo(3,"shekhar","shekhar@gmail.com",25000l));
		list.add(new EmployeeDemo(4,"ajay","ajay@gmail.com",40000l));
		
		
		
		
		//sorting by salary
		List<EmployeeDemo> collect = list.stream().sorted((o1,o2) -> (int) (o2.getSalary()-o1.getSalary())).collect(Collectors.toList());
		
		System.out.println(collect);

		// sorting by name
		List<EmployeeDemo> sortringByName = list.stream().sorted(Comparator.comparing(EmployeeDemo::getName)).collect(Collectors.toList());
		
		System.out.println(sortringByName);

		
		//sorting by email

		List<EmployeeDemo> sortringByEmail= list.stream().sorted(Comparator.comparing(EmployeeDemo::getEmail)).collect(Collectors.toList());

		System.out.println(sortringByEmail);

		
		
		 list.stream().sorted(Comparator.comparing(EmployeeDemo::getName)).forEach(System.out::println);
		 
		 
		 
		 double orElse = list.stream().mapToInt(a->a).average().orElse(0);
		 

		
	}
	
	
	
}

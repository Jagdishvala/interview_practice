package com.java.stream.example;

import java.util.ArrayList;
import java.util.List;

import com.jbvala.prective.Employee;

public class StreamUpperCase {
	
	
	public static void main(String arg[]) {
		
		Employee employee =null;
		
		List<Employee> emplst =new ArrayList<>();
		
		
		employee =new Employee();
		employee.setId(1);
		employee.setName("vala");
		
		emplst.add(employee);
		
		
		employee =new Employee();
		employee.setId(2);
		employee.setName("sakarar");
		emplst.add(employee);
		

		emplst.stream().map(emp->emp.getName().toUpperCase()).forEach(System.out::println);
		
		
		
		
		
		
		
	}
	

}

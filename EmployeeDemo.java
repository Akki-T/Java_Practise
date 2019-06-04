package com;

import java.util.*;


public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee e1= new Employee(1,"abc");
		
		Employee e2= new Employee(2,"bcd");
		
		Employee e3= new Employee(4,"cde");
		
		Employee e4= new Employee(3,"def");
		
		List<Employee> employeeList= new ArrayList<Employee>();
		
		System.out.println(employeeList.size());
		
		employeeList.add(e1);
		
		employeeList.add(e2);
		
		employeeList.add(e3);
		
		employeeList.add(e4);
		
		System.out.println(employeeList.size());
		
		
		for(Employee emp : employeeList){
			
			if(emp.getName().equalsIgnoreCase("cde")){
				
				employeeList.remove(emp);
				
				break;
			}
		}
		
		System.out.println(employeeList.size());
		
		for(Employee emp : employeeList){
			
			System.out.println(emp.getId() + " " + emp.getName());
		}
	}
}

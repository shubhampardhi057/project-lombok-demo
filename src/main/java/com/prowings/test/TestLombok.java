package com.prowings.test;

import com.prowings.model.Employee;

public class TestLombok {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		Employee emp1 = new Employee(20,"Sham","Pune");
		Employee emp2 = new Employee(20,"Sham","Pune");
		
		
		emp.setEmpId(10);
		emp.setEmpName("Ram");
		emp.setEmpAddress("Ayodya");
		
		System.out.println(emp);
		System.out.println("E Id : "+emp.getEmpId());
		System.out.println("E Name : "+emp.getEmpName());
		System.out.println("E Address : "+emp.getEmpAddress());
		
		
		System.out.println(emp.hashCode());
		
		System.out.println(emp1.equals(emp2));
		
		Employee emp3 = Employee.builder()
								.empId(30)
								.empName("Naam")
								.empAddress("Mumbai")
								.build();
		
		System.out.println(emp3);
	}

}

package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeList {

	public static void main(String[] args)
	{
		ArrayList<Employee> alist=new ArrayList<>();
		alist.add(new Employee(101, "Abhishek", "HR"));
		alist.add(new Employee(102, "vipin", "IT"));
		alist.add(new Employee(103, "deepak", "ACCOUNTS"));
	
		System.out.println("=====through for each=====");
		for (Employee employee : alist) {
			//System.out.println(employee);
			employee.print();
		}
		Iterator<Employee> itr=alist.iterator();
		
		
		System.out.println("====through iteartor======");
		while(itr.hasNext())
		{
		itr.next().print();	
		}
	}
}

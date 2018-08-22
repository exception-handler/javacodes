package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeList {
	public static void main(String[] args) {
	ArrayList<Employee> alist=new ArrayList<>();
	alist.add(new Employee(101, "Ravic","HR"));
	alist.add(new Employee(102, "Amit","IT"));
	alist.add(new Employee(103, "Ravic","Account"));
	Iterator<Employee> itr= alist.iterator();
	while(itr.hasNext())
	{
		itr.next().print();
	}

	
	for(Employee e:alist)
	{
		e.print();
	}
	}
	

}

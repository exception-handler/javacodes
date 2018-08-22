package com.collection;

public class Employee {
	 int id;
	 String name;
	 String dept;
	public Employee(int id, String name, String dept)  {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

public void print()
	{
		System.out.println("id is : "+id+"name is : "+name+"department is : "+dept);
	
	}
}

package com.collection;

public class Employee {
int empId;
String name;
String dept;
public Employee(int empId, String name, String dept) {
	super();
	this.empId = empId;
	this.name = name;
	this.dept = dept;
}

public void print()
{
System.out.println("Emp id"+empId+ 
		" Name "+name+" Dept "+dept);
}


}

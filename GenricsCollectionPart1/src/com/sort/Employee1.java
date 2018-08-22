package com.sort;
public class Employee1 implements Comparable<Employee1>{
	int eId;
	String name;
	int age;
  
	
	
 public Employee1(int eId, String name, int age) {
		super();
		this.eId = eId;
		this.name = name;
		this.age = age;
	}



@Override
public int compareTo(Employee1 o) {
	//System.out.println(this.age+" "+o.age);
if(this.age==o.age)
{
	
	return 0;
}
else if(this.age>age)
{
	return 1;
}
else return -1;
}



@Override
public String toString() {
	return "Employee1 [eId=" + eId + ", name=" + name + ", age=" + age + "]";
}


}

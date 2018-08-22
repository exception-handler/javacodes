package ans6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EmployeePredicateTest {

	public static void main(String[] args) {
	/*	List<Employee> empList1=Arrays.asList(new Employee(123, "Hello", 22));*/
		List<Employee> empList=new ArrayList<>();
		Employee e1=new Employee(101, "Rohit", 23);
		Employee e2=new Employee(102, "Abhishek", 25);
		Employee e3=new Employee(103, "Chetan", 22);
		Employee e4=new Employee(104, "Rohan", 45);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		System.out.println("employee with more than 5 characters: ");
		Predicate<Employee> p1=(Employee e)->e.getName().length()>=5;
		filter(empList, p1);
		System.out.println("employee with name starts with A");
		Predicate<Employee> p2=(Employee e)->e.getName().charAt(0)=='A';
		filter(empList, p2);
		System.out.println("age greater or equal to 50");
		Predicate<Employee> p3=(Employee e)->e.getAge()>=50;
		filter(empList, p3);
		System.out.println("age less than 40");
		Predicate<Employee> p4=(Employee e)->e.getAge()<=40;
		filter(empList, p4);
		System.out.println("age less than 30 and equal to 50");
		filter(empList, (Employee e)->e.getAge()>=30 && e.getAge()<50);
		
	}
	
	public static void filter(List<Employee>emp,Predicate<Employee>condition)
	{
		for (Employee employee : emp) {
			if(condition.test(employee))
			{
				System.out.println(employee.getName());
			}
		}
		 	 
	}

}

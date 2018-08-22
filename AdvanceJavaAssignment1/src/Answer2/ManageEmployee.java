package Answer2;


import java.util.LinkedList;
import java.util.List;


public class ManageEmployee {
static LinkedList<Employee> empLinkedList=new LinkedList<Employee>();
	
	static
	{
	
	empLinkedList.add(new Employee(101, "Rohit", "1995-10-05"));//store the object
	empLinkedList.add(new Employee(102, "Maven", "1996-02-02"));
	empLinkedList.add(new Employee(103, "Abhi", "1994-01-08"));
	
	}
}

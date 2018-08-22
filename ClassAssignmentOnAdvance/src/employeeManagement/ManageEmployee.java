package employeeManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class ManageEmployee {
	static List<Employee> empList=new ArrayList<>();
	static{
		
		Employee e1=new Employee(101, "Rohit", "102 sector 61", "IT", 150000);
		Employee e2=new Employee(102, "Mohit", "103 sector 61", "HR", 170000);
		Employee e3=new Employee(103, "chetan", "104 sector 61", "FINANCE", 190000);
		Employee e4=new Employee(104, "vipin", "105 sector 61", "ACCOUNTS", 200000);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
	}

	public void printEmp() 
	{

		for (Employee employee : empList) {
			System.out.println(employee);
		}
	}
	
	public void addInList(Employee e) throws UserDefine
	{
		int flag=1;
		for (int i = 0; i < empList.size(); i++) {
			
			if(empList.get(i).getEmpId()==e.getEmpId())
			{
				flag=0;
				throw new UserDefine();
			}
			
		}
		if(flag==1)
		{
			empList.add(e);
		}
		
	}
	
	
	public void display(int id)
	{
		for (int i = 0; i < empList.size(); i++) {
			
		if(empList.get(i).getEmpId()==id)
		{
			System.out.println(empList.get(i));
			
		}
		
		}
	}
	
	public void delete(int id)
	{
		for (int i = 0; i < empList.size(); i++) {
			
			if(empList.get(i).getEmpId()==id)
			{
				empList.remove(i);
				
			}
			
			}
	}
}

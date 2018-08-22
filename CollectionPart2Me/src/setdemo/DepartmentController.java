package setdemo;

import java.util.HashSet;
import java.util.Set;

public class DepartmentController {
	
	Set<Department> departmentSet;
	
	public DepartmentController()
	{
		departmentSet=new HashSet<Department>();	
	}
	

	void add(){
		Department d1=new Department("IT","Gurgaon");
		departmentSet.add(new Department("Accounting","Pune"));
		departmentSet.add(new Department("Finance","Noida"));
		departmentSet.add(new Department("IT","Gurgaon"));
		departmentSet.add(new Department("HR","Banglore"));
		departmentSet.add(d1);
		departmentSet.add(d1);
		
	}
	
	void display()
	{
		System.out.println("=====Departments and location======\n");
		for (Department department : departmentSet) {
			System.out.println(department.getName()+" -------->  "+department.getLocation());
		}
	}

	public static void main(String[] args) {
	
	DepartmentController dc=new DepartmentController();
	dc.add();
	dc.display();
		
	}

}

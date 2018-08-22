package p1;

public class RecordOfEmployee {
	
	EmployeeClass arr[]=new EmployeeClass[1000];
	int count=0;
	
	public void addEmployee(EmployeeClass e)
	{
		arr[count]=e;
	}
	
	public void printEmployeeRecord()
	{
		for(int i=0;i<=count;i++)
		{
		System.out.println("Employee Id is :"+arr[i].getId());
		System.out.println("Employee name is :"+arr[i].getName());
		System.out.println("Employee Salary is :"+arr[i].getSalary());
		System.out.println("''''''''''''''''''''''''''''''''''''");
		}
		count++;
	}//printEmployee end
		

}//recordOfemployee end

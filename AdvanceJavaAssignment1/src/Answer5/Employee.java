package Answer5;

import java.util.Enumeration;
import java.util.Vector;

public class Employee {
	static Vector<Employee> vect=new Vector<Employee>();
	
	int employeeNo;
	String employeeName;
	String Address;
	public int getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Employee(int employeeNo, String employeeName, String address) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		Address = address;
	}
	
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [employeeNo=" + employeeNo + ", employeeName=" + employeeName + ", Address=" + Address + "]";
	}
	
	public void addInput()
	{
		vect.add(new Employee(101, "rohit", "102 vandana nagar"));
		vect.add(new Employee(102, "vipin", "105  nagar"));
		vect.add(new Employee(103, "rohan", "106 nanda nagar"));
	}
	
	public void display()
	{
		Enumeration<Employee> evect= vect.elements();
		while(evect.hasMoreElements())
		{
			System.out.println(evect.nextElement());
		}
	}
}

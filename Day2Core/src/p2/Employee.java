package p2;

class Employee
{
	private int id;
	private String name;
	private int salary;
	
	public void setMyEmployeeData(int a,String n,int s)
	{
		id=a;
		name=n;
		salary=s;
	}
	public void doPrint()
	{
		System.out.println("Employee ID "+id);
		System.out.println("Employee name "+name);
		System.out.println("Employee salary "+salary);
	}
}

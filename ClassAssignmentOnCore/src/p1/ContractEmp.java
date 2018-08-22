package p1;

public class ContractEmp extends Employee{

	private int hourlyWork;
	private int salary;
	private String type;
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("Employee Id is:"+getEmpId()+" Employee name is: "+getEmpName()+" hourlywork is:"+hourlyWork+" salary is:"+salary+" type is"+salary);
		
	}
	public ContractEmp(int empId, String empName, int hourlyWork, int salary, String type) {
		super(empId, empName);
		this.hourlyWork = hourlyWork;
		this.salary = salary;
		this.type = type;
	}
	
	
	public ContractEmp(int empId, String empName) {
		super(empId, empName);
	}
	
	
}

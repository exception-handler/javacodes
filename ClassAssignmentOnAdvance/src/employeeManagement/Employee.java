package employeeManagement;

public class Employee {
	private int empId;
	String name;
	String address;
	String dpt;
	float Salary;

	public Employee(int empId, String name, String address, String dpt, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.dpt = dpt;
		Salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDpt() {
		return dpt;
	}

	public void setDpt(String dpt) {
		this.dpt = dpt;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", dpt=" + dpt + ", Salary="
				+ Salary + "]";
	}

	public Employee() {
		super();
	}

}

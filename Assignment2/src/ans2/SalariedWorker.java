package ans2;

public class SalariedWorker extends Worker {
	
	private float salary;

	public SalariedWorker(String name, int salaryRate) {
		super(name, salaryRate);
		// TODO Auto-generated constructor stub
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public void computePay(int hours) {
		// TODO Auto-generated method stub
		
		salary=hours*getSalaryRate();
	
	}

}

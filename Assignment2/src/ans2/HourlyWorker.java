package ans2;

public class HourlyWorker extends Worker {

	private float salary;
	
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public HourlyWorker(String name, int salaryRate) {
		super(name, salaryRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void computePay(int hours) {
		// TODO Auto-generated method stub
		if(hours<=40){
		salary=hours*getSalaryRate();
		
		}
		else
		{
			int extraHr=hours-40;
			salary= (float) ((40*getSalaryRate())+(extraHr*(1.5*getSalaryRate())));

//			int s1=40*getSalaryRate();
//			float s2=(float) ((40*getSalaryRate())+(extraHr*(1.5*getSalaryRate())));
//			salary=s1+s2;
			
			
		}
		
	}

}

package ans4;

public class CalculateSalary {

	public static void main(String[] args) {
		IsSalary is=new IsSalary() 
		{
			
			@Override
			public int calculateSalary(int days, int salPerDay) {
				int salary=days*salPerDay;
				return salary;
			}
		};
		is.reach();
		System.out.println("Salary through anonymous class: "+is.calculateSalary(10, 1000));
	
	IsSalary is1=(days,salPerDay)->{
		int salary=days*salPerDay;
		return salary;
	};
	
	System.out.println("Salary through lambda expression: "+is1.calculateSalary(20, 1000));
	}

	
}

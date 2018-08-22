package ans5;

public class Employee {

	private int idNum;
	private int hourlyWage;
	
	public Employee(int idNum, int hourlyWage) throws EmployeeException {
		super();
		
	
	if(hourlyWage<6||hourlyWage>50)
	{
		throw new EmployeeException("Value below 6 or above 50");
	}
	else
	{
		this.idNum = idNum;
		this.hourlyWage = hourlyWage;	
		System.out.println("data inserted");
		System.out.println(idNum);
		System.out.println(hourlyWage);
		
		}//else end
	}//function end
	
	
	
}

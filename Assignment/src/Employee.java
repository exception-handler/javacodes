import java.util.Scanner;

public class Employee {
	
	float hr_pay;
	int hr_reg,hr_over;
	float weeklySalary;
	public static void main(String[] args) {
	
		Employee e=new Employee();
		e.getData();
		e.calculateSalary();
		e.display();
		
	}
	
	public void getData()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pay of employee: ");
		hr_pay=sc.nextFloat();
		System.out.println("Enter the regular hours: ");
		hr_reg=sc.nextInt();
		System.out.println("Enter the overtime hours: ");
		hr_over=sc.nextInt();
	}
	
	public void calculateSalary()
	{
		weeklySalary=(float)((hr_pay*hr_reg)+(hr_pay*1.5*hr_over));
	}
	
	public void display()
	{
		System.out.println("Final salary is : "+weeklySalary);
	}

}

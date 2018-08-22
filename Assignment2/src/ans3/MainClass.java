package ans3;

import java.util.Scanner;



public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		MainClass obj=new MainClass();
		Employee fresher=new Employee("Rohit",'M');
		Employee exp1=new Employee("Ritika", 'F', 4);
		Employee exp2=new Employee("Tapan", 'M', 3);
		obj.printDetail(fresher);
		System.out.println("======================");
		obj.printDetail(exp1);
		System.out.println("======================");
		obj.printDetail(exp2);
		System.out.println("======================");
		exp1.promoteEmp();
	
		System.out.println("exp1 promoted");
		System.out.println("----------------------");
		obj.printDetail(exp1);
		System.out.println("----------------------");
		fresher.promoteEmp();
		System.out.println("fresher promoted");
		
		exp2.applyForLwp();
		System.out.println("----------------------");
		obj.printDetail(exp2);
		
		System.out.println("----------------------");
		System.out.println("exp2LWP");
		System.out.println("----------------------");
		


		
	}//end main
	
	public void printDetail(Employee e)
	{
		System.out.println("Name of employee"+e.getName());
		System.out.println("Gender is"+e.getGender());
		System.out.println("Experience"+e.getYearsOfExp());
		System.out.println("Salary"+e.getBasicSalary());
		System.out.println("Designation"+e.getDesignation());
		System.out.println("Status"+e.getStatus());
	}

}//end class

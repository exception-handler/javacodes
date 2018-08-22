package ans2;

import java.util.Scanner;

public class MainClass {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		MainClass m = new MainClass();
		
		while (true) {
			System.out.println("====MENU====");
			System.out.println("1. for hourly worker:");
			System.out.println("2. for Salary worker:");
			System.out.println("0. to exit:");
			int ch = Integer.parseInt(m.sc.nextLine());
			switch (ch) {
			case 1:
				System.out.println("enter the number of hours worked:");
				int hours=Integer.parseInt(m.sc.nextLine());
				HourlyWorker hr = new HourlyWorker("Rohit",4000);
				hr.computePay(hours);
				m.printWorkerDetail(hr);
				break;
			case 2:
				System.out.println("enter the number of hours worked:");
				int hours1=Integer.parseInt(m.sc.nextLine());
				SalariedWorker sa = new SalariedWorker("Jerry",4000);
				sa.computePay(hours1);
				m.printWorkerDetail(sa);
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice");

			}// switch end
		} // while end

	}// main end

	public void printWorkerDetail(Worker w)
	{
		System.out.println("name:"+w.getName());
		System.out.println("salary rate"+w.getSalaryRate());
		
		if(w instanceof HourlyWorker)
			System.out.println("Hourly worker salary: "+((HourlyWorker)w).getSalary());
		if(w instanceof SalariedWorker)
			System.out.println("Salaried Worker slary: "+((SalariedWorker)w).getSalary());
	}
}// class end

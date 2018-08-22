package p1;

import java.util.Scanner;

import javax.xml.bind.ParseConversionEvent;

public class MainClass {

	RecordOfEmployee re = new RecordOfEmployee();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainClass runner = new MainClass();

		while (true) {
			System.out.println(" ====== MENU ======");
			System.out.println("1. Add Employee");
			System.out.println("2. Display All Employee");
			System.out.println("0. EXIT");

			System.out.println("\n\n Enter Choice : ");

			int ch = Integer.parseInt(runner.sc.nextLine());
			switch (ch) {
			case 1:
				runner.insertEmployee();
				break;
			case 2:
				runner.displayEmployee();
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Wrong Choice");

			}
		}

	}// main end

	public void insertEmployee() {
		System.out.println("Enter ID ");
		int id = Integer.parseInt(sc.nextLine());

		System.out.println("Enter Name ");
		String name = sc.nextLine();

		System.out.println("Enter Salary ");
		int salary = Integer.parseInt(sc.nextLine());

		EmployeeClass e = new EmployeeClass(id, name, salary);
		re.addEmployee(e);

	}

	public void displayEmployee() {
		re.printEmployeeRecord();
	}

}// mainclass end

package Answer2;

import java.util.Collections;
import java.util.Scanner;

import Answer1.Menu;

public class Company {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		Company c=new Company();
		while (true) {
			System.out.println("====MENU====");
			System.out.println("1. to display list sorted by DOB in ascending order:");
			System.out.println("2. to display list sorted by DOB in descending order:");
			System.out.println("0. to exit:");
			int ch = Integer.parseInt(c.sc.nextLine());
			switch (ch) {
			case 1:
				Collections.sort(ManageEmployee.empLinkedList, new CompareAsc());
				System.out.println(ManageEmployee.empLinkedList);
				break;
			case 2:
				Collections.sort(ManageEmployee.empLinkedList, new CompareDesc());
				System.out.println(ManageEmployee.empLinkedList);
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice");

			}// switch end
		} // while end

	}

}

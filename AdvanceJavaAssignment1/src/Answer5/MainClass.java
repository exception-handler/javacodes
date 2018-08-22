package Answer5;

import java.util.Scanner;
import java.util.Vector;

import Answer1.Menu;

public class MainClass {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m=new MainClass();
		Employee e=new Employee();
		
		
		while (true) {
			System.out.println("====MENU====");
			System.out.println("1. to add input:");
			System.out.println("2. display:");
			System.out.println("0. to exit:");
			int ch = Integer.parseInt(m.sc.nextLine());
			switch (ch) {
			case 1:
				e.addInput();
				break;
			case 2:
				e.display();
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

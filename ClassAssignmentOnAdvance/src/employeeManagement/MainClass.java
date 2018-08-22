package employeeManagement;


import java.util.Scanner;

import utility.Connector;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MainClass main=new MainClass();
		ManageEmployee me=new ManageEmployee(); 
		while (true) {
			System.out.println("====MENU====");
			System.out.println("1. print empoyee information:");
			System.out.println("2. add employee:");
			System.out.println("3. display employee based on id");
			System.out.println("4. delete employee based on id");
			System.out.println("0. to exit:");
			int ch = Integer.parseInt(sc.nextLine());
			switch (ch) {
			case 1:me.printEmp();
				break;
			case 2:System.out.println("enter id");
			int id=Integer.parseInt(sc.nextLine());
			System.out.println("enter name");
			String name=sc.nextLine();
			System.out.println("enter address");
			String address=sc.nextLine();
			System.out.println("enter dept");
			String dept=sc.nextLine();
			System.out.println("enter salary");
			float salary=Float.parseFloat(sc.nextLine());
			Employee e=new Employee(id, name, address, dept, salary);
				try
				{me.addInList(e);
				}
				catch(UserDefine e1)
				{
					System.out.println(e1);
				}
				break;
			case 3:
				System.out.println("enter id to be searched");
				int id1=Integer.parseInt(sc.nextLine());
				me.display(id1);
				break;
			case 4:
				System.out.println("enter id to be searched");
				int id2=Integer.parseInt(sc.nextLine());
				me.delete(id2);
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

package Question1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientCode {

	Scanner sc = new Scanner(System.in);
	static final File F_1 = new File("Employee.txt");
	Employee emp[] = new Employee[2];

	public static void main(String[] args) throws Exception {
		ClientCode c = new ClientCode();
		c.readData();
	}// end main

	public void readData() throws Exception {
		FileReader fr = new FileReader(F_1);
		BufferedReader br = new BufferedReader(fr);

		String string = "";
		int i = 0, j = 0;
		while ((string = br.readLine()) != null) {
			// System.out.println(string);
			String str[] = string.split(",");
			emp[j] = new Employee(Integer.parseInt(str[i]), str[i + 1], Integer.parseInt(str[i + 2]));
			System.out.println(emp[j]);
			j++;
		} // end while

		System.out.println("Would you want to update your data");
		String decision = sc.nextLine();

		if (decision.equalsIgnoreCase("YES") || decision.equalsIgnoreCase("Y")) {
			updateData(emp);
		} else {
			System.out.println("Thanks for visiting");
		}

	}// readData

	public void updateData(Employee emp[]) throws Exception {
		System.out.println("\n0.Exit \n1.Name Change \n2.Age Change");
		System.out.println("Enter choice");
		int choice = Integer.parseInt(sc.nextLine());
		System.out.println("Enter emp Id to update Data");
		int empId = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getEmpId() == empId) {
				System.out.println("Employee :" + emp[i].getEmpName());
				switch (choice) {
				case 0:
					System.exit(0);
					break;
				case 1:
					System.out.println("Enter Name of Employee");
					String empName = sc.nextLine();
					emp[i].setEmpName(empName);
					break;
				case 2:
					System.out.println("Enter age of the employee");
					int empAge = Integer.parseInt(sc.nextLine());
					emp[i].setEmpAge(empAge);
					break;
				default:
					System.out.println("Wrong choice");
				}//switch end
			}//if end
		}//for end

		try {
			// FileOutputStream fos=new FileOutputStream(F_1);
			// PrintWriter pw=new PrintWriter(fos);
			FileWriter fw = new FileWriter(F_1);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < emp.length; i++) {
				
				bw.write(emp[i].getEmpId() + "," + emp[i].getEmpName() + "," + emp[i].getEmpAge() + "\n");
				System.out.println(emp[i].getEmpId() + "," + emp[i].getEmpName() + "," + emp[i].getEmpAge());
					
			}
			bw.close();
		} catch (Exception e) {

		}

		//printDetails();

	}//update data function end

/*	public void printDetails() throws Exception {
		FileReader fr = new FileReader(F_1);
		BufferedReader br = new BufferedReader(fr);

		String string = "";
		int i = 0, j = 0;
		while ((string = br.readLine()) != null) {
			// System.out.println(string);
			String str[] = string.split(",");
			emp[j] = new Employee(Integer.parseInt(str[i]), str[i + 1], Integer.parseInt(str[i + 2]));
			System.out.println(emp[j]);
			j++;
		} // end while
	}*/
}

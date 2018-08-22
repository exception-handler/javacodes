package Question2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.annotation.processing.Filer;

import Question1.Employee;

public class LowerAndUpper {

	Scanner sc = new Scanner(System.in);
	static final File F_1 = new File("LowerClassMan.txt");
	static final File F_2 = new File("UpperClassMan.txt");
	static Student[] student = new Student[2];

	public static void main(String[] args) throws IOException {

		LowerAndUpper lu = new LowerAndUpper();
		while (true) {
			System.out.println("\n0.Exit \n1.write Data \n2.read Data");
			System.out.println("Enter choice");
			int choice = Integer.parseInt(lu.sc.nextLine());

			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				lu.writeData();
				break;
			case 2:
				lu.readDate(student);
				break;
			default:
				System.out.println("wrong choice");
			}// switch end

		} // while end

	}// main end

	public void writeData() throws IOException {

		for (int i = 0; i < student.length; i++) {

			System.out.println("enter Data");
			System.out.println("enter Student ID");
			int idNumber = Integer.parseInt(sc.nextLine());
			System.out.println("enter first name");
			String firstName = sc.nextLine();
			System.out.println("enter last name");
			String lastName = sc.nextLine();
			System.out.println("enter credit hours");
			int noOfCreditHours = Integer.parseInt(sc.nextLine());

			student[i] = new Student(idNumber, firstName, lastName, noOfCreditHours);

			if (student[i].getNoOfCreditHours() < 60) {
				FileWriter fw = new FileWriter(F_1, true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(idNumber + "," + firstName + "," + lastName + "," + noOfCreditHours + "\n");
				System.out.println("Done... Lower");
				bw.close();
			} else {
				FileWriter fw = new FileWriter(F_2, true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(idNumber + "," + firstName + "," + lastName + "," + noOfCreditHours + "\n");
				System.out.println("Done... Upper");
				bw.close();
			}
		} // for end

	}// writeData

	public void readDate(Student student[]) throws NumberFormatException, IOException {
		while (true) {
			System.out.println("\n0.Exit \n1.read from upperclassman \n2.read from lowerclassman");
			System.out.println("Enter choice");
			int choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				FileReader fr = new FileReader(F_2);
				BufferedReader br = new BufferedReader(fr);
				printData(br);
				break;
			case 2:
				FileReader fr1 = new FileReader(F_1);
				BufferedReader br1 = new BufferedReader(fr1);
				printData(br1);
				break;
			default:
				System.out.println("wrong choice");
			}// switch end

		} // while end
	}

	public void printData(BufferedReader br) throws NumberFormatException, IOException {
		String string = "";
		int i = 0, j = 0;
		while ((string = br.readLine()) != null) {
			// System.out.println(string);
			String str[] = string.split(",");
			student[j] = new Student(Integer.parseInt(str[i]), str[i + 1], str[i + 2], Integer.parseInt(str[i + 3]));
			System.out.println(student[j]);
			j++;
		} // end while
	}
}

package ans7;

import java.util.Scanner;

public class UseCourse {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Department:");
		String department=sc.nextLine();
		System.out.println("enter Course Number");
		int courseNumber=Integer.parseInt(sc.nextLine());
		System.out.println("enter credits");
		int credits=Integer.parseInt(sc.nextLine());
		CollegeCourse cc=new CollegeCourse(department, courseNumber, credits);
		cc.display();
	}//main end
}//class end

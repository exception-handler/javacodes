package ans5;

import java.util.Scanner;

public class MainClass {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Restaurant r=new Restaurant();
		MainClass m = new MainClass();
		System.out.println("enter the dish id to searched: ");
		int dishId=Integer.parseInt(m.sc.nextLine());
		System.out.println(r.getDish(dishId));
	}

}

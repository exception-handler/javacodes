package ans1;

import java.util.Scanner;

public class GoTooFar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		for (int i = 0; i < array.length; i++) {
			System.out.println("enter " + i + " element");
			array[i] = Integer.parseInt(sc.nextLine());
		}
		try {
			System.out.println("display ouput");
			for (int i = 0; i < 10; i++) {
				System.out.println(array[i]);
			}
		} // try block end

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("you have gone too far");
		} // catch ends
	}// main end

}// class end

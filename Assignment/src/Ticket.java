import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the ticket number must be of 6 digits:");
		int num = sc.nextInt();
		int rem = 0, temp, lastDigit;
		temp = num;

		lastDigit = num % 10;
		temp = num / 10;
		num = temp % 7;
		System.out.println("remainder :" + num);

		if (num == lastDigit) {
			System.out.println("true");
		} else
			System.out.println("false");

	}

}

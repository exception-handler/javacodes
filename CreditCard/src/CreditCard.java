import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, temp = 0, rem = 0, sum = 0;
		int arr[] = new int[9];
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the card number should be in 9 digits: ");
		num = sc.nextInt();
		System.out.println("the number is :" + num);
		temp = num;
		for (int i = 0; i < arr.length; i++) {
			rem = num % 10;
			arr[i] = rem;
			num = num / 10;

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			if (i != 6)
				sum = sum + arr[i];

		}
		System.out.println("the sum of digits excluding 3rd digit is " + sum);

		if ((sum % 10) == arr[6]) {
			System.out.println("okay");
		} else {
			System.out.println("notok");
		}

	}// main end
}// class end

import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		Date d = new Date();
		d.inputDate();

	}// main end

	public void inputDate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre date");
		int date = sc.nextInt();
		if (date < 1 || date > 31) {
			System.out.println("invalid");
		} else {
			switch (date) {
			case 1:
			case 21:
			case 31:
				System.out.println(date + "st");
				break;
			case 2:
			case 22:
				System.out.println(date + "2nd");
				break;
			case 3:
			case 23:
				System.out.println(date + "rd");
				break;
			default:
				System.out.println(date + "th");

			}
		}
	}
}// class end

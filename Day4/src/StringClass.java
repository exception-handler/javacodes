import java.util.Scanner;

public class StringClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr1[] = {"dog","fuck"};
		StringClass s = new StringClass();
		System.out.println("enter string:");
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		String abuse;
		

		System.out.println("before eliminating abuse words");
		
		for (String string : arr) {
			System.out.print(string+" ");
			
		}
		for (int i = 0; i < arr.length; i++)

		{
			abuse = "";
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i].equalsIgnoreCase(arr1[j])) {
					int len = arr[i].length();
					while (len != 0) {
						abuse = abuse + '#';
						len--;

					}
					arr[i] = abuse;
				}
			}
		}
		
		
		System.out.println("\nafter eliminating abuse words");
		for (String data : arr) {
			System.out.print(data + " ");

		} // for each end

	}

}

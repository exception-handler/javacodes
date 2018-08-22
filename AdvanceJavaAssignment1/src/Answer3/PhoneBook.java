package Answer3;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

 
 HashMap<String,Long> hmap=
			new HashMap<>();
	public static void main(String[] args) {
		PhoneBook pb=new PhoneBook();
		Scanner sc=new Scanner(System.in);

		while (true) {
			System.out.println("====MENU====");
			System.out.println("1. Add a new phone book entry:");
			System.out.println("2. Search a Phone number:");
			System.out.println("0. to exit:");
			int ch = Integer.parseInt(sc.nextLine());
			switch (ch) {
			case 1:
				pb.phoneBookEntry();
				break;
			case 2:
				System.out.println("enter name to be searched: ");
				String name=sc.nextLine();
				pb.search(name);
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice");

			}// switch end
		} // while end

	}//main ends
	
	public void phoneBookEntry()
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc1.nextLine();
		System.out.println("Enter Phone number");
		Long number=sc1.nextLong();
		hmap.put(name, number);
		System.out.println("done");
	}
	
	public void search(String name)
	{
		
		if(hmap.containsKey(name))
		{
		Long number=hmap.get(name);
		System.out.println("Number is : "+number);
		}
		else
			System.out.println("entery not found!!!");
		
	}
}

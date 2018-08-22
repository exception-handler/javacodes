package Answer4;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Product {

	Hashtable<Integer, String> htable = new Hashtable<>();
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		Product p=new Product();
		while (true) {
			System.out.println("====MENU====");
			System.out.println("1. Add entry:");
			System.out.println("2. display:");
			System.out.println("3. search:");
			System.out.println("4. remove:");
			System.out.println("0. to exit:");
			int ch = Integer.parseInt(sc.nextLine());
			switch (ch) {
			case 1:
				p.enterData();
				break;
			case 2:
				
				p.display();
				break;
			case 3:
				System.out.println("enter id to be searched");
				int id=Integer.parseInt(sc.nextLine());
				p.search(id);
				break;
			case 4:
				System.out.println("enter id to be removed");
				int id1=Integer.parseInt(sc.nextLine());
				p.remove(id1);
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice");

			}// switch end
		} // while end

	}

	public void enterData()
	{
		int productId;
		String productName;
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter product Id");
		productId=Integer.parseInt(sc1.nextLine());
		System.out.println("enter product name");
		productName=sc1.nextLine();
		htable.put(productId, productName);
		System.out.println("DONE");
		
		
	}
	public void display()
	{
		Set<Integer> set = htable.keySet();
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println("ID is : " + key + " & NAME IS: "
					+ htable.get(key));

		}
		
	}

	public void search(int id)
	{
		if(htable.containsKey(id))
		{
			System.out.println(htable.get(id));
		}
	}
	public void remove(int id)
	{
		if(htable.containsKey(id))
		{
			htable.remove(id);
			System.out.println("data removed");
		}
	}
}

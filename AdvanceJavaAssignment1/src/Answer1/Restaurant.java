package Answer1;

import java.util.Scanner;

public class Restaurant {

	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		Restaurant r=new Restaurant();
		while (true) {
			System.out.println("====MENU====");
			System.out.println("1. to diplay dishes:");
			System.out.println("2. search a dish:");
			System.out.println("0. to exit:");
			int ch = Integer.parseInt(r.sc.nextLine());
			switch (ch) {
			case 1:
				Menu m=new Menu();
				m.print();
				//r.display();
				break;
			case 2:
				System.out.println("Enter dish id to be searched:");
				int id=Integer.parseInt(r.sc.nextLine());
				r.search(id);
				
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice");

			}// switch end
		} // while end

	}//main end

	/*public void display()
	{
	
		System.out.println(Menu.menuList);	
		}*/
	
	public void search(int id)
	{
		for (int i = 0; i <Menu.menuList.size(); i++) {
			
			if(id==Menu.menuList.get(i).getDishID())
			{
				System.out.println(Menu.menuList.get(i));
			}
		}
	}
	
}//class end

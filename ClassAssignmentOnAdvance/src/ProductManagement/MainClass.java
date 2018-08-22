package ProductManagement;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import utility.Connector;


public class MainClass {
	static ProjectManager pm=new ProjectManager();
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		MainClass main = new MainClass();
		Connection con = Connector.connection();
		System.out.println(con);
		if (con == null) {
			System.out.println("not connected");
		}
		while (true) {
			System.out.println("====MENU====");
			System.out.println("1. to add product:");
			System.out.println("2. display product:");
			System.out.println("3. delete product:");
			System.out.println("4. display all products:");
			System.out.println("0. to exit:");
			int ch = Integer.parseInt(sc.nextLine());
			switch (ch) {
			case 1:
				System.out.println("enter id: ");
				int productId = Integer.parseInt(sc.nextLine());
				System.out.println("enter name: ");
				String productName = sc.nextLine();
				System.out.println("enter price: ");
				float price  = Float.parseFloat(sc.nextLine());
				System.out.println("enter date in format dd-MM-yyyy: ");
				String manufacturingDate=sc.nextLine();
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
				Date d1=sdf.parse(manufacturingDate);
				Product p=new Product(productId, productName, price, d1);
				System.out.println(p);
				pm.addProduct(p,con);
				break;
			case 2:
				System.out.println("enter date of product to be searched in yyyy-mm-dd: ");
				String date=sc.nextLine();
				SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
				Date d2=sdf1.parse(date);
				java.sql.Date d3=new java.sql.Date(d2.getTime());
				pm.displayProduct(d3,con);
				break;
			case 3:
				System.out.println("enter id to be deleted: ");
				int productId1 = Integer.parseInt(sc.nextLine());
				pm.deleteProduct(productId1,con);
				break;
			case 4:
				pm.displayAllProducts(con);
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice");

			}// switch end
		} // while end

	}//main end

}//class end

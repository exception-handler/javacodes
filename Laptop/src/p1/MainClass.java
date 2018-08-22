package p1;

import java.util.Scanner;

public class MainClass {
	
	LaptopRecord lr=new LaptopRecord();
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
	MainClass runner=new MainClass();
	
	while(true)
	{
		System.out.println(" ====== MENU ======");
		System.out.println("1. Add Laptop");
		System.out.println("2. Search Laptop on the basis of Seial number");
		System.out.println("3. Search Laptop on the basis of price range");
		System.out.println("0. EXIT");

		System.out.println("\n\n Enter Choice : ");
		int ch=Integer.parseInt(runner.sc.nextLine());
		switch(ch)
		{
		case 1: runner.addLaptop();
			break;
		case 2: runner.searchSerial();
			break;
		case 3: runner.searchPriceRange();
			break;
		case 0:
			System.exit(0);
		default:
			System.out.println("wrong choice");
		}//switch end
	}//while end

	}// main end
	
	
	public void addLaptop()
	{
		System.out.println("enter the serial number of laptop: ");
		int serialNumber=Integer.parseInt(sc.nextLine());
		System.out.println("enter the brand name of laptop: ");
		String brandName=sc.nextLine();
		System.out.println("enter the cost of laptop: ");
		int cost=Integer.parseInt(sc.nextLine());
		
		Laptop l=new Laptop(serialNumber,brandName,cost);
		lr.addLaptop(l);
		
	}
	
	public void searchSerial()
	{	
		System.out.println("enter the serail number to be searched: ");
		int sr=Integer.parseInt(sc.nextLine());
		lr.searchThroughSerial(sr);
	}
	
	public void searchPriceRange()
	{
		System.out.println("enter the lower limit : ");
		int low=Integer.parseInt(sc.nextLine());
		System.out.println("enter the higher limit: ");
		int high=Integer.parseInt(sc.nextLine());
		lr.searchThroughPrice(low,high);
	}
	
	

}//main class end

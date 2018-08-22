package p3;

import java.util.Scanner;

public class MainClass {
	Scanner sc=new Scanner(System.in);
	LaptopRecord lr=new LaptopRecord();
	public static void main(String[] args) {
		MainClass runner=new MainClass();	
	while(true)
	{
		System.out.println(" ====== MENU ======");
		System.out.println("1. Add Laptop");
		System.out.println("2. Search Laptop");
		System.out.println("0. EXIT");
		
		System.out.println("enter the choice: ");
		int ch=Integer.parseInt(runner.sc.nextLine());
		
		switch(ch)
		{
		case 1: runner.addLapi();
			break;
		case 2: 
			System.out.println("===== MENU FOR SEARCH======");
			System.out.println("1. to search on the basis of serial number");
			System.out.println("2. to search on the basis of price range");
			int ch1=Integer.parseInt(runner.sc.nextLine());
				switch(ch1)
				{
				case 1:runner.searchLapiSerial();
					break;
				case 2:runner.searchLapiPrice();
					break;
				}
			break;
		case 0:
			System.exit(0);
			break;
		default :
		
		}//switch ends
	}//while ends
		

	}//main ends
	
	public void addLapi()
	{
		
		System.out.println("enter serial number:");
		int serialNumber=Integer.parseInt(sc.nextLine());
		System.out.println("enter brand Name:");
		String brandName=sc.nextLine();
		System.out.println("enter cost:");
		int cost=Integer.parseInt(sc.nextLine());
		laptop l=new laptop(serialNumber,brandName,cost);
		lr.addLaptop(l);
		
	}
	
	public void searchLapiSerial()
	{
		System.out.println("enter the serial number to be searched:");
		int serial=Integer.parseInt(sc.nextLine());
		lr.searchSerial(serial);
		
	}
	public void searchLapiPrice()
	{
		System.out.println("enter the lower limit of price");
		int lower=Integer.parseInt(sc.nextLine());
		System.out.println("enter the higher limit of price");
		int higher=Integer.parseInt(sc.nextLine());
		lr.searchPrice(lower,higher);
	}

}//main class ends

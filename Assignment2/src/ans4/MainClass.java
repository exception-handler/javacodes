package ans4;

import java.util.Scanner;

public class MainClass {
	Scanner sc=new Scanner(System.in);
	Account a=new Account();
	SavingsAccount sa=new SavingsAccount();
	CurrentAccount ca=new CurrentAccount();
	public static void main(String[] args) {
		MainClass runner = new MainClass();

	while (true) {
		System.out.println(" ====== MENU ======");
		System.out.println("1. add account");
		System.out.println("2. deposit amount");
		System.out.println("3. display balance");
		System.out.println("4. withdrawal amount");
		System.out.println("5. compute interest");
		System.out.println("0. EXIT");

		System.out.println("\n\n Enter Choice : ");
		
		int ch = Integer.parseInt(runner.sc.nextLine());
		switch (ch) {
		case 1:
			runner.addAccount();
			break;
		case 2:
			System.out.println("===MENU===");
			System.out.println("1. for savings account");
			System.out.println("2. for current account");
			System.out.println("enter choice:");
			int choice=Integer.parseInt(runner.sc.nextLine());
			switch(choice)
			{
			case 1: runner.dipositSaving();
			break;
			
			case 2: runner.dipositCurrent();
			break;
			}
			
			break;
			
		case 3:
			System.out.println("enter account number:");
			int acc=Integer.parseInt(runner.sc.nextLine());
			System.out.println("the balance is :"+runner.a.getBalance());	
			break;
			
		case 4:System.out.println("===MENU===");
		System.out.println("1. for savings account");
		System.out.println("2. for current account");
		System.out.println("enter choice:");
		int choice1=Integer.parseInt(runner.sc.nextLine());
		switch(choice1)
		{
		case 1: runner.withdrawalSaving();
		break;
		
		case 2: runner.withdrawalCurrent();
		break;
		}
			break;
			
		case 5:
			System.out.println("===MENU===");
			System.out.println("1. for savings account");
			System.out.println("2. for current account");
			System.out.println("enter choice:");
			int choice2=Integer.parseInt(runner.sc.nextLine());
			switch(choice2)
			{
			case 1: runner.interestSavings();
			break;
			
			case 2: System.out.println("No interest on current account");
			break;
			}
			
			break;
		case 0:
			System.exit(0);
		default:
			System.out.println("Wrong Choice");

		}//switch end
	}//while end


	}//main end
	
	public void addAccount()
	{
		System.out.println("enter account details :");
		System.out.println("enter account number: ");
		int accountNumber=Integer.parseInt(sc.nextLine());
		System.out.println("enter account holder name:");
		String customerName=sc.nextLine();
		System.out.println("enter account type:");
		String type=sc.nextLine();
		a.setData(customerName,accountNumber,type);
	}
	
	public void dipositSaving()
	{	
		System.out.println("enter account number:");
		int accountNumber=Integer.parseInt(sc.nextLine());
		System.out.println("enter amount to be deposited:");
		int amount=Integer.parseInt(sc.nextLine());
		sa.diposit(accountNumber, amount,a);
	}
	
	public void withdrawalSaving()
	{
		System.out.println("enter account number:");
		int accountNumber=Integer.parseInt(sc.nextLine());
		System.out.println("enter amount to be withdrawal:");
		int amount=Integer.parseInt(sc.nextLine());
		sa.withdrawal(accountNumber, amount,a);
	}
	
	public void dipositCurrent()
	{	
		System.out.println("enter account number:");
		int accountNumber=Integer.parseInt(sc.nextLine());
		System.out.println("enter amount to be deposited:");
		int amount=Integer.parseInt(sc.nextLine());
		ca.diposit(accountNumber, amount,a);
	}
	
	public void withdrawalCurrent()
	{
		System.out.println("enter account number:");
		int accountNumber=Integer.parseInt(sc.nextLine());
		System.out.println("enter amount to be withdrawal:");
		int amount=Integer.parseInt(sc.nextLine());
		ca.withdrawal(accountNumber, amount,a);
	}
	public void interestSavings()
	{
		System.out.println("enter account number:");
		int accountNumber=Integer.parseInt(sc.nextLine());
		sa.interestSavings(accountNumber, a);
	}

}//class end

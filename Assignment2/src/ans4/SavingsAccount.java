package ans4;

public class SavingsAccount extends Account {

	
	public void diposit(int accountNumber,int amount,Account a)
	{
		
	if(a.getAccountNumber()==accountNumber){	
			int newBalance=(a.getBalance()+amount);
			System.out.println("balance updated: new amount is "+newBalance);
			a.setBalance(newBalance);
	}
	
	else
		System.out.println("invalid account number");
	}
	
	
	public void withdrawal(int accountNumber,int amount,Account a)
	{
		if(a.getAccountNumber()==accountNumber){	
			int newBalance=(a.getBalance()-amount);
			System.out.println("balance updated: new amount is "+newBalance);
			a.setBalance(newBalance);
			
	}
	
	else
		System.out.println("invalid account number");
	
	}
	
	public void interestSavings(int accountNumber,Account a)
	{
		int balance=a.getBalance();
		balance=(int) (balance+((balance*0.9)/100));
		a.setBalance(balance);
		System.out.println("after intereset balance is:"+balance);
	}
}

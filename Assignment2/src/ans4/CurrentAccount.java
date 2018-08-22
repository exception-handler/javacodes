package ans4;

public class CurrentAccount extends Account{
	
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

}

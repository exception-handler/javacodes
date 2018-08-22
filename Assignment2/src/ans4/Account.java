package ans4;

public class Account {

	private String customerName;
	private int accountNumber;
	private String accountType;
	private int balance;
	private int amount;
	
	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public void setData(String name,int number,String type)
	{
		this.customerName=name;
		this.accountNumber=number;
		this.accountType=type;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getCustomerNumber() {
		return accountNumber;
	}


	public void setCustomerNumber(int customerNumber) {
		this.accountNumber = customerNumber;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	
	public void displayContent()
	{
	
		System.out.println(getBalance());
	}
	
	
}

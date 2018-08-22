package ans1;

import java.util.Scanner;

public class MainClass  {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		MainClass m=new MainClass();
		Ceo ceo=new Ceo("Rohit","CEO");
		Manager manager=new Manager("Jerry","Manager");
		
		m.displayDetialOfCeo(ceo);
		m.displayDetialOfManager(manager);
		
	}
	
	public void displayDetialOfCeo(Ceo c)
	{
		System.out.println("the role name of ceo is:"+c.getRoleName());
		System.out.println("the responsibility of ceo is:"+c.getResponsibility());
	}

		
	public void displayDetialOfManager(Manager m)
	{
		System.out.println("the role name of manager is:"+m.getRoleName());
		System.out.println("the responsibility of manager is:"+m.getResponsibility());
	}

}

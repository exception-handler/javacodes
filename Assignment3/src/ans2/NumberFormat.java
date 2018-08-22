package ans2;

import java.util.Scanner;

public class NumberFormat {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		try{
		int number;
		number=Integer.parseInt(sc.nextLine());
	
		}//try end
		
		catch(NumberFormatException e)
		{
			System.out.println("Error String cannot be converted to integer");
		}
	}

}

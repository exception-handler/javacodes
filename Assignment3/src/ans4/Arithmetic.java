package ans4;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
	Arithmetic a=new Arithmetic();
	a.exceptionDemo();
		
	}
	public void exceptionDemo()
	{
		Scanner sc=new Scanner(System.in);
		try {
		
			System.out.println("enter the number whose square root need to be calculated");
			int number=Integer.parseInt(sc.nextLine());
			if(number<0){

				//ArithmeticException a=new ArithmeticException();
				//throw a;
				throw new ArithmeticException();
			}
			else
			System.out.println(Math.sqrt(number));
		} catch (ArithmeticException e) {
			System.out.println("value less than 0");
			e.printStackTrace();
		}
		
	}

}

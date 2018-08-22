package ans3;

import java.util.Scanner;

public class ArrayException {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int size;	
		
		

		try {
			System.out.println("enter the size of array");
			size=Integer.parseInt(sc.nextLine());

			int array[]=new int[size];
			
		} catch (NegativeArraySizeException | NumberFormatException e) {
			
			System.out.println("error");
			e.printStackTrace();
		}//catch ends
	}

}

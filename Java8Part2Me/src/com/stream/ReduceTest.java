package com.stream;

import java.util.Arrays;

public class ReduceTest {

	public static void main(String[] args) {
		
		int myArray[]={1,5,8};
		int sum=Arrays.stream(myArray).sum();
		System.out.println("Sum is"+sum);
		long count=Arrays.stream(myArray).count();
		System.out.println("count is"+count);
		

	}

}

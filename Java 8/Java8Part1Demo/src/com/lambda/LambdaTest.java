package com.lambda;

public class LambdaTest {

	public static void main(String[] args) {
		
		Xyz x=new Xyz() {
			
			@Override
			public void print() {
				System.out.println("Inside Print");
				
			}
		};
		
x.print();

Xyz x1= ()->System.out.println("Hi");
x1.print();



	}

}

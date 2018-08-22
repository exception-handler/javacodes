package com.defaulttest;

public class Sam1 implements Male ,Person1 {
	@Override
	public void sayHello() {
		System.out.println("Overriden");
		Male.super.sayHello();
	}
	
	public static void main(String[] args) {
		Sam1 s =new Sam1();
		s.sayHello();

	}

	

	
	
}

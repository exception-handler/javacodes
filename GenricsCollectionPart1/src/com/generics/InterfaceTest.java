package com.generics;

public class InterfaceTest {
	public static void main(String[] args) {
		Add a=new Add();
		JoinString js=new JoinString();
		a.getData(20, 30);
		js.getData("Welcmoe"," to Java" );
		String res=js.joinString();
		System.out.println(" Sum is "+a.sum());
	System.out.println("Concatnated String "+res);

	}

}

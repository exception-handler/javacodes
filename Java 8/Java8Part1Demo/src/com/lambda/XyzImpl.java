package com.lambda;

public class XyzImpl implements Xyz {

	@Override
	public void print() {
		System.out.println(" Inside Print Method");
		
	}


	public static void main(String[] args) {
		XyzImpl x=new XyzImpl();
		x.print();

	}

}

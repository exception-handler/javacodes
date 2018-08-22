package com.lambda;

public class LamdaTest {

	public static void main(String[] args) {
	
	Printable  p= ()->System.out.println("Hi");
	p.disp();
	
	MathOperation m=(int x,int y)->
	{
		System.out.println("Inside Math Op");
		return x+y;
	};
	
	MathOperation1 m1=(num1,num2)->(num1-num2);
   int res=m.operation(30, 20);
	System.out.println("Result "+res);
	System.out.println("Result "+m1.sub(40, 20));

	}

}

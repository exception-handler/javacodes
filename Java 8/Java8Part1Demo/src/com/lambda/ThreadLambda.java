package com.lambda;
public class ThreadLambda {
public static void main(String[] args) {
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<5;i++)
				{
					System.out.println("Counter "+i);
				}
				
			}
		};
Thread t= new Thread(r);
t.start();

Runnable x2= ()->
{
	for(int i=1;i<5;i++)
	{
		System.out.println("Counter "+i);
	}
};

Thread t2= new Thread(x2);
t2.start();
	}

}
